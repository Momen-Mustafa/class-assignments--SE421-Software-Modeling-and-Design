interface Borrower{
    Borrower setID(int id);
    int getID();
    String getFirstName();
    Borrower setFirstName(String firstName);
    String getLastName();
    Borrower setLastName(String lastName);
    String getDateOfJoinAUIS();
    Borrower setDateOfJoinAUIS(String date);
    Borrower setUserType(String userType);
    String getUserType();
}

// 3. D Facade: for the facade, the idea behind this design pattern was just to put a central point in order to hide the complexity 
// of the code, so we created a Borrower interface to hide which user and also we used Resources interface for the same reason
// then we used User and Sources classes to implement these interfaces and put them as the central point for the user and also 
// for the resources used in Inventory class.