import java.util.Scanner;
public class hw39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long val = sc.nextLong();  //讀入長整數
        String valStr = String.valueOf(val);//轉換為String，方便看數字出現頻率
        int[] count = new int[10];//陣列，各數字儲存出現次數
        for(int i = 0; i<valStr.length();i++){ 
            // 使用陣列的長度，去一個一個算該數字出現的次數為多少
            switch(valStr.charAt(i)){
                case '0'://使用字元去看
                    count[0]++;
                    break;
                case '1':
                    count[1]++;
                    break;
                case '2':
                    count[2]++;
                    break;
                case '3':
                    count[3]++;
                    break;
                case '4':
                    count[4]++;
                    break;
                case '5':
                    count[5]++;
                    break;
                case '6':
                    count[6]++;
                    break;
                case '7':
                    count[7]++;
                    break;
                case '8':
                    count[8]++;
                    break;
                case '9':
                    count[9]++;
                    break;
            }
        }
        for(int index = 0;index < count.length;index++){//運用迴圈來跑出各數字出現頻率
            System.out.println("數字"+index+"出現的頻率為"+count[index]);
        }

    }
}