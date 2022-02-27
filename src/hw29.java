public class hw29 {
    public static void main(String[] args) {
        for(int i = 5 ; i> 0  ; i--){ //印出五行*
            for(int a = i ; a > 0 ; a--){//第一行印出五* 後減1
                System.out.print("*");
            }
            System.out.println();//換行
        }
    }
}
