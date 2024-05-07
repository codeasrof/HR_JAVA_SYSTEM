package com.HRApp.HRApp.models;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

public class Vaga  implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private long codigo;

    @NotEmpty
    private String nome;

    @NotEmpty 
    private String descricao;

    @NotEmpty
    private String data;

    @NotEmpty
    private String salario;


}
