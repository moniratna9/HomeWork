public class Variable {
    public static void main(String[] args) {
        String myStatment="I am a good programmer";
        int myStatmentlenght=myStatment.length();
        System.out.println(myStatmentlenght);
        String lowerCaseStatment=myStatment.toLowerCase();
        System.out.println(lowerCaseStatment);
        String uperCaseStatment=myStatment.toUpperCase();
        System.out.println(uperCaseStatment);
        String name="mohammad";
        boolean checking=myStatment.contains(name);
        System.out.println(checking);

        //String str_Sample = "This is Index of Example";
        //Character at position
        System.out.println("At 5th index is: " + myStatment.charAt(5));
        boolean isEmpty=myStatment.isEmpty();
        System.out.println(isEmpty);
        String company="technosoft";
/**/
        System.out.println( myStatment.compareTo(company));
        System.out.println ( "If message start with welcome: " + myStatment.startsWith("welcome"));
        System.out.println("If message end with goodby: "+ myStatment.endsWith("goodby"));




    }
}
