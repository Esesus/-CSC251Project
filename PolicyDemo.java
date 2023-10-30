import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      int numberOfPolicies= 0 ;

      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //ArrayList to store Policy holder objects

      ArrayList<PolicyHolder> policyHolderList = new ArrayList<PolicyHolder>();
      
      //create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, age,  smokingStatus,  height,  weight));
         numberOfPolicies++;

         //create a Policyholder object and add it to our Array
         policyHolderList.add(new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight));
         
      }
      //modifying the demo class to include both Policy Policy holder information
      for (int i = 0; i < policyList.size(); i++) {
          
          System.out.println(policyList.get(i));    
          System.out.println("First Name: " + policyHolderList.get(i).getFirstName());
          System.out.println("Last Name: " + policyHolderList.get(i).getLastName());
          System.out.println("Age: " + policyHolderList.get(i).getAge());
          System.out.println("Smoking Status: " + policyHolderList.get(i).getSmokingStatus());
          System.out.println("Height: " + policyHolderList.get(i).getHeight() + " inches");
          System.out.println("Weight: " + policyHolderList.get(i).getWeight() + " pounds");
          System.out.printf("BMI: %.2f\n", policyHolderList.get(i).getBMI());
          System.out.println();
      }
            
      
       //print out the number of smokers and non-smokers
      System.out.println("There were " + numberOfPolicies + " Policy objects created. ");
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
      System.out.println();
   }   
   
}

   
   