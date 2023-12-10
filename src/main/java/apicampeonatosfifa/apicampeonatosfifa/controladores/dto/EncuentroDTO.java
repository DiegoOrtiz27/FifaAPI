package apicampeonatosfifa.apicampeonatosfifa.controladores.dto;

import java.util.*;

public class EncuentroDTO {
    private int idPais1;
    private String pais1;
    private int idPais2;
    private String pais2;
    private String campeonato;
    private int idCampeonato;
    private int idFase;
    private String fase;

    public EncuentroDTO(){}
    
    public EncuentroDTO(int idPais1, String pais1, int idPais2, String pais2, String campeonato, int idCampeonato,
            int idFase, String fase) {
        this.idPais1 = idPais1;
        this.pais1 = pais1;
        this.idPais2 = idPais2;
        this.pais2 = pais2;
        this.campeonato = campeonato;
        this.idCampeonato = idCampeonato;
        this.idFase = idFase;
        this.fase = fase;
    }

    public int getIdPais1() {
        return idPais1;
    }

    public void setIdPais1(int idPais1) {
        this.idPais1 = idPais1;
    }

    public String getPais1() {
        return pais1;
    }

    public void setPais1(String pais1) {
        this.pais1 = pais1;
    }

    public int getIdPais2() {
        return idPais2;
    }

    public void setIdPais2(int idPais2) {
        this.idPais2 = idPais2;
    }

    public String getPais2() {
        return pais2;
    }

    public void setPais2(String pais2) {
        this.pais2 = pais2;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public int getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(int idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
    
   public List<EncuentroDTO> construirLista(List<Object[]> datos) {
        List<EncuentroDTO> encuentros = new ArrayList<>();
        try {
            for (Object[] resultado : datos) {
                EncuentroDTO encuentroDTO = new EncuentroDTO();
                encuentroDTO.setIdPais1((Integer) resultado[0]);
                encuentroDTO.setPais1((String) resultado[1]);
                encuentroDTO.setIdPais2((Integer) resultado[2]);
                encuentroDTO.setPais2((String) resultado[3]);
                encuentroDTO.setCampeonato((String) resultado[4]);
                encuentroDTO.setIdCampeonato((Integer) resultado[5]);
                encuentroDTO.setIdFase((Integer) resultado[6]);
                encuentroDTO.setFase((String) resultado[7]);

                encuentros.add(encuentroDTO);
            }
        } catch (Exception e) {
            System.out.println("Error armando lista de encuentros: " + e.getMessage());
            e.printStackTrace();
        }
        return encuentros;

    }
} 
