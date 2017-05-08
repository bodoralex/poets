package auth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bodor on 2017.04.21..
 */
class PoetSingle {

    private static PoetSingle ourInstance = new PoetSingle();

    private List<Poet> poets = new ArrayList<>();

    static PoetSingle getInstance() {
        return ourInstance;
    }

    List<Poet> getPoets() {
        return poets;
    }


    private PoetSingle() {
        makeArany();
        makeJokai();
        makePetofi();
    }

    private void makePetofi(){
        Poet poet = new Poet();
        poet.setFirstName("Sandor");
        poet.setLastName("Petofi");
        poet.setUser("petofi");
        poet.setPw("sandor");
        Art art = new Art();
        art.setTitle("Tündérálom");
        art.setPath("petofi/valami0.txt");
        art.setPublishDate("Szalkszentmárton, 1846. február 20.");
        List<Art> arts = new ArrayList<>();
        arts.add(art);
        poet.setArts(arts);
        poets.add(poet);
    }
    private void makeArany(){
        Poet poet = new Poet();
        poet.setFirstName("Janos");
        poet.setLastName("Arany");
        poet.setUser("arany");
        poet.setPw("janos");
        List<Art> arts = new ArrayList<>();
        Art art = new Art();
        art.setTitle("vers0");
        art.setPath("arany/valami0.txt");
        art.setPublishDate("xxxx.xx.xx");
        arts.add(art);
        Art art1 = new Art();
        art1.setTitle("vers1");
        art1.setPath("arany/valami1.txt");
        System.out.println(art.getPath());
        art1.setPublishDate("1969.69.69");
        arts.add(art1);
        poet.setArts(arts);
        poets.add(poet);
    }
    private void makeJokai(){
        Poet poet = new Poet();
        poet.setFirstName("Mór");
        poet.setLastName("Jókai");
        poet.setUser("jokai");
        poet.setPw("mor");
        List<Art> arts = new ArrayList<>();
        Art art = new Art();
        art.setTitle("vers0");
        art.setPath("jokai/valami0.txt");
        art.setPublishDate("xxxx.xx.xx");
        arts.add(art);
        Art art1 = new Art();
        art1.setTitle("A tudománynak nincs háza!\n");
        art1.setPath("jokai/valami1.txt");
        art1.setPublishDate("1859.12.10");
        arts.add(art1);
        Art art2 = new Art();
        art2.setTitle("vers2");
        art2.setPath("jokai/valami2.txt");
        art2.setPublishDate("2001.09.11(Bushdid)");
        arts.add(art2);
        poet.setArts(arts);
        poets.add(poet);
    }
}
