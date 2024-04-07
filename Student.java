abstract class Student {
  protected int studentId;
  protected String studentName;
  protected String departmentName;
  protected String gender;
  protected String category;
  protected double collegeFee;

  public Student(int studentId, String studentName, String departmentName, String gender, String category, double collegeFee) {
      this.studentId = studentId;
      this.studentName = studentName;
      this.departmentName = departmentName;
      this.gender = gender;
      this.category = category;
      this.collegeFee = collegeFee;
  }

  public abstract double calculateTotalFee(int distance);
}
