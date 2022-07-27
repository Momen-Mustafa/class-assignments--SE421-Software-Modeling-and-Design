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
        snapshot();
        this.type = type;
    }
    @Override
    public void snapshot(){ //2. Undo
        
        Book source = new Book();
        source.type = this.type;
        source.setSourceName(this.getSourceName());
        source.setAuthorName(this.getAuthorName());
        source.setNumOfPages(this.getNumOfPages());
        source.setPublishDate(this.getPublishDate());
        source.setSerialNo(this.getSerialNo());
        source.setSourceType(this.getSourceType());
    }

    @Override
    public void undo(){ //2.Undo
        Book source = (Book) SharedStack.stack.pop();
        this.type = source.type;
        this.setSourceName(source.getSourceName());
        this.setAuthorName(source.getAuthorName());
        this.setNumOfPages(source.getNumOfPages());
        this.setPublishDate(source.getPublishDate());
        this.setSerialNo(source.getSerialNo());
        this.setSourceType(source.getSourceType());
    }
}
