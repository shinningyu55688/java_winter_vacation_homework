import java.util.Scanner;
public class hw46 {
    public static void main(String[] args){
        // prompt user to type in  a 2 dimensional integer array
        System.out.println("請輸入二維陣列長度（空格隔開）");
        Scanner sc = new Scanner(System.in);//要求使用者給出陣列長
        int arr1Length = sc.nextInt();
        int arr2Length = sc.nextInt();
        int[][] arr = new int[arr1Length][arr2Length];//宣告該長度的陣列
        for(int i = 0; i < arr.length ; i++){
            //並且利用迴圈來讓使用者輸入其中之值
            for(int a = 0; a < arr[i].length ; a++){
                System.out.print("\r請輸入["+i+"]"+"["+a+"]值");
                arr[i][a] = sc.nextInt();
            }
        }
        System.out.println("平均為"+calcAverage(arr));
    }

    static int calcAverage(int[][] arr){
        int sum = 0; //先宣告總和為0
        for(int i = 0 ; i < arr.length ; i++){  //從陣列的第一個數開始找。
            for(int a = 0 ; a < arr[i].length ; a++){//尋找二維陣列的數，從第一個開始找。
                sum += arr[i][a]; //將陣列數值加進總和中。
            }
        }
        return sum / (arr.length * arr[0].length);//將總和除以二維陣列的總長度。
    }
}
