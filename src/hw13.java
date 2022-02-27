public class hw13 {
    public static void main(String[] args){
        float f = 6235.748f; //宣告f變數與i變數
        int i = 13;

        System.out.println("兩數相加＝"+add(f,i)+"\r\n兩數相除＝"+divide(f,i)); //呼叫函數，並直接印出結果。
    }
    static float add(float f,int i){ //相加的函數
        return f + i;
    }
    static float divide(float f, int i){//相除的函數
        return f / i;
    }
}
