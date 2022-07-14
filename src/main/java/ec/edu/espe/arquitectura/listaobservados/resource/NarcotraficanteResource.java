package ec.edu.espe.arquitectura.listaobservados.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.arquitectura.listaobservados.service.NarcotraficanteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/narco")
@RequiredArgsConstructor
public class NarcotraficanteResource {
    
    private final NarcotraficanteService;

    @GetMapping
    public ResponseEntity buscar(String nombre){
        return this.NarcotraficanteService.buscar(nombre);
    }
}
