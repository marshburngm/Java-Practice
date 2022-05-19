
public class AlphaDriver {
        public static void main(String[] args){

            //Speed Converter Testing
            long lit = SpeedConverter.toMilesPerHour(10.5);
            System.out.println(lit);
            SpeedConverter.printConversion(10.5);
            
            //MegaBytes Converter Testing
            MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

            //BorkingDog Testing
            boolean result = BarkingDog.shouldWakeUp(false, 2);
            System.out.println(result);

            //LeapYear Testing
            boolean resultOne = LeapYear.isLeapYear(2022);
            System.out.println(resultOne);

            //Decimalcomparator Testing
            boolean resultTwo = DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175);
            System.out.println(resultTwo);

            //EqualSumchecker Testing
            boolean resultThree = EqualSumChecker.hasEqualSum(25,25,50);
            System.out.println(resultThree);

            //TeenNumberChecker Testing
            System.out.println(TeenNumberChecker.isTeen(9, 99, 19));

            //Testing NumberInWord
            NumberInWord.printNumberInWord(5);

            //Testing SumThreeAndFive
            SumThreeAndFive.sumThreeFive();

            //Testing SumOddRange
            System.out.println(SumOddRange.sumOdd(1, 100));

            //Testing NumberPalindrome
            System.out.println(NumberPalindrome.isPalindrome(11212));

            //Testing FirstLastDigitSum
            System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(6589887));

            //Testing EvenDigitSum;
            System.out.println(EvenDigitSum.getEvenDigit(22225));

            //Testing Shared Digit

            //Testing Last Digit Checker
            System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));

            //Testing Greatest Common Divisor
            System.out.println(GreatestCommonDenominator.getGreatestCommonDivisor(12, 30));

            //Testing FactorPrinter.
            FactorPrinter.printFactors(32);

            //Testing PerfectNumber
            System.out.println(PerfectNumber.isPerfectNumber(6));

            //Testing LargestPrime
            System.out.println(LargestPrime.getLargestPrime(21));
        
    }
}
