package br.com.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface BandaRepositorio extends CrudRepository<Banda, Long> {
     
}