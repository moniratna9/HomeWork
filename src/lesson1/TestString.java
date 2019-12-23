package lesson1;


public class TestString {
    public static void main(String[] args) {
        System.out.println("...........Exercise 1......");

        String myStatement = "I am a programmer";
        String[] myStm = myStatement.split(" ");
        for (String prog : myStm) {
            if (prog.equals("programmer"))
                System.out.println(prog);
        }

        int numberOfWords = myStm.length;
        System.out.println("Total number of wprds is: " + numberOfWords);
        System.out.println("Replaced sentence is: " + myStatement.replace("r", "f"));

        System.out.println("...........Exercise 2......");

        String myName = "Ratna";
        int count = 0;
        char[] letters = myName.toCharArray();
        for (char c : letters) {
            count++;
        }
        System.out.println(count);


        System.out.println("...........Exercise 3......");

        String[] names = {"Mohammad", "John", "Ferdous", "Abul", "Ratna", "Mareeha", "Ruslan", "Himani"};
        System.out.println(names[1].equals("JOHN"));
        System.out.println(names[1].equalsIgnoreCase("JOHN"));

        String[] friends = {"Happy", "Lipi", "Tania", "Tuli", "Mimi"};
        System.out.println("1.Length of array is: " + friends.length);
        System.out.println("2. Name on third position is:" + friends[2]);
        System.out.println("3.Name of my friends are:");
        for (String name : friends) {
            System.out.println(name);
        }
        boolean withA = friends[1].startsWith("A");
        System.out.println("4.Name on 2nd position, start with 'A': " + withA);
    }
}


