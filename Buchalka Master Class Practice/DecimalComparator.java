public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int convertedValOne = (int) (num1 * 1000);//1000 to account for conversion of up to three decimal places
        int convertedValTwo = (int) (num2 * 1000);

        if(convertedValOne == convertedValTwo){
            return true;
        }else{
            return false;
        }
    }
}
