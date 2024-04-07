public class DayScholar extends Student {
  private int busNumber;

  public DayScholar(int studentId, String studentName, String departmentName, String gender, String category, double collegeFee, int busNumber) {
      super(studentId, studentName, departmentName, gender, category, collegeFee);
      this.busNumber = busNumber;
  }

  @Override
  public double calculateTotalFee(int distance) {
      if (distance > 10) {
          return collegeFee + 2000;
      } else {
          return collegeFee;
      }
  }
}
