public class Hosteler extends Student {
  public Hosteler(int studentId, String studentName, String departmentName, String gender, String category, double collegeFee) {
      super(studentId, studentName, departmentName, gender, category, collegeFee);
  }

  @Override
  public double calculateTotalFee(int distance) {
      return collegeFee + 20000;
  }
}
