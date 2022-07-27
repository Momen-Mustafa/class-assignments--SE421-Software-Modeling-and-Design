public class Journal extends Sources{
    private String field;
    public Journal(String sourceName, int  serialNo, int numOfPages, String authorName, String publishDate, String field,String SourceType){
        super(sourceName, serialNo, numOfPages, authorName, publishDate, SourceType);
        setField(field);
    }
    public Journal(){}
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
}
