package auth;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bodor on 2017.04.21..
 */
public class Poet {
    private String firstName;
    private String lastName;
    private List<Art> arts;

    private String user;
    private String pw;

    public Poet() {
    }

    public Poet(String firstName, String lastName, List<Art> arts, String user, String pw) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.arts = arts;
        this.user = user;
        this.pw = pw;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Art> getArts() {
        return arts;
    }

    public List<Art> getArtsRealPath(String serverContext){
        return getArts().stream()
                .map(art-> {
                    Art newArt = new Art();
                    newArt.setPublishDate(art.getPublishDate());
                    newArt.setTitle(art.getPublishDate());
                    newArt.setPath(serverContext + art.getPath());
                    return newArt;
                })
                .collect(Collectors.toList());
    }

    public void setArts(List<Art> arts) {
        this.arts = arts;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
