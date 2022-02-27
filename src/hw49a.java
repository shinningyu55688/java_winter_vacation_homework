public class hw49a {
    public static void main(String[] args){
        long result = fib(50);
        System.out.println(result);
    }
    static long fib(int n){
        long[] nArr = new long[n+1];//宣告一個長度為n+1的陣列，若不+1 fib(50)會超出陣列範圍
        if(n<2){ //費氏數列定義：fib(0) = 0, fib(1) = 1, fib(n) = fib(n-1) + fib(n-2)
            return n;
        }
        nArr[0]=0;//設定第0個數字為0
        nArr[1]=1;//設定第1個數字為1，因為fib(0) = 0, fib(1) = 1，共後續迴圈計算
        for(int i = 2;i<=n;i++){ //計算fib(n)，起始值為2
            nArr[i] = nArr[i-1] + nArr[i-2];
        }
        return nArr[n];//回傳費氏數列的第n個數
    }
}
