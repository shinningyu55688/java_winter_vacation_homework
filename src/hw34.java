public class hw34 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        //99乘法表格式＝axb
        do{//控制a行
            do{//控制b列
                System.out.print(a+"x"+b+"="+a*b+"\t");//直接印出a*b
                b++;

            }
            while(b<=9);
            b=1; //重設乘數
            a++;
            System.out.println();
        }
        while(a<=9);
    }
}
