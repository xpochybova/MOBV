package com.yyy.xxx.semestralnezadananie.Entities;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private String id;
    private List<Post> prispevky;

    public User(String id)
    {
        this.id = id;
        List<Post> zoznam = new ArrayList<Post>();
        for (int i = 0; i < 1000; i++){
            int cislo = i+1;
            zoznam.add(new Post("Prispevok: "+cislo, id));
        }

        prispevky = zoznam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Post> getPrispevky() {
        return prispevky;
    }

    public void setPrispevky(List<Post> prispevky) {
        this.prispevky = prispevky;
    }
}
