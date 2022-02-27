public class hw35 {
    public static void main(String[] args){
        int rope = 1500;//繩長
        int target = 6;//目標繩長（到此數停止）
        int days = 0;//天數
        do{
            rope = rope / 2;//每次折一半
            days++;
            if(rope < target)//當繩長小於目標停止
            break;
        }while(true);//持續執行直到break;
        System.out.println("要花"+days+"天");
    }
}
