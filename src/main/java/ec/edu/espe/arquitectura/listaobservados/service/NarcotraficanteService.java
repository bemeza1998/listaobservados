package ec.edu.espe.arquitectura.listaobservados.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.listaobservados.model.Narcotraficante;
import ec.edu.espe.arquitectura.listaobservados.repository.NarcotraficanteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NarcotraficanteService {
    
    private final NarcotraficanteRepository;

    public List<Narcotraficante> buscar(String nombre){
        return this.buscar(nombre);
    }
}
