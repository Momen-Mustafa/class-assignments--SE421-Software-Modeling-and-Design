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
}
