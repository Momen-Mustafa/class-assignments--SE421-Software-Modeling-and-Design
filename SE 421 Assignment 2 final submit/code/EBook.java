public class EBook extends Sources{
    private String type;
    private double duration;
    public EBook(String sourceName, int serialNo, int numOfPages, String authorName, String publishDate, String type, double duration,String SourceType){
        super(sourceName, serialNo, numOfPages, authorName, publishDate, SourceType);
        setType(type);
        setDuration(duration);
    }
    public EBook(){}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    @Override
    public void snapshot(){ //2.Undo
        
        EBook source = new EBook();
        source.type = this.type;
        source.duration = this.duration;
        source.setSourceName(this.getSourceName());
        source.setAuthorName(this.getAuthorName());
        source.setNumOfPages(this.getNumOfPages());
        source.setPublishDate(this.getPublishDate());
        source.setSerialNo(this.getSerialNo());
        source.setSourceType(this.getSourceType());
    }
    @Override
    public void undo(){ //2.Undo
        EBook source = (EBook) SharedStack.stack.pop();
        this.type = source.type;
        this.duration = source.duration;      
        this.setSourceName(source.getSourceName());
        this.setAuthorName(source.getAuthorName());
        this.setNumOfPages(source.getNumOfPages());
        this.setPublishDate(source.getPublishDate());
        this.setSerialNo(source.getSerialNo());
        this.setSourceType(source.getSourceType());
    }
}
