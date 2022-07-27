public class User implements Borrower{
    private int ID;
    private String firstName;
    private String lastName;
    private String dateJoinAUIS;
    private String userType;

    public User(int ID, String firstName, String lastName, String dateJoinAUIS,String userType){
        setID(ID);
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfJoinAUIS(dateJoinAUIS);
        setUserType(userType);
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public User(){};
    @Override
    public void setID(int id) {
        this.ID = id;
    }
    public int getID() {
        return ID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;        
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setDateOfJoinAUIS(String date) {
        this.dateJoinAUIS = date;
    }
    public String getDateOfJoinAUIS() {
        return dateJoinAUIS;
    }
    
}
