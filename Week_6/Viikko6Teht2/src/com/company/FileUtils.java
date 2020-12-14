package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils implements Runnable{

    private String syote;
    private String tuloste;
    private String file;

    public FileUtils() {
    }

    public FileUtils(String file, String syote) {
        this.syote = syote;
        this.file = file;
    }


    public String getSyote() {
        return syote;
    }

    public void setSyote(String syote) {
        this.syote = syote;
    }

    public String getTuloste() {
        return tuloste;
    }

    public void setTuloste(String tuloste) {
        this.tuloste = tuloste;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static void ReadFromFile(String file){

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( Paths.get(file), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contentBuilder.toString());
    }

    public static void WriteToFIle(String file, String syote)  {

        try {

            File f = new File(file);

            FileWriter fw = new FileWriter(f.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(syote);
            bw.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        ReadFromFile(file);
    }
}
