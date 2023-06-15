import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Project_Dylan_Bolick {
    public static void main(String[] args) {
        List<Policy> policies = new ArrayList<>();
        int smokersCount = 0;
        int nonSmokersCount = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                try {
                    String policyNumber = scanner.nextLine();
                    String providerName = scanner.nextLine();
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    int age = Integer.parseInt(scanner.nextLine());
                    String smokingStatus = scanner.nextLine();
                    double height = Double.parseDouble(scanner.nextLine());
                    double weight = Double.parseDouble(scanner.nextLine());
                    scanner.nextLine(); // Read the empty line after each policy

                    Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                    policies.add(policy);
                    
                    if (smokingStatus.equalsIgnoreCase("smoker")) {
                      smokersCount++;
                  } else if (smokingStatus.equalsIgnoreCase("non-smoker")) {
                      nonSmokersCount++;
                  }
              } catch (NoSuchElementException e) {
                  System.out.println("Invalid file format: Insufficient lines for a complete policy entry.");
                  return;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        // Print information for each policy
        for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
            System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getPolicyholderSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
            System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
        }
        
        System.out.println("\nNumber of Smokers: " + smokersCount);
        System.out.println("Number of Non-Smokers: " + nonSmokersCount);
    }
}
