import java.util.Scanner;

public class WeightedGradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int n = scanner.nextInt();

        // Initialize the variables to store the sum of the grades and the sum of the weights
        double sumGrades = 0.0;
        double sumWeights = 0.0;

        // Loop through the grades and weights
        for (int i = 0; i < n; i++) {
            // Prompt the user to enter the grade and weight
            System.out.print("Enter grade and weight (e.g. 90 1.0): ");
            double grade = scanner.nextDouble();
            double weight = scanner.nextDouble();

            // Add the weighted grade to the sum of grades
            sumGrades += grade * weight;

            // Add the weight to the sum of weights
            sumWeights += weight;
        }

        // Calculate the weighted grade average
        double average = sumGrades / sumWeights;

        // Print the result
        System.out.println("Weighted grade average: " + average);
    }
}

