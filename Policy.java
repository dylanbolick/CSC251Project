public class Policy {
   private static int policyCount = 0;
   private String policyNumber;
   private String providerName;
   
   /**
    * Constructs a Policy object with default values for all fields.
    */
   public Policy() {
      policyNumber = "";
      providerName = "";
      policyCount++;
   }
 
   /**
    * Constructs a Policy object with the specified values for all fields.
    *
    * @param policyNumber the policy number
    * @param providerName the provider name
    */
   public Policy(String policyNumber, String providerName) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      policyCount++;
   }
 
   /**
    * Returns the policy number.
    *
    * @return the policy number
    */
   public String getPolicyNumber() {
      return policyNumber;
   }

   /**
    * Sets the policy number.
    *
    * @param policyNumber the policy number to set
    */
   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
   }

   /**
    * Returns the provider name.
    *
    * @return the provider name
    */
   public String getProviderName() {
      return providerName;
   }

   /**
    * Sets the provider name.
    *
    * @param providerName the provider name to set
    */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }
   
   public static int getPolicyCount() {
      return policyCount;
   }
     
   @Override
   public String toString() {
      return "Policy{" +
              "policyNumber='" + policyNumber + '\'' +
              ", providerName='" + providerName + '\'' +
              '}';
   }
}