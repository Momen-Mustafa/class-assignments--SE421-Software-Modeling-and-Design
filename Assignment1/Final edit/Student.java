public class Student extends User{
    private double gpa;

    public Student(int studentID, String firstName, String lastName, String dateOfJoinAUIS, double gpa,String userType){
        super(studentID, firstName, lastName, dateOfJoinAUIS, userType);
        setGpa(gpa);
    }
    
    public Student() {
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
}
