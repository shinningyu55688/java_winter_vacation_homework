import java.util.Scanner;
public class hw41 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("1+2+..."+num+"為"+addto(num));
        // 呼叫addto方法，並直接輸出
    }
    static int addto(int n){
        int sum =0;// 先定義總和為整數0
        for(int i =1 ; i<=n ; i++){
            sum += i;
            // 迴圈從1到n，每一個數都加進總和中
        }
        return sum;//回傳總和
    }
}

