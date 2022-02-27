import java.util.Scanner;
public class hw17 {
    public static void main(String[] args) {
        System.out.print("輸入兩數：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("兩數之差："+num_differ(num1,num2));

    }
    static int num_differ(int num1, int num2) {
        return num1-num2;
    }
}
