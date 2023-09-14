import java.util.Scanner;

public class PolicyDemo
{       
    public static void main(String[] args)
   {           
          int policyNumber;
          String providerName;
          String policyHolderFirstName;
          String policyHolderLastName;
          int policyHolderAge;
          double heightInInches;
          double weightInPounds;
          String smokingStatus;
          double policyPrice;
          Scanner keyboard = new Scanner(System.in);

          System.out.println("Please enter the Policy Number:");
          policyNumber = keyboard.nextInt();
          
          keyboard.nextLine();
                    
          System.out.print("Please enter the Provider Name:");
          providerName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder First Name:");
          policyHolderFirstName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder Last Name:");
          policyHolderLastName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder’s Age:");
          policyHolderAge = keyboard.nextInt();
          
          System.out.print("Please enter the Policyholder’s Height (in inches):");
          heightInInches = keyboard.nextDouble();
          
          System.out.print("Please enter the Policyholder’s Weight (in pounds):");
          weightInPounds = keyboard.nextDouble();
          
          keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder’s Smoking Status:");
          smokingStatus = keyboard.nextLine();
            
          Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, smokingStatus, heightInInches, weightInPounds);


          System.out.println();
     
         
          
          System.out.println("Policy Number: " + policyNumber);
          System.out.println("Provider's Name: " + providerName);
          System.out.println("Policyholder's first Name: " + policyHolderFirstName);
          System.out.println("Policyholder's last name: " + policyHolderLastName);
          System.out.println("Policyholder's age: " + policyHolderAge);
          System.out.println("Policyholder's smoking status: " + smokingStatus);
          System.out.println("Policyholder's height (in inches): " + heightInInches);
          System.out.println("Policyholder's weight (in pounds): " + weightInPounds);
          System.out.printf("Policyholder's BMI: $%.2f\n" , policy.getBMI());
          System.out.printf("Policy price: $%.2f\n" , policy.getPolicyPrice());
          
          
          }



}