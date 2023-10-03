import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;


public class PolicyDemo
{       
      public static void main(String[] args)   throws IOException       
       {
      
            ArrayList<Policy> policies = new ArrayList<Policy>();
            int smokersCount = 0;
            int nonSmokersCount = 0;
          
          try {
               File file = new File("PolicyInformation.txt");
               Scanner scanner = new Scanner(file);
               String policyNumber, providerName, policyHolderFirstName, policyHolderLastName, smokingStatus;
               int policyHolderAge, heightInInches, weightInPounds;
               
                while(scanner.hasNextLine()) 
                {
                  policyNumber = scanner.nextLine();
                  providerName = scanner.nextLine();
                  policyHolderFirstName = scanner.nextLine();
                  policyHolderLastName = scanner.nextLine();
                  policyHolderAge = Integer.parseInt(scanner.nextLine());
                  heightInInches = Integer.parseInt(scanner.nextLine());
                  weightInPounds = Integer.parseInt(scanner.nextLine());
                  smokingStatus = scanner.nextLine(); 
                  
                  Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, 
                  policyHolderLastName, policyHolderAge, smokingStatus, heightInInches, weightInPounds);
                  policies.add(policy);
                  
                   
                                   
                  if (smokingStatus.equalsIgnoreCase("smoker")) {
                     smokersCount++;
                  } else if (smokingStatus.equalsIgnoreCase("non-smoker")) {
                     nonSmokersCount++;
                  }

               }
          
               scanner.close();
           } catch (IOException ex) {
                     System.out.println("There was a problem with the file:" + ex.getMessage());
                     return;
               }
               
               
             for (int i = 0; i < policies.size(); i++) 
             {      
                  System.out.println();
                  System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
                  System.out.println("Provider's Name: " + policies.get(i).getProviderName());
                  System.out.println("Policyholder's First Name: " + policies.get(i).getPolicyHolderFirstName());
                  System.out.println("Policyholder's Last Name: " + policies.get(i).getPolicyHolderLastName());
                  System.out.println("Policyholder's Age: " + policies.get(i).getPolicyHolderAge());
                  System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
                  System.out.println("Policyholder's Height (in inches): " + policies.get(i).getHeightInInches());
                  System.out.println("Policyholder's Weight (in pounds): " + policies.get(i).getWeightInPounds());
                  System.out.printf("Policyholder's BMI: %.2f\n", policies.getBMI());
                  System.out.printf("Policy Price: $%.2f\n", policies.getPolicyPrice());
       
                 }           
                  System.out.println("Smokers Count: " + smokersCount);
                  System.out.println("Non-Smokers Count: " + nonSmokersCount);   
                               
               } 
                  
}    

