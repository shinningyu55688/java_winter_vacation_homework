import java.util.Scanner;
public class hw23 {
    public static void main(String args[]){
        System.out.println("｜長方形面積計算器｜");//Title
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入長方形的長：");//要求使用者輸入長方形長
        int width = sc.nextInt();
        System.out.print("\r\n請輸入長方形的寬：");//要求使用者輸入長方形寬，/r/n為換行（因上一句沒有ln）
        int height = sc.nextInt();
        System.out.println("\r\n長方形的面積為："+width*height);
    }
}
