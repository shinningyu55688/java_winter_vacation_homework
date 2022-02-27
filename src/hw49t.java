import java.util.Scanner;
public class hw49t {
 public static void main(String[] args)
 {
  System.out.print("請輸入一數字:"); //輸出字串
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt(); //讀入字串並存進n
  System.out.print(fibonacci(n)); //印出addNum method之結果
 }
 static long fibonacci(int n) //把n傳入long fib method
 {
  if(n<2)
  {
       return n;
  }
  else 
  {
        return fibonacci(n-1)+fibonacci(n-2);
  }
}
}