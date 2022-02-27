public class hw31 {
    public static void main(String[] args){
        int targetNum = 60;
        int lastPrime = 0;
        for(int i = 1; i < targetNum ; i++){ //第一層迴圈：由1一直找到目標數
            int count = 0;
            for(int a = 1 ; a <= i ; a++){ //第二層迴圈：由a到i
                if(i % a == 0){    //如果除以該數整除，就將count+1
                    count++;
                }
            }
            if(count == 2){ //質數條件：只能被1跟自己整除，因此count為2時，代表可整除
                System.out.print(i+",");//再來印出該質數
                lastPrime = i; //記錄下最後的質數
            }
        }
        System.out.println("最大質數"+ lastPrime);
    }
}
