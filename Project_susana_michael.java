           //@param policyNumber is the policy Number  
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
