public class Main
{
    public static void main(String[] args)
    {

        int intOperandA = 9;
        int intOperandB = 2;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The modulus of using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo + "\n");


        double doubleOperandA = 18;
        double doubleOperandB = 4;
        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of using doubles of " + intOperandA + " + " + intOperandB + " is " + doubleSum);
        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of using doubles of " + intOperandA + " * " + intOperandB + " is " + doubleProduct);
        double doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of using doubles of " + intOperandA + " - " + intOperandB + " is " + doubleDifference);
        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of using doubles of " + intOperandA + " / " + intOperandB + " is " + doubleQuotient + "\n");


        double costOfLunch = 12.50;
        int numOfKids = 4;
        String isRaining = "No";
        double gasPrice = 3.29;
        int favNumber = 15;
        double shoeSize = 10.5;
        String birthMonth = "August";
        String fullName = "Kyle Tassiello";

       
        System.out.println("The cost of my lunch was $" + costOfLunch);
        System.out.println("The number of kids in my family is " + numOfKids);
        System.out.println("Is it raining today: " + isRaining);
        System.out.println("The price of gas is $" +gasPrice);
        System.out.println("My favorite number is " + favNumber);
        System.out.println("My shoe size is " + shoeSize);
        System.out.println("My birth month is " + birthMonth);
        System.out.println("My full name is " + fullName);

    }
}