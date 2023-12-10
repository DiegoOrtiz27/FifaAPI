package apicampeonatosfifa.apicampeonatosfifa.controladores.dto;

import java.util.*;

public class GrupoDTO {
    private int id;
    private String Grupo;
    private int IdCampeonato;
    private String Campeonato;
    
    public GrupoDTO () {}
    
    public GrupoDTO(int id, String grupo, int idCampeonato, String campeonato) {
        this.id = id;
        Grupo = grupo;
        IdCampeonato = idCampeonato;
        Campeonato = campeonato;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGrupo() {
        return Grupo;
    }
    public void setGrupo(String grupo) {
        Grupo = grupo;
    }
    public int getIdCampeonato() {
        return IdCampeonato;
    }
    public void setIdCampeonato(int idCampeonato) {
        IdCampeonato = idCampeonato;
    }
    public String getCampeonato() {
        return Campeonato;
    }
    public void setCampeonato(String campeonato) {
        Campeonato = campeonato;
    }

    public List<GrupoDTO> construirLista(List<Object[]> datos) {
        List<GrupoDTO> grupos = new ArrayList<>();
        try {
            for (Object[] resultado : datos) {
                GrupoDTO grupoDTO = new GrupoDTO();
                grupoDTO.setId((Integer) resultado[0]);
                grupoDTO.setGrupo((String) resultado[1]);
                grupoDTO.setIdCampeonato((Integer) resultado[2]);
                grupoDTO.setCampeonato((String) resultado[3]);

                grupos.add(grupoDTO);
            }
        } catch (Exception e) {
            System.out.println("Error armando lista de grupos: " + e.getMessage());
            e.printStackTrace();
        }
        return grupos;

    }
}