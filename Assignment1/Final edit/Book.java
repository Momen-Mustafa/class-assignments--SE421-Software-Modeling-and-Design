public class Book extends Sources{
    private String type;
    public Book(String sourceName, int  serialNo, int numOfPages, String authorName, String publishDate, String type, String SourceType){
        super(sourceName, serialNo, numOfPages, authorName, publishDate, SourceType);
        setType(type);
    }
    public Book(){}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
