public class Sources implements Resources{
    private int serialNo;
    private String sourceName;
    private int numOfPages;
    private String authorName;
    private String publishDate;
    private String SourceType;

    public Sources(String sourceName, int serialNo, int numOfPages, String authorName, String publishDate, String SourceType){
        setSourceName(sourceName);
        setSerialNo(serialNo);
        setNumOfPages(numOfPages);
        setAuthorName(authorName);
        setPublishDate(publishDate);
        setSourceType(SourceType);
    }
    public String getSourceType() {
        return SourceType;
    }
    public void setSourceType(String SourceType) {
        snapshot();
        this.SourceType = SourceType;
    }
    public Sources(){
        
    }
    public String getSourceName() {
        return sourceName;
    }
    public void setSourceName(String sourceName) {
        snapshot();
        this.sourceName = sourceName;        
    }

    @Override
    public int getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(int sn) {
        snapshot();
        this.serialNo = sn;        
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        snapshot();
        this.authorName = authorName;        
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        snapshot();
        this.numOfPages = numOfPages;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String date) {
        snapshot();
        this.publishDate = date;
    }
    public void snapshot(){ //2. Undo
        Sources sources = new Sources();
        sources.SourceType = this.SourceType;
        sources.authorName = this.authorName;
        sources.numOfPages = this.numOfPages;
        sources.publishDate = this.publishDate;
        sources.serialNo = this.serialNo;
        sources.sourceName = this.sourceName;
        SharedStack.stack.push(sources);
    }

    public void undo(){ //2.Undo 
        Sources sources = (Sources) SharedStack.stack.pop();
        this.sourceName = sources.sourceName;
        this.serialNo = sources.serialNo;
        this.numOfPages = sources.numOfPages;
        this.authorName = sources.authorName;
        this.publishDate = sources.publishDate;
        this.SourceType = sources.SourceType;
    }
}
