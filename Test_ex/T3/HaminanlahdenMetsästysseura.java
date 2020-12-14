package com.company;

import java.util.ArrayList;

public class HaminanlahdenMetsästysseura implements JasenTiedot {


    ArrayList<Jasen>getJasenTiedot =  new ArrayList<>();
    @Override
    public ArrayList<Jasen> getJasenTiedot() {

        Jasen j1 = new Jasen("HaminanlahdenMetsästysseura", 112233, "Aki", "Allas", "aAa@");
        Jasen j2 = new Jasen("HaminanlahdenMetsästysseura", 114455, "Mikko", "Milloin", "ddd@");
        Jasen j3 = new Jasen("HaminanlahdenMetsästysseura", 116677, "Jaana", "Joku", "rtty@");
        getJasenTiedot.add(j1);
        getJasenTiedot.add(j2);
        getJasenTiedot.add(j3);

        for (Jasen j: getJasenTiedot
        ) {
            j.tulostaJäsenTiedot();
        }
        return getJasenTiedot;
    }
}
