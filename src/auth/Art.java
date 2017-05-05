package auth;

/**
 * Created by bodor on 2017.04.21..
 */
public class Art {
    private String path;
    private String title;
    private String publishDate;

    public Art(String path, String title, String publishDate) {
        this.path = path;
        this.title = title;
        this.publishDate = publishDate;
    }

    public Art() {
    }

    @Override
    public String toString() {
        return "Art{" +
                "path='" + path + '\'' +
                ", title='" + title + '\'' +
                ", published='" + publishDate + '\'' +
                '}';
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
