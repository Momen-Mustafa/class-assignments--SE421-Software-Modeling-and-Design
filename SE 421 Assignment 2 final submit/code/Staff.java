public class Staff extends User{
    private String department;

    public Staff(int staffID, String firstName, String lastName, String dateOfJoinAUIS, String department, String userType){
        super(staffID, firstName, lastName, dateOfJoinAUIS, userType);
        setDepartment(department);
    }
    public Staff(){}
    
    public Staff setDepartment(String department) {
        this.department = department;
        return new Staff(this.getID(), this.getFirstName(), this.getLastName(), this.getDateOfJoinAUIS(), department, this.getUserType());

    }
    public String getDepartment() {
        return department;
    }
}
