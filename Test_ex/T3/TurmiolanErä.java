package com.company;

import java.util.ArrayList;

public class TurmiolanErä implements JasenTiedot {

    ArrayList<Jasen>getJasenTiedot =  new ArrayList<>();
    @Override
    public ArrayList<Jasen> getJasenTiedot() {

        Jasen j1 = new Jasen("TurmiolanErä", 1003, "Anni", "Antaja", "aa@");
        Jasen j2 = new Jasen("TurmiolanErä", 1022, "Milla", "Mellinkainen", "aas@");
        Jasen j3 = new Jasen("TurmiolanErä", 1112, "Neiti", "Noki", "adddNN@");
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
