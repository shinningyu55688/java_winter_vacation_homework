import java.util.Scanner;
public class hw26 {
    public static void main(String[] args){
        System.out.print("請輸入一個字元");
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //無nextChar方法，因此先輸入字串
        char inputChar = input.charAt(0);//再來看第零個字元是什麼

        if(inputChar >= '0' && inputChar <= '9'){ //將數字用單引號，可得char
            System.out.println("\r此字元是數字");
        }else if(inputChar >= 'a' && inputChar <= 'z'||inputChar >= 'A'||inputChar <= 'Z'){ //用單引號隔英文，可得char
            System.out.println("\r此字元是英文字母");
        }

    }
    
}
