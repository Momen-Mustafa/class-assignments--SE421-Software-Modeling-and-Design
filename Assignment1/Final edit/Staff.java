public class Staff extends User{
    private String department;

    public Staff(int staffID, String firstName, String lastName, String dateOfJoinAUIS, String department, String userType){
        super(staffID, firstName, lastName, dateOfJoinAUIS, userType);
        setDepartment(department);
    }
    public Staff(){}
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}
