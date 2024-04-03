import java.time.LocalDate;
import java.util.Scanner;

public class Employee {
    public static boolean isfirstNameValid(String name){

        boolean valid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,15}$");
    
        System.out.println("Name: " + name + "\nValid: " + valid);
    
        return valid;
    }
   
    public static boolean islastNameValid(String name){
        boolean valid = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");    
        return valid;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String empid = null;
        String firstname = null;

        System.out.print("Employee id: ");
            empid = scan.nextLine();

            System.out.print("First name: ");
            firstname = scan.nextLine();
            if(isfirstNameValid(firstname))
                ;

        do{
            System.out.print("Lastname: ");
            String lastname = scan.nextLine();
        }
        while (condition) {
            
        }
        System.out.print("Email: ");    
            String email = scan.nextLine();

        System.out.print("Total contact numbers: ");
            int contacts = scan.nextInt();
            String phoneNum[] = new String[contacts];
            String phoneNumber = null;
            for(int i=0;i<contacts;i++){
                System.out.print("Phone Number " + (i+1) +": " + scan.nextLine());
            }
        
        System.out.print("DOJ: ");
            String doj =scan.nextLine();
            LocalDate DOJ = LocalDate.parse(doj);
        
        System.out.println("Salary: ");
            int salary = scan.nextInt();

        scan.close();
}
}
