package ec.edu.espe.arquitectura.listaobservados.service;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import ec.edu.espe.arquitectura.listaobservados.repository.NarcotraficanteRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NarcotraficanteService {

  private final NarcotraficanteRepository NarcotraficanteRepository;

  public List<Narcotraficante> ConsultaListaObservados(String nombre) {
    return this.NarcotraficanteRepository.findByNombreCompleto(nombre);
  }
}
