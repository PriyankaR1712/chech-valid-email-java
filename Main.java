import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        String email ;

        Scanner scanner = new Scanner(System.in);
        System.out.print(";enter your Email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String name = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") +1);

            System.out.println("username is : " + name);
            System.out.println("domain is : " + domain);
        }
        else{
            System.out.println("Enter a valid email");
        }


        scanner.close();
    }
}