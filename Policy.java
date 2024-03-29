public class Policy {
   private static int policyCount = 0;
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   
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
    * @param policyHolder  the policy holder object
    */
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
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
   
   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }
   
   public void setPolicyHolder(PolicyHolder policyHolder) {
      this.policyHolder = policyHolder;
   }
   
   public static int getPolicyCount() {
      return policyCount;
   }
     
      @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Policy Number: ").append(policyNumber).append("\n");
       sb.append("Provider Name: ").append(providerName).append("\n");
       sb.append(policyHolder.toString());
       sb.append("Policy Price: $").append(String.format("%.2f", policyHolder.calculatePolicyPrice())).append("\n");
       return sb.toString();
   }
}