public class EvenDigitSum {
    
    public static int getEvenDigit(int number){
        if(number < 0){
            return -1;
        }

        int sumEvenNums = 0;

        while(number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 ==0){
                sumEvenNums += lastDigit;
            }
            number /= 10;
        }
        return sumEvenNums;
    }
}
