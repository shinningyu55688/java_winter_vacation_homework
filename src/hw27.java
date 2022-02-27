import java.util.Scanner;
public class hw27 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入數字：");
        int input = sc.nextInt();
        if(input >0){   //正數定義：>0
            System.out.println("\r此數為正數");
        }else if(input < 0){//複數定義：<0
            System.out.println("\r此數為負數");
        }else{//0不是正數也不是負數
            System.out.println("\r此數為0");
        }
    }
}
