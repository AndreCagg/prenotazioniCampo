/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prenotazionicampo;
import java.time.*;
/**
 *
 * @author caggi
 */
public class Giocatore {
    private String nome,cognome;
    private String nascita;
    private Boolean certificato;
    private Boolean ce;
    private String scadCertificato;
    private String scadCe;
    private Integer code;

    public Giocatore() {
        this.nome = "";
        this.cognome = "";
        this.nascita = "";
        this.certificato =false;
        this.ce = false;
        this.scadCertificato = "";
        this.scadCe = "";
        this.code=0;
    }

    public Giocatore(String nome, String cognome, String nascita, Boolean certificato, String scadCertificato, Boolean ce,String scadCe, Integer code) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
        this.certificato = certificato;
        this.ce = ce;
        this.scadCertificato = scadCertificato;
        this.scadCe = scadCe;
        this.code = code;
    }
    
    public Giocatore(Giocatore g){
        this.nome=g.getNome();
        this.cognome=g.getCognome();
        this.nascita=g.getNascita();
        this.certificato=g.getCertificato();
        this.ce=g.getCe();
        this.scadCertificato=g.getScadCertificato();
        this.scadCe=g.getScadCe();
        this.code=g.getCode();
   }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNascita() {
        return nascita;
    }

    public void setNascita(String nascita) {
        this.nascita = nascita;
    }

    public Boolean getCertificato() {
        return certificato;
    }

    public void setCertificato(Boolean certificato) {
        this.certificato = certificato;
    }

    public Boolean getCe() {
        return ce;
    }

    public void setCe(Boolean ce) {
        this.ce = ce;
    }

    public String getScadCertificato() {
        return scadCertificato;
    }

    public void setScadCertificato(String scadCertificato) {
        this.scadCertificato = scadCertificato;
    }

    public String getScadCe() {
        return scadCe;
    }

    public void setScadCe(String scadCe) {
        this.scadCe = scadCe;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    
    
    public String toString(){
        return this.getCognome().toUpperCase()+" "+this.getNome().toUpperCase()+"\n"+
                "DATA DI NASCITA: "+this.getNascita().toString()+"\n"+
                "CERTIFICATO MEDICO: "+this.getCertificato().toString()+", SCADENZA: "+this.getScadCertificato().toString()+"\n"+
                "DOCUMENTO DI RICONOSCIMENTO: "+this.getCe().toString()+", SCADENZA: "+this.getScadCe().toString()+"\n"+
                "CODICE: "+this.getCode().toString();
    }
}
