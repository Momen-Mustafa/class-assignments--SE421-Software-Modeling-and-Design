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
        this.SourceType = SourceType;
    }
    public Sources(){
        
    }
    public String getSourceName() {
        return sourceName;
    }
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;        
    }

    @Override
    public int getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(int sn) {
        this.serialNo = sn;        
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;        
    }
    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String date) {
        this.publishDate = date;
    }
}
