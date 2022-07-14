package ec.edu.espe.arquitectura.listaobservados.resource;

import ec.edu.espe.arquitectura.listaobservados.service.NarcotraficanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/narco")
@RequiredArgsConstructor
public class NarcotraficanteResource {

  private final NarcotraficanteService narcotraficanteService;

  @GetMapping
  public ResponseEntity buscar(String nombre) {
    return ResponseEntity.ok(this.narcotraficanteService.buscar(nombre));
  }
}
