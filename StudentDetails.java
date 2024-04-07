import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();

        System.out.println("Enter Student name:");
        String studentName = scanner.next();

        System.out.println("Enter Department name:");
        String departmentName = scanner.next();

        System.out.println("Enter gender:");
        String gender = scanner.next();

        System.out.println("Enter category (DayScholar/Hosteler):");
        String category = scanner.next();

        System.out.println("Enter College fee:");
        double collegeFee = scanner.nextDouble();

        System.out.println("Enter Bus number (for DayScholar):");
        int busNumber = scanner.nextInt();

        System.out.println("Enter the distance (for DayScholar):");
        int distance = scanner.nextInt();

        Student student;
        if (category.equalsIgnoreCase("DayScholar")) {
            student = new DayScholar(studentId, studentName, departmentName, gender, category, collegeFee, busNumber);
        } else if (category.equalsIgnoreCase("Hosteler")) {
            student = new Hosteler(studentId, studentName, departmentName, gender, category, collegeFee);
        } else {
            System.out.println("Invalid category.");
            return;
        }

        double totalFee = student.calculateTotalFee(distance);
        System.out.println("Total College fee is " + totalFee + " in java");

        scanner.close();
    }
}
