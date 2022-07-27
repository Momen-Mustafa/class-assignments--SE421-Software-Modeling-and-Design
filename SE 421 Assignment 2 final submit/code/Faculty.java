public class Faculty extends User{
    private String department;

    public Faculty(int  facultyID, String firstName, String lastName, String dateOfJoinAUIS, String department,String userType){
        super(facultyID, firstName, lastName, dateOfJoinAUIS, userType);
        setDepartment(department);
    }
    public Faculty(){}
    public Faculty setDepartment(String department) {
        return new Faculty(this.getID(), this.getFirstName(), this.getLastName(), this.getDateOfJoinAUIS(),department, this.getUserType());

    }
    public String getDepartment() {
        return department;
    }
}
