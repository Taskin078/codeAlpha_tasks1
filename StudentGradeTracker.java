import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        // Create an ArrayList to store student grades
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Input loop to allow the teacher to enter grades
        System.out.println("Enter student grades. Type -1 to stop.");
        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            if (grade == -1) {  // Exit condition
                break;
            }
            grades.add(grade);  // Add grade to the list
        }
        
        // Check if grades were entered
        if (grades.size() == 0) {
            System.out.println("No grades entered.");
            return;
        }

        // Calculate average, highest, and lowest scores
        double total = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);
        
        for (double grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Compute average
        double average = total / grades.size();

        // Output the results
        System.out.println("\nGrade Report:");
        System.out.printf("Average grade: %.2f\n", average);
        System.out.printf("Highest grade: %.2f\n", highest);
        System.out.printf("Lowest grade: %.2f\n", lowest);

        // Close scanner
        scanner.close();
    }
}
