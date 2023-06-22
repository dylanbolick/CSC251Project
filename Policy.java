public class Policy {
   private String policyNumber;
   private String providerName;
   
     /**
     * Constructs a Policy object with default values for all fields.
     */
   public Policy() {
      policyNumber = "";
      providerName = "";
      }
 
 /**
     * Constructs a Policy object with the specified values for all fields.
     *
     * @param policyNumber              the policy number
     * @param providerName              the provider name
       */
 public Policy(String policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
   this.policyNumber = policyNumber;
   this.providerName = providerName;
   
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
}

