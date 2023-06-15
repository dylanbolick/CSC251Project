public class Policy {
   private String policyNumber;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
     /**
     * Constructs a Policy object with default values for all fields.
     */
   public Policy() {
      policyNumber = "";
      providerName = "";
      policyholderFirstName = "";
      policyholderLastName = "";
      policyholderAge = 0;
      policyholderSmokingStatus = "";
      policyholderHeight = 0.0;
      policyholderWeight = 0.0;
      
 }
 
 /**
     * Constructs a Policy object with the specified values for all fields.
     *
     * @param policyNumber              the policy number
     * @param providerName              the provider name
     * @param policyholderFirstName     the policyholder's first name
     * @param policyholderLastName      the policyholder's last name
     * @param policyholderAge           the policyholder's age
     * @param policyholderSmokingStatus the policyholder's smoking status
     * @param policyholderHeight        the policyholder's height in inches
     * @param policyholderWeight        the policyholder's weight in pounds
     */
 public Policy(String policyNumber, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
   this.policyNumber = policyNumber;
   this.providerName = providerName;
   this.policyholderFirstName = policyholderFirstName;
   this.policyholderLastName = policyholderLastName;
   this.policyholderAge = policyholderAge;
   this.policyholderSmokingStatus = policyholderSmokingStatus;
   this.policyholderHeight = policyholderHeight;
   this.policyholderWeight = policyholderWeight;
   
   
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

    /**
     * Returns the policyholder's first name.
     *
     * @return the policyholder's first name
     */
 public String getPolicyholderFirstName() {
     return policyholderFirstName;
    }

    /**
     * Sets the policyholder's first name.
     *
     * @param policyholderFirstName the policyholder's first name to set
     */
 public void setPolicyholderFirstName(String policyholderFirstName) {
     this.policyholderFirstName = policyholderFirstName;
    }

    /**
     * Returns the policyholder's last name.
     *
     * @return the policyholder's last name
     */
 public String getPolicyholderLastName() {
     return policyholderLastName;
    }

    /**
     * Sets the policyholder's last name.
     *
     * @param policyholderLastName the policyholder's last name to set
     */
 public void setPolicyholderLastName(String policyholderLastName) {
     this.policyholderLastName = policyholderLastName;
    }

    /**
     * Returns the policyholder's age.
     *
     * @return the policyholder's age
     */
 public int getPolicyholderAge() {
     return policyholderAge;
    }

    /**
     * Sets the policyholder's age.
     *
     * @param policyholderAge the policyholder's age to set
     */
 public void setPolicyholderAge(int policyholderAge) {
     this.policyholderAge = policyholderAge;
    }

    /**
     * Returns the policyholder's smoking status.
     *
     * @return the policyholder's smoking status
     */
 public String getPolicyholderSmokingStatus() {
     return policyholderSmokingStatus;
    }

    /**
     * Sets the policyholder's smoking status.
     *
     * @param policyholderSmokingStatus the policyholder's smoking status to set
     */
 public void setPolicyholderSmokingStatus(String policyholderSmokingStatus) {
     this.policyholderSmokingStatus = policyholderSmokingStatus;
    }

    /**
     * Returns the policyholder's height in inches.
     *
     * @return the policyholder's height in inches
     */
 public double getPolicyholderHeight() {
     return policyholderHeight;
    }

    /**
     * Sets the policyholder's height in inches.
     *
     * @param policyholderHeight the policyholder's height in inches to set
     */
 public void setPolicyholderHeight(double policyholderHeight) {
     this.policyholderHeight = policyholderHeight;
    }

    /**
     * Returns the policyholder's weight in pounds.
     *
     * @return the policyholder's weight in pounds
     */
 public double getPolicyholderWeight() {
     return policyholderWeight;
    }

    /**
     * Sets the policyholder's weight in pounds.
     *
     * @param policyholderWeight the policyholder's weight in pounds to set
     */
 public void setPolicyholderWeight(double policyholderWeight) {
     this.policyholderWeight = policyholderWeight;
    }

    /**
     * Calculates and returns the policyholder's BMI (Body Mass Index).
     *
     * @return the policyholder's BMI
     */
 public double calculateBMI() {
     double heightInInchesSquared = Math.pow(policyholderHeight, 2);
     return (policyholderWeight * 703) / heightInInchesSquared;
    }

    /**
     * Calculates and returns the policy price based on the policyholder's information.
     *
     * @return the policy price
     */
 public double calculatePolicyPrice() {
     double baseFee = 600;
     double additionalFee = 0;

     if (policyholderAge > 50) {
         additionalFee += 75;
        }

     if (policyholderSmokingStatus.equalsIgnoreCase("smoker")) {
         additionalFee += 100;
        }

     double bmi = calculateBMI();
     if (bmi > 35) {
         additionalFee += (bmi - 35) * 20;
        }

     return baseFee + additionalFee;
    }
}