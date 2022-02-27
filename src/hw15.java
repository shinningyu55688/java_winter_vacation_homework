import java.util.Scanner;
public class hw15 {
    public static void main(String[] args) {
        System.out.print("請輸入一字串：");
        Scanner sc = new Scanner(System.in);//使用者輸入內容用Scanner讀取
        String input = sc.nextLine();

        for(int i = input.length()-1; i >= 0; i--) {//使用for迴圈，讓初始值是字串的尾端(要-1)，弄到0停止
            System.out.print(input.charAt(i));//從字串尾端印出到字串頭
        }
        System.out.println();//最後輸出一空行
    }
}
