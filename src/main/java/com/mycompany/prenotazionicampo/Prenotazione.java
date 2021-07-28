package com.mycompany.prenotazionicampo;

public class Prenotazione{
    private String referente;
    private String[] giocatori;
    private Boolean pagato;
    private Double quota;
    private String data;
    private String orario;

    public Prenotazione() {
        this.referente = "";
        this.giocatori = null;
        this.pagato = false;
        this.quota = 0.0;
        this.data = "";
        this.orario = "";
    }
    
    public Prenotazione(String referente, String[] giocatori, Boolean pagato, Double quota, String data, String orario) {
        this.referente = referente;
        this.giocatori = giocatori;
        this.pagato = pagato;
        this.quota = quota;
        this.data = data;
        this.orario = orario;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String[] getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(String[] giocatori) {
        this.giocatori = giocatori;
    }

    public Boolean getPagato() {
        return pagato;
    }

    public void setPagato(Boolean pagato) {
        this.pagato = pagato;
    }

    public Double getQuota() {
        return quota;
    }

    public void setQuota(Double quota) {
        this.quota = quota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }
    
    private String getElenco(String[] giocatori){
        String elenco="",sep,nominativo[];
        
        if(giocatori.length>1){
            sep=", ";
        }else{
            sep="";
        }
        
        
        for(Integer i=0;i<giocatori.length;i++){
            nominativo=giocatori[i].split("-");
            elenco+=nominativo[0].substring(0, 1).toUpperCase()+nominativo[0].substring(1)+" "+nominativo[1].substring(0, 1).toUpperCase()+nominativo[1].substring(1)+sep;
        }
        return elenco;
    }
    
    public String toString(){
        return "\nREFERENTE: "+this.getReferente()+"\nDATA: "+this.getData()+"\nORARIO: "+this.getOrario()+"\nPAGATO: "+this.getPagato()+"\nQUOTA: "+this.getQuota()+"\nGIOCATORI: "+this.getElenco(giocatori);
    }
    
}