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

    @Override
    public void snapshot(){ //2.Undo
        
        Journal source = new Journal();
        source.field = this.field;
        source.setSourceName(this.getSourceName());
        source.setAuthorName(this.getAuthorName());
        source.setNumOfPages(this.getNumOfPages());
        source.setPublishDate(this.getPublishDate());
        source.setSerialNo(this.getSerialNo());
        source.setSourceType(this.getSourceType());
    }
    @Override
    public void undo(){ //2.Undo
        Journal source = (Journal) SharedStack.stack.pop();
        this.field = source.field;
        this.setSourceName(source.getSourceName());
        this.setAuthorName(source.getAuthorName());
        this.setNumOfPages(source.getNumOfPages());
        this.setPublishDate(source.getPublishDate());
        this.setSerialNo(source.getSerialNo());
        this.setSourceType(source.getSourceType());
    }
}
