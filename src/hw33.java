public class hw33 {
    public static void main(String args[]){
        int sum = 0;
        for(int i = 1 ; i <= 50 ; i++){
            if(i%2 == 0 ){  //當i為偶數時，會是i^2去-sum
                sum -= Math.pow(i,2);
            }else{  //當i危基數時，會+=i^2
                sum += Math.pow(i,2);
            }
        }
        System.out.println("答案為"+sum);
    }
    
}
