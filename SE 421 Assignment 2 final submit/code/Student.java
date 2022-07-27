public class Student extends User{
    private double gpa;

    public Student(int studentID, String firstName, String lastName, String dateOfJoinAUIS, double gpa,String userType){
        super(studentID, firstName, lastName, dateOfJoinAUIS, userType);
        setGpa(gpa);
    }
    
    public Student() {
    }

    public Student setGpa(double gpa) {
        return new Student(this.getID(), this.getFirstName(), this.getLastName(), this.getDateOfJoinAUIS(), gpa, this.getUserType());
    }
    public double getGpa() {
        return gpa;
    }
}
