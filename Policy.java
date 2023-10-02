public class Policy
{
       //declare variables
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
           this.policyPrice = getPolicyPrice();
        
          }         
 
   
<<<<<<< Updated upstream
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
=======
           //setters  
           //@param policyNumber is the policy Number  
>>>>>>> Stashed changes
           public void setPolicyNumber(int policyNumber){
               this.policyNumber = policyNumber;
           }
           //@param ProviderName is the Provider's name
           public void setProviderName(String ProviderName){
               this.providerName = ProviderName;
           }
           //@param policyHolderFirstName is the policy holder's first name
           public void setPolicyholderFirstName(String policyholderFirstName){
               this.policyHolderFirstName = policyHolderFirstName;
           }
           //@param policyHolderLastName is the policy holder's last name
           public void setPolicyholderLastName(String PolicyholderLastName){
               this.policyHolderLastName = policyHolderLastName;
           }
           //@param policyHolderAge is the policy holder's age
            public void setPolicyholderAge(String PolicyholderAge){
               this.policyHolderAge = policyHolderAge;
           }
           //@param smokingStatus is the policy holder's smoking status
            public void setSmokingStatus(String SmokingStatus){
               this.smokingStatus = smokingStatus;
           }
           //@param heightInInches is the policy holder's height in inches
            public void setHeightInInches(String HeightInInches){
               this.heightInInches = heightInInches;
           }
           //@param weightInPounds is the policy holder's weight in pounds
            public void setWeightInPounds(String WeightInPounds){
               this.weightInPounds = weightInPounds;
           }
           
            //getters
            //@return is the policy number           
            public int getPolicyNumber(){
               return policyNumber;
            }
            
            //@return is the provider name
            public String getProviderName(){
               return providerName;
            }
            
            //@return is the policy holder first Name          
            public String getPolicyholderFirstName(){
               return policyHolderFirstName;
            }
            
            //@return is the policy holder last name
            public String getPolicyholderLastName(){
               return policyHolderLastName;
            }
            
            //@return is the policy holder age    
            public int getPolicyholderAge(){
               return policyHolderAge;
            }
            
            //@return is the smoking status of the policy holder
            public String getSmokingStatus(){
               return smokingStatus;
            }
            
            //@return is the height of the policy holder
            public double getHeightInInches(){
               return heightInInches;
            }
            
            //@return is the weight of the policy holder
            public double getWeightInPounds (){
               return weightInPounds;
            }
            //@return is the BMI of the policy holder
            public double getBMI() {
               return BMI =  (weightInPounds * 703 ) / (heightInInches * heightInInches);
            }
            
           

            
         //calculate policy price by definining the constants
             public double getPolicyPrice(){
             
               final int age_Limit = 50;
               final int BMI_limit = 35;

               final double BASE_PRICE = 600;
               final double ADDITIONAL_FEE_AGE = 75;
               final double ADDITIONAL_FEE_SMOKING = 100;
               final double ADDITIONAL_FEE_PER_BMI = 20;
               

          
               double policyPrice = BASE_PRICE;
               
            //if user age is above age limit     
              if(policyHolderAge > age_Limit) 
              policyPrice += ADDITIONAL_FEE_AGE; 
               
              if(smokingStatus.equalsIgnoreCase("smoker")) 
              policyPrice += ADDITIONAL_FEE_SMOKING; 
            
              //call the getBMI method
              if(getBMI() > BMI_limit) 
              policyPrice += ((getBMI() - BMI_limit) * ADDITIONAL_FEE_PER_BMI); 
         
              return policyPrice;
     
                  
           }   
                            
 } 
                 
      
      
      
      
      

