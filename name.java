import java.util.Scanner;

class name {
    public static void main(String[] args) {
        
        //Setting First Name
        
        Scanner fn = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = fn.nextLine();
        
        //Setting Last Name
        
        Scanner ln = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastName = ln.nextLine();
        
        //Printing result
        
        System.out.println("Hello, " + firstName + " " + lastName);

        //Closing scanner object

        scan1.close();
    }
}