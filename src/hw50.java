import java.util.Scanner;
public class hw50 {
    public static void main(String[] args){
        //計算梯形面積
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數(1)或浮點數(2)");
        int type = sc.nextInt();
        //整數模式
        if(type == 1){
            //提示使用者輸入梯形各項數值
            System.out.println("請輸入上底邊長");
            int upper = sc.nextInt();
            System.out.println("請輸入下底邊長");
            int base = sc.nextInt();
            System.out.println("請輸入梯形高");
            int height = sc.nextInt();
            System.out.println("梯形面積為："+trapezoid(upper,base,height));
        
    }
        //浮點模式
        else if(type == 2){
            System.out.println("請輸入上底邊長");
            float upper = sc.nextFloat();
            System.out.println("請輸入下底邊長");
            float base = sc.nextFloat();
            System.out.println("請輸入梯形高");
            float height = sc.nextFloat();
            System.out.println("梯形面積為："+trapezoid(upper,base,height));

    }
        else{
            System.out.println("輸入錯誤");
        }
        


    }
    //以下為多載化梯形面積計算
    static float trapezoid(int upper,int base,int height){
        return (upper+base)*height/2; 
    }
    static float trapezoid(float upper,float base,float height){
        return (upper+base)*height/2;
    }
}
