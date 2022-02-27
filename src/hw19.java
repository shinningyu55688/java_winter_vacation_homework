import java.io.*;
public class hw19 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader buf;
        String str;
        char ch;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入一個字元");
        str = buf.readLine();
        ch=str.charAt(0);//取得字串str的第0個位置之字元
        //請在此輸入程式碼，以完成本題之需求
        System.out.println("***"+ch+"***");
    }
}
