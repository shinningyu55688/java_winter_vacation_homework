import java.util.Scanner;
public class hw24 {
    public static void main(String[] args){
        final double pi = Math.PI;//定義一個常數，PI=3.14...
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入圓的半徑：");
        double r = sc.nextDouble();
        double ans = Math.pow(r,2)*pi;//用Math.pow來算平方，並讀入Scanner
        System.out.println("\r圓面積為："+ans);//輸出
    }
    
}
