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
                    
                    PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                    Policy policy = new Policy(policyNumber, providerName, policyHolder);
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
            System.out.println(policy); // Implicitly calls toString method
            System.out.println();
}
         System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");

         System.out.println("\nNumber of Smokers: " + smokersCount);
         System.out.println("Number of Non-Smokers: " + nonSmokersCount);
         
    }
}