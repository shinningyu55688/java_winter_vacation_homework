public class hw49b {
    public static void main(String[] args) {
        System.out.println(fib(50));

    }
    static long fib(int n){
        if(n<2) //當n小於2時，回傳n，因為費氏數列定義：fib(0) = 0, fib(1) = 1
        return n;
        else{
            //fib(n) = fib(n-1) + fib(n-2)
            return fib(n-1)+fib(n-2);
        }
    }
}
