package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.controladores.dto.EncuentroDTO;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;

@CrossOrigin
@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {
    
    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/grupos/{id}", method = RequestMethod.GET)
    public List<Grupo> listarGrupos(@PathVariable long id) {
        return servicio.listarGrupos(id);
    }
 
    @GetMapping("/encuentros/{idCampeonato}")
    public ResponseEntity<List<EncuentroDTO>> obtenerEncuentrosPorCampeonato(@PathVariable Long idCampeonato) {
        List<EncuentroDTO> encuentros = servicio.obtenerEncuentrosPorCampeonato(idCampeonato);
        return new ResponseEntity<>(encuentros, HttpStatus.OK);
    }
}
