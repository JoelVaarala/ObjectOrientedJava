package com.company;


import java.util.Scanner;

public class Puhelin {

    private Mikrofoni mikrofoni;
    private Kaiutin kaiutin;

    public Puhelin() {
    }

    public Puhelin(Mikrofoni mikrofoni, Kaiutin kaiutin) {
        this.mikrofoni = mikrofoni;
        this.kaiutin = kaiutin;
    }

    public Mikrofoni getMikrofoni() {
        return mikrofoni;
    }

    public void setMikrofoni(Mikrofoni mikrofoni) {
        this.mikrofoni = mikrofoni;
    }

    public Kaiutin getKaiutin() {
        return kaiutin;
    }

    public void setKaiutin(Kaiutin kaiutin) {
        this.kaiutin = kaiutin;
    }

    @Override
    public String toString() {
        return "Puhelin{" +
                "mikrofoni=" + mikrofoni +
                ", kaiutin=" + kaiutin +
                '}';
    }

    public void kysy() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nKäytetään 1=Broadcom-kaiutinta 2=Qualcomm-kaiutinta?");
        int valinta = sc.nextInt();
        sc.nextLine();

        if (valinta == 1) {
            Kaiutin k = new BroadcomKaiutin();
            kysy2(k);
        } else if (valinta == 2) {
            Kaiutin k = new QualcommKaiutin();
            kysy2(k);
        }
    }


        public void kysy2(Kaiutin k){

        Scanner sc = new Scanner(System.in);
        System.out.println("Käytetään 1=BroadcomMikrofonia 2=SamsungMikrofonia?");
        int valinta2 = sc.nextInt(); sc.nextLine();

        if(valinta2 == 1){
            Mikrofoni m = new BroadcomMikrofoni();
            muodosta(m,k);
        }else if(valinta2 == 2){
            Mikrofoni m = new SamsungMikrofoni();
            muodosta(m,k);
        }
    }

        public void muodosta(Mikrofoni m, Kaiutin k){

            Puhelin p = new Puhelin(m,k);
            System.out.println(p);
            saadaAani(p);
        }

        public void saadaAani(Puhelin p) {

                int mAani;
                int kAani;

            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("\nMikrofonin äänenvoimakkuus : ");
                mAani = sc.nextInt();
                p.getMikrofoni().setVolume(mAani);

                System.out.println("Kaiuttimen äänenvoimakkuus : ");
                kAani = sc.nextInt();
                p.getKaiutin().setVolume(kAani);

                if(mAani != 0 && kAani != 0) {
                    if (p.getKaiutin().unMute() == true && p.getMikrofoni().micOn() == true) {
                        System.out.println("--Configuration build full success");
                    }else if (p.getKaiutin().unMute() == true && p.getMikrofoni().micOn() != true){
                        System.out.println("--Configuration build speaker success");
                    }else if(p.getKaiutin().unMute() != true && p.getMikrofoni().micOn() == true){
                        System.out.println("--Configuration build mic success");
                    }
                    else {
                        System.out.println("--Configuration build failed");
                    }
                }

            }while(mAani != 0 && kAani != 0);
            System.out.println("--Config killtask");
        }
}
