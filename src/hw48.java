import java.util.Scanner;
public class hw48 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一數字");
        long input = sc.nextLong();//使用長整數
        long result = addUp(input);//將數字丟入方法後結果回傳
        System.out.println("\r運算結果："+result);
    }
    static long addUp(long n){
        if(n <= 1){
            return n;
        }
        return n+addUp(n-1);//n加上比他小1的數字，並且重複這個運算
        
    }
}
