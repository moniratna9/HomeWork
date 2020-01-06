import java.util.Scanner;

public class TestingCondition {
    public static void main(String[] args) {

        System.out.println("........Exercise 1.......");

        boolean isGustOneVagan = true;
        boolean isGustTwoVagan = true;
        if (isGustOneVagan == true && isGustTwoVagan == false) {
            System.out.println("Offer up vagan dishes");
        } else if (isGustOneVagan == false && isGustTwoVagan == false) {
            System.out.println("Offer some mix vegitable,fruits,juse");
        } else {
            System.out.println("offer non vage item");
        }

        System.out.println("........Exercise 2........");

        boolean pMode = true;
        String parkingType = "parallel";

        if (pMode == false) {
            System.out.println("parking mode");
        } else if (parkingType.equals("parallal")) {
            System.out.println("i can park between two car");
        } else {
            System.out.println("invalid mode type");
        }
        boolean dMode = true;
        if (dMode == false) {
            System.out.println("i can put drive type to Snow type,Sport type or Regular type");
        } else {
            System.out.println("invalid mode type");

        }
        boolean Nmode = true;
        if (Nmode == true) {
            System.out.println("i can put car in car wash station");
        } else {
            System.out.println("invalid mode type");
        }
        boolean Rmode = true;
        if (Rmode == false) {
            System.out.println("Back camera is active");
        } else {
            System.out.println("invalid mode type");
        }

        System.out.println(".......exercise 3........");


        int dividend = 49;
        int divisor = 15;
        int reminder = dividend % divisor;
        if (reminder == 0) {
            System.out.println("Divisible by 15");
        } else {
            System.out.println("Its not divisible by 15, the reminder is :" + reminder + ".");
        }

        System.out.println("........exercise 4........");


        String name = "Ratna";
        int numberOfWord = name.length();
        if (numberOfWord > 8) {
            System.out.println(name.replace("a", "A"));

        } else {
            System.out.println(name.toUpperCase());
        }

        System.out.println("........Exercise 6......");
        Scanner in = new Scanner(System.in);
        System.out.print("Please entter item: ");
        String item = in.nextLine();
        switch (item) {
            case "Milk":
                System.out.println("Aisle Eight");
                break;
            case "Egg":
                System.out.println("Aisle Eight");
                break;

            case "French Fries":
                System.out.println("Aisle Seven");
                break;
            case " Candy":
                System.out.println("Aisle Three");
                break;
            case "Frozen Pizza ":
                System.out.println("Aisle seven");
                break;
            case " Donuts":
                System.out.println("Aisle Eight");
                break;
            case "Diapers":
                System.out.println("Aisle One");
                break;
            case "Apple":
                System.out.println("Aisle two");
                break;
            case "Orange":
                System.out.println("Aisle two");
                break;
            default:
                System.out.println("Out of stock");
        }
    }
}












