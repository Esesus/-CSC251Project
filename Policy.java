public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   private static int numberOfPolicies = 0;
  
   
   //No-arg constructor that explicitly initializes all fields
   
public Policy()
   {
      policyNumber = "";
      providerName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
      numberOfPolicies++;


   }
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   */
public Policy(String pNumber, String pName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
     
public static int getNumberOfPolicies() {
   return numberOfPolicies++;
}  
  
   //getters//
   
   //@return The Policy Number   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
    
    // @return The Policy Provider's Name
    public String getProviderName()
   {
      return providerName;
   }
   
    public String getSmokingStatus()
   {
      return smokingStatus;
   }

   
   //setters//
   //@param pNumber The Policy Number
   
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   
  // @param pName The Policy Provider's name
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   //@param sStatus The Policy Provider's smoking status
    public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }

   
   
   //@return The Policyholder's smoking status
   
  
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }

      
      
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(smokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }

   public String toString() {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName +
             "\nPolicy Price: " + getPrice();
   }
     
}