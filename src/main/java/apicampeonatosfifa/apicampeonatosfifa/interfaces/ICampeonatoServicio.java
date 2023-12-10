package apicampeonatosfifa.apicampeonatosfifa.interfaces;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.controladores.dto.EncuentroDTO;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;

public interface ICampeonatoServicio {
    
    public List<Campeonato> listar();

    public List<Grupo> listarGrupos(long id);

    public List<EncuentroDTO> obtenerEncuentrosPorCampeonato(Long idCampeonato);
}
