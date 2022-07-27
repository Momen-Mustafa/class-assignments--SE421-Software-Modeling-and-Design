public class User implements Borrower, NewsPosted{
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
    public User(){};
    public String getUserType() {
        return userType;
    }
    public Borrower setUserType(String userType) {
        return new User(this.getID(), this.getFirstName(), this.getLastName(), this.getDateOfJoinAUIS(), userType);
    }
    @Override
    public Borrower setID(int id) {
        return new User(id, this.getFirstName(), this.getLastName(), this.getDateOfJoinAUIS(), this.getUserType());
    }
    public int getID() {
        return ID;
    }
    public Borrower setFirstName(String firstName) {
        return new User(this.getID(), firstName, this.getLastName(), this.getDateOfJoinAUIS(), this.getUserType());
    }
    public String getFirstName() {
        return firstName;
    }
    public Borrower setLastName(String lastName) {
        return new User(this.getID(), this.getFirstName(), lastName, this.getDateOfJoinAUIS(), this.getUserType());
    }
    public String getLastName() {
        return lastName;
    }
    public Borrower setDateOfJoinAUIS(String date) {
        return new User(this.getID(), this.getFirstName(), this.getLastName(), date, this.getUserType());
    }
    public String getDateOfJoinAUIS() {
        return dateJoinAUIS;
    }
    @Override
    public void newsPosted(String msg) { // 3.b Observer 
        System.out.println("News event: ");
        System.out.print(msg);
    }
    
}
