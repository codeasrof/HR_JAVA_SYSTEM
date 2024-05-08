package com.HRApp.repository;

import java.util.List;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.HRApp.HRApp.models.Candidato;
import com.HRApp.HRApp.models.Vaga;


public interface CandidatoRepository extends CrudRepository<Candidato, Long>{
    Iterable<Candidato> findByVaga(Vaga vaga);

    Candidato findByRG(String rg);

    Candidato findById(long id);

    List<Candidato>findByNomeCandidatos(String nomeCandidato);
}   
