import java.util.Scanner;
public class hw42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("回傳結果為"+even(n));
    }
    static boolean even(int n){
        if(n % 2 == 0)
        return true;//偶數定義：%2會=0
        else
        return false;
    }
}
