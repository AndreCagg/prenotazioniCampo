package com.mycompany.prenotazionicampo;

import java.io.*;

public class TextFile {

    private Character mode;
    private BufferedReader reader;
    private BufferedWriter writer;

    public TextFile(String filename, Character mode) throws IOException {
        this.mode = 'R';
        if (mode == 'W' || mode == 'w') {
            this.mode = 'W';
            writer = new BufferedWriter(new FileWriter(filename));
        } else if (mode == 'A' || mode == 'a') {
            this.mode = 'A';
            writer = new BufferedWriter(new FileWriter(filename, true));
        } else {
            reader = new BufferedReader(new FileReader(filename));
        }
    }

    public void toFile(String line) throws IOException {

        if (this.mode == 'W' || this.mode == 'A') {

            writer.write(line);
            writer.newLine();
        }
    }

    public String fromFile() throws IOException {

        String tmp = "";

        if (this.mode == 'R') {
            tmp = reader.readLine();
        }

        if (tmp == null || tmp.length() < 0) {
            return "| ERRORE |";
        }

        return tmp;
    }

    public void closeFile(Character mode) throws IOException {

        switch (mode) {
            case 'W' ->
                writer.close();
            case 'R' ->
                reader.close();
            case 'A' ->
                writer.close();
            default -> {
            }
        }
        // writer.close ();
    }
}
