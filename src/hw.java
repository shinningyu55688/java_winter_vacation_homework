import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入4個位數之密碼："); // 輸出字串
        int psw1 = sc.nextInt(); // 先請使用者定義正確密碼
        System.out.print("請再輸入4個位數之密碼:"); // 輸出字串
        int error = 0; // 設error為輸入錯誤之次數
        while (error < 3) { // while迴圈(當error>3時跳出迴圈)
            int psw2 = sc.nextInt(); // 使用者輸入密碼
            if (psw1 == psw2) // 相同
            {
                System.out.println("密碼輸入正確，歡迎使用本系統~!!"); // 輸出字串
                break;
            } else { // 不同
                System.out.print("請輸入密碼:"); // 輸出字串
                error++; // error+1
            }
        }
        if (error == 3) // 當error=3時，執行下面的輸出
            System.out.println("\r\n密碼輸入超過三次!!"); // 輸出字串
    }
}