import java.util.Scanner;
public class hw43 {
    public static void main(String[] args){
        // prompt the user to type in a integer array
        System.out.println("請輸入陣列長度");
        Scanner sc = new Scanner(System.in);//要求使用者給出陣列長
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];//宣告該長度的陣列
        for(int i = 0; i < arr.length ; i++){
            //並且利用迴圈來讓使用者輸入其中之值
            System.out.print("\r請輸入第"+(i+1)+"個值");
            arr[i] = sc.nextInt();
        }
        // output the odd numbers in the array
        System.out.println("奇數數量："+odd_numbers(arr));
    }

    static int odd_numbers(int[] arr){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
}
