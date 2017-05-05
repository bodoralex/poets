package auth;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bodor on 2017.04.21..
 */
public class Main {

    public static void main(String[] args) {
        Poet poet = new Poet();
        poet.setFirstName("Sandor");
        poet.setLastName("Petofi");
        Art art = new Art();
        art.setTitle("Anyád tyúkja");
        art.setPath("anyádba");
        List<Art> arts = new ArrayList<Art>();
        arts.add(art);
        poet.setArts(arts);

        Gson gson = new Gson();
        String json = gson.toJson(poet);
        System.out.println(poet);
        System.out.println(json);

        Poet re = gson.fromJson(json, Poet.class);
        System.out.println(re);
    }

}
