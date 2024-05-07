package com.HRApp.HRApp.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Candidato {
    
    @Id 
    @GeneratedValue
    private long id;


    @Column(unique = true)
    @NotEmpty
    private String rg;

    @NotEmpty
    private String nomeCandidato;

    @NotEmpty
    private String email;

    @ManyToOne
    private Vaga vaga;


    //Getters and Setters

    public String getNomeCandidato(){
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato){
        this.nomeCandidato = nomeCandidato;
    }


    public String getEmail(){
        return email;
    }

    public void setEmailCandidato(String email){
        this.email = email;
    }

    public Vaga getVaga(){
        return vaga;
    }
    

    public void setCandidatos(Vaga vaga) {
        this.vaga = vaga;
    }
}
