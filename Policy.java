import java.util.Scanner;

public class Policy
{
       //initializing variables
          private int policyNumber;
          private String providerName;
          private String policyHolderFirstName;
          private String policyHolderLastName;
          private int policyHolderAge;
          private double heightInInches;
          private double weightInPounds;
          private String smokingStatus;
          private double BMI;
          private double policyPrice;
                          
       public static void main(String[] args)
         {
          Scanner keyboard = new Scanner(System.in);
          
               
       
          System.out.println("Please enter the Policy Number:");
          int policyNumber = keyboard.nextInt();
          
          keyboard.nextLine();
                    
          System.out.print("Please enter the Provider Name:");
          String providerName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder First Name:");
          String policyHolderFirstName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder Last Name:");
          String policyHolderLastName = keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder’s Age:");
          int policyHolderAge = keyboard.nextInt();
          
          System.out.print("Please enter the Policyholder’s Height (in inches):");
          double heightInInches = keyboard.nextDouble();
          
          System.out.print("Please enter the Policyholder’s Weight (in pounds):");
          double weightInPounds = keyboard.nextDouble();
          
          keyboard.nextLine();
          
          System.out.print("Please enter the Policyholder’s Smoking Status:");
          String smokingStatus = keyboard.nextLine();

          Policy policy = new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName,
           policyHolderAge, smokingStatus, heightInInches, weightInPounds); 
          
          policy.displayAccountInfo();
          
          

 }        
           //constructors with no arguments         
           public Policy() {                  
              this.policyNumber = 0;
              this.providerName = "";
              this.policyHolderFirstName = "";
              this.policyHolderLastName = "";
              this.policyHolderAge = 0;
              this.smokingStatus = "";
              this.heightInInches = 0;
              this.weightInPounds = 0;
              this.BMI = 0;
              this.policyPrice = 0;
            }
            
          //constructors with arguments
          public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
                        int policyHolderAge, String smokingStatus, double heightInInches, double weightInPounds){
           
           this.policyNumber = policyNumber;
           this.providerName = providerName;
           this.policyHolderFirstName = policyHolderFirstName;
           this.policyHolderLastName = policyHolderLastName;
           this.policyHolderAge = policyHolderAge;
           this.smokingStatus = smokingStatus;
           this.heightInInches = heightInInches;
           this.weightInPounds = weightInPounds;
           this.BMI = (weightInPounds * 703 ) / (heightInInches * heightInInches);
           this.policyPrice = calculatePolicyPrice();
        }         
 
   
            //getters
            public int getPolicyNumber(){
               return policyNumber;
            }
            
            public String getProviderName(){
               return providerName;
            }
      
            public String getPolicyholderFirstName(){
               return policyHolderFirstName;
            }
            
            public String getPolicyholderLastName(){
               return policyHolderLastName;
            }
                 
            public int getPolicyholderAge(){
               return policyHolderAge;
            }
      
            public String getSmokingStatus(){
               return smokingStatus;
            }
      
            public double getHeightInInches(){
               return heightInInches;
            }
      
            public double getWeightInPounds (){
               return weightInPounds;
            }
           
            public double getBMI() {
               return BMI =  (weightInPounds * 703 ) / (heightInInches * heightInInches);
            }
            
           
           //setters     
           public void setPolicyNumber(int policyNumber){
               this.policyNumber = policyNumber;
           }
           
           public void setProviderName(String ProviderName){
               this.providerName = ProviderName;
           }
           
           public void setPolicyholderFirstName(String policyholderFirstName){
               this.policyHolderFirstName = policyHolderFirstName;
           }
      
           public void setPolicyholderLastName(String PolicyholderLastName){
               this.policyHolderLastName = policyHolderLastName;
           }
      
            public void setPolicyholderAge(String PolicyholderAge){
               this.policyHolderAge = policyHolderAge;
           }
      
            public void setSmokingStatus(String SmokingStatus){
               this.smokingStatus = smokingStatus;
           }
            public void setHeightInInches(String HeightInInches){
               this.heightInInches = heightInInches;
           }
      
            public void setWeightInPounds(String WeightInPounds){
               this.weightInPounds = weightInPounds;
           }
            
   
         public double calculatePolicyPrice(){
               double baseFee = 600.0;
               double additionalFee = 0.0;
               double BMI = 0.0;
          if (smokingStatus.equalsIgnoreCase("smoker")) {
               additionalFee += 100.0; 
             }
          if(BMI > 35) {
               additionalFee += (BMI-35) * 20;
            }
           return additionalFee + baseFee;
           
           }   
                            
       
            
     public void displayAccountInfo(){
          
          System.out.println("Policy Number: " + policyNumber);
          System.out.println("Provider's Name: " + providerName);
          System.out.println("Policyholder's first Name: " + policyHolderFirstName);
          System.out.println("Policyholder's last name: " + policyHolderLastName);
          System.out.println("Policyholder's age: " + policyHolderAge);
          System.out.println("Policyholder's smoking status: " + smokingStatus);
          System.out.println("Policyholder's height (in inches): " + heightInInches);
          System.out.println("Policyholder's weight (in pounds): " + weightInPounds);
          System.out.println("Policyholder's BMI: " + BMI);
          System.out.println("Policy price: " + policyPrice);
          
          
          }
} 
                 
      
      
      
      
      

