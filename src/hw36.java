import java.util.Scanner;
public class hw36{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String correctPassword = "1234"; //正確密碼定義1234
        //因int 無法紀錄0開頭之密碼，因此使用String

        String input = "";//使用者輸入
        int incorrect = 0; //錯誤次數
        do{
            System.out.print("請輸入密碼：");
            input = sc.next();
            if(correctPassword.equals(input)){
                System.out.println("\n密碼輸入正確，歡迎使用本系統~!!");
                break;
            }else{
                ++incorrect;
                if(incorrect>=3){ //錯誤次數>3執行
                    System.out.println("密碼輸入超過三次! !");
                    break;
                }
            }
        }while(true);
    }
}
