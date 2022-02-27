import java.util.Scanner;
public class hw38 {
    public static void main(String[] args){
        System.out.print("輸入月份");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        if(input <1 || input >12){
            System.out.println("月份不存在");
            return;
        }
        switch (input){
            case 1:
            case 12:
            case 2:
                System.out.println("\r冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("\r春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("\r夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("\r秋天");
                break;
            
        }
    }
}
