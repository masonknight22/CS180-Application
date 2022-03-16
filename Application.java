import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Full Name:");

        String Name = scan.nextLine();

        System.out.println("Date of Birth:");

        String Birth = scan.nextLine();

        System.out.println("Expected Salary:");

        double Salary = scan.nextDouble();
scan.nextLine();

        System.out.println("Social Security Number:");

        String SSN = scan.nextLine();

        System.out.println("Phone Number:");

        String phone = scan.nextLine();


        System.out.println("Email:");

        String Email = scan.nextLine();

        System.out.println("Street Address:");

        String Address = scan.nextLine();

        System.out.println("Zip Code:");

        String Zip = scan.nextLine();

        System.out.println("City and State");

        String City = scan.nextLine();

// string name
        int space = Name.indexOf(' ');

        String Fname = Name.substring(0,space);

        char ch1 = Character.toLowerCase(Fname.charAt(0));

        String Lname = Name.substring(space+1);



// end split of name string



        System.out.printf(Fname.substring(0,1).toUpperCase() + Fname.substring(1).toLowerCase() + " "
                + Lname.substring(0,1).toUpperCase() + Lname.substring(1).toLowerCase() + "\n");

        System.out.printf("Date of Birth: " + Birth.substring(0,2) +"/"
                + Birth.substring(3,5) + "/" + Birth.substring(6,10) +"\n");

        System.out.printf("Expected Salary: $%.2f\n", Salary);

        System.out.printf("SSN: XX-XXX-" + SSN.substring(5,9)+"\n");

        System.out.printf("Phone: (" + phone.substring(0,3) + ")" + phone.substring(3,6)
                + "-" + phone.substring(6,10) + "\n" );

        System.out.printf("Email: %s\n", Email);

        System.out.printf("Full Address:\n");

        System.out.printf("%s\n", Address);

        System.out.printf("%s\n", City);

        System.out.printf("%s\n", Zip);



        System.out.printf("Username: " + ch1 + Lname + Birth.substring(3,5) + "\n");






        
















    }
}
