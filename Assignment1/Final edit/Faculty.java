public class Faculty extends User{
    private String department;

    public Faculty(int  facultyID, String firstName, String lastName, String dateOfJoinAUIS, String department,String userType){
        super(facultyID, firstName, lastName, dateOfJoinAUIS, userType);
        setDepartment(department);
    }
    public Faculty(){}
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
