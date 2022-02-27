import java.util.Scanner;
public class hw44 {
    public static void main(String[] args){
        System.out.print("請輸入陣列長度");
        Scanner sc = new Scanner(System.in);//要求使用者給出陣列長
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];//宣告該長度的陣列
        for(int i = 0; i < arr.length ; i++){
            //並且利用迴圈來讓使用者輸入其中之值
            System.out.print("\r請輸入第"+(i+1)+"個值(索引值為"+i+")");
            arr[i] = sc.nextInt();
        }
        System.out.println("最大索引值"+(max_index(arr)));//輸出索引值
        //將陣列丟入max_index計算
    }
    static int max_index(int[] arr){
        int index = 0;//宣告索引值
        int max = 0;//宣告最大值
        for(int i = 0 ; i < arr.length ; i++){
            //利用迴圈讀出陣列中所有的內容
           if(max < arr[i]){
               //若陣列該數大於max，則他就是當下最大值
               max = arr[i];
               index = i;
           } 
        }
        return index;//回傳索引值
    }
}
