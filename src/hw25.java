import java.util.Scanner;
public class hw25 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("請輸入整數，判斷是否能被5、6同時整除：");
       int input = sc.nextInt(); //輸入整數 
       if(input % 5 == 0 && input % 6 == 0){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
    
}
