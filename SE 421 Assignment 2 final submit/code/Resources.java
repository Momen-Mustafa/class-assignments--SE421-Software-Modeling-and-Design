interface Resources {
    void setSerialNo(int sn);
    int getSerialNo();
    int getNumOfPages();
    void setNumOfPages(int numOfPages);
    String getAuthorName();
    void setAuthorName(String authorName);
    String getPublishDate();
    void setPublishDate(String date); 
    String getSourceName();
    void setSourceName(String sourceName); 
    void snapshot();// 2.Undo
    void undo(); //2.Undo
}


// 3. D Facade: for the facade, the idea behind this design pattern was just to put a central point in order to hide the complexity 
// of the code, so we created a Borrower interface to hide which user and also we used Resources interface for the same reason
// then we used User and Sources classes to implement these interfaces and put them as the central point for the user and also 
// for the resources used in Inventory class.