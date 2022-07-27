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
        snapshot();
        this.field = field;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        snapshot();
        this.purpose = purpose;
    }

    @Override
    public void snapshot(){ //2.Undo
        
        Dissertation source = new Dissertation();
        source.field = this.field;
        source.purpose = this.purpose;
        source.setSourceName(this.getSourceName());
        source.setAuthorName(this.getAuthorName());
        source.setNumOfPages(this.getNumOfPages());
        source.setPublishDate(this.getPublishDate());
        source.setSerialNo(this.getSerialNo());
        source.setSourceType(this.getSourceType());
    }
    @Override
    public void undo(){ //2.Undo
        Dissertation source = (Dissertation) SharedStack.stack.pop();
        this.field = source.field;
        this.purpose = source.purpose;        
        this.setSourceName(source.getSourceName());
        this.setAuthorName(source.getAuthorName());
        this.setNumOfPages(source.getNumOfPages());
        this.setPublishDate(source.getPublishDate());
        this.setSerialNo(source.getSerialNo());
        this.setSourceType(source.getSourceType());
    }
}
