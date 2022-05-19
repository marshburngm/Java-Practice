import java.util.ArrayList;

public class FactorPrinter {
    
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }else{

        ArrayList<Integer> factors = new ArrayList<>();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){// watch modulo placement***
                factors.add(i);
            }else{
                continue;
            }
        }
        
        for(int num : factors){
            System.out.println(num);
        }
    }
}
}
