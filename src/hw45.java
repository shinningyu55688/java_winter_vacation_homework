import java.util.Scanner;
public class hw45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入二維陣列的大小（用空格分出）");
        int [][]arr = new int[sc.nextInt()][sc.nextInt()];
        for(int i = 0 ; i<arr.length ; i++){
            for(int a = 0; a< arr[i].length;a++){
            System.out.print("\r["+i+"]"+"["+a+"]的值：");
            arr[i][a] = sc.nextInt();
            }
        }

        System.out.println("陣列最大值為："+findMax(arr));        
    }
    static int findMax(int[][] arr){
        int max = 0;    //宣告最大值
        for(int i = 0 ; i<arr.length ; i++){ //從陣列的第一個數開始找
            for(int a = 0; a< arr[i].length;a++){
                if(max < arr[i][a])//若陣列該數大於max，則他就是當下最大值
                max=arr[i][a];
            }
        }
        return max; //回傳最大值
    }
    
}
