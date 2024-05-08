package com.HRApp.repository;

import java.util.List;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.HRApp.HRApp.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, Long>{   
    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);    
}
