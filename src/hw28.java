import java.util.Scanner;
public class hw28 {
    public static void main(String[] args){
        System.out.print("輸入學生成績");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 80 && score <= 100){
            System.out.println("\rA級");
        }else if(score >= 60){
            System.out.println("\rB級");
        }else if(score >= 0){
            System.out.println("\rC級");
        }

    }
}
