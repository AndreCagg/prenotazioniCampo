package com.mycompany.prenotazionicampo;

public class Note extends Prenotazione{
    private String note;

    public Note(){
        note="";
    }
    public Note(String note) {
        this.note = note;
    }

    public Note(String note, String referente, String[] giocatori, Boolean pagato, Double quota, String data, String orario) {
        super(referente, giocatori, pagato, quota, data, orario);
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public String toString(){
        return "\nMANCANZE: "+this.getNote();
    }
}