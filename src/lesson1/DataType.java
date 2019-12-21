package lesson1;

public class DataType {


    public static void main(String[] args) {
        byte minDrinkingAge = 21;
        int monthlySalary = 8500;
        int distance= 238900;
         long nationalDebt= 22000000000000l;
         float interestRate= 3.746f;
          double itemPrice;
          boolean genderFemale= true;
          char nameInitial= 'R';

        System.out.println("The minimum legal age to purchase alcohol in USA is: " + minDrinkingAge + " years.");
        System.out.println("Average monthly salary of an automation engineer in NYC is: $" + monthlySalary);
        System.out.println("Distance between Earth and Moon is: " + distance +" miles");
        System.out.println("The national debt of the United State is: " + nationalDebt + " dollers.");
        System.out.println("The interest rate in Chase bank is: "+  interestRate);
        System.out.println("We should use  double data-types for item price  to avoid inaccuracy");
        System.out.println("My gender is female :"+ genderFemale);
        System.out.println("My name initial is: " +nameInitial);

    }


}
