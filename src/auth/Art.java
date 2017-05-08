package auth;

/**
 * Created by bodor on 2017.04.21..
 */
public class Art {
    private String path;
    private String title;
    private String publishDate;

    Art() {
    }

    @Override
    public String toString() {
        return "Art{" +
                "path='" + path + '\'' +
                ", title='" + title + '\'' +
                ", published='" + publishDate + '\'' +
                '}';
    }

    String getPublishDate() {
        return publishDate;
    }

    void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    String getPath() {
        return path;
    }

    void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }
}
