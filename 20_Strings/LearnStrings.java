
public class LearnStrings {
    public static void main(String[] args) {

        String str = "Pratham Chauhan";
        String str1 = "PrathaM ChauhaN";
        // Original String
        // String Operation
        System.out.println("Upper Case :" + str.toUpperCase());
        System.out.println("Lower Case :" + str.toLowerCase());

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        // Concatenation
        String FirstName = "Pratham";
        String LastName = "Chauhan";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);

        // Compares string lexiographically
        System.out.println(str.compareTo(str1));

    }

}
