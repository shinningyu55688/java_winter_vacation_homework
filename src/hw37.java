import java.util.Scanner;
public class hw37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入星期幾：");
        int day = sc.nextInt();
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("\r今天要上課");
                break;
            case 6:
            case 7:
                System.out.println("\r今天是週末");
                break;
            default:
                System.out.println("\r輸入錯誤");
        }
    }
}
