package ec.edu.espe.arquitectura.listaobservados.resource;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NarcotraficanteRepository extends MongoRepository<Narcotraficante, String> {
  List<Narcotraficante> findByNombreCompleto(String nombreCompleto);
}
