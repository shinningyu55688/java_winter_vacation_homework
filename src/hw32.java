import java.util.Scanner;
public class hw32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入任意整數");
        int inputNum = sc.nextInt();
        System.out.println("\n因數為："); 
        for(int i = 1; i <= inputNum; i++){ //利用for迴圈
            if(inputNum % i == 0){ //若該數能與輸入值整除，則印出
                System.out.print(i+" ");
            }
        }
        System.out.println();   //讓輸出好看點
        sc.close();
    }
}
