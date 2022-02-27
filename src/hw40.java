public class hw40 {
    public static void main(String[] args){
        System.out.println("1加到10="+add2Ten());
    }
    static int add2Ten(){
        int sum = 0;
        for(int i = 1 ; i<= 10 ; i++){//運用for迴圈，算出1到10的數值
            sum += i;//將算到的數值加進總和（sum）
        }
        return sum;
    }
}
