public class Dissertation extends Sources{
    private String field;
    private String purpose;
    public Dissertation(String sourceName, int  serialNo, int numOfPages, String authorName, String publishDate, String field, String purpose,String SourceType){
        super(sourceName, serialNo, numOfPages, authorName, publishDate, SourceType);
        setField(field);
        setPurpose(purpose);
    }
    public Dissertation(){}
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
