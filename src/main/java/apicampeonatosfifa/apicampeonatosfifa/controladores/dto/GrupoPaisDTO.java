package apicampeonatosfifa.apicampeonatosfifa.controladores.dto;

public class GrupoPaisDTO {
    private int idGrupo; 
    private int idPais; 
    private String pais;

    public GrupoPaisDTO() {}

    public GrupoPaisDTO(int idGrupo, int idPais, String pais) {
        this.idGrupo = idGrupo;
        this.idPais = idPais;
        this.pais = pais;
    }

    public int getIdGrupo() {
        return idGrupo;
    }
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    public int getIdPais() {
        return idPais;
    }
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}
