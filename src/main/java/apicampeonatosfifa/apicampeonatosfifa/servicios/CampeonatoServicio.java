package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.controladores.dto.EncuentroDTO;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.repositorios.CampeonatoRepositorio;
import jakarta.persistence.*;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {
    
   private CampeonatoRepositorio repositorio;

    public CampeonatoServicio(CampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public List<Grupo> listarGrupos(long id) {
        // Buscar campeonato por su ID
        var campeonatoBuscado = repositorio.findById(id);

        if (campeonatoBuscado.isPresent()) {
            var campeonato = campeonatoBuscado.get();

            return campeonato.getGrupos();
        }
        return null;
    }

    @Override
    public List<EncuentroDTO> obtenerEncuentrosPorCampeonato(Long idCampeonato) {
        List<Object[]> results = repositorio.obtenerEncuentrosPorCampeonato(idCampeonato);        
        EncuentroDTO encuentroDTO = new EncuentroDTO();
        return encuentroDTO.construirLista(results);
    }
}
