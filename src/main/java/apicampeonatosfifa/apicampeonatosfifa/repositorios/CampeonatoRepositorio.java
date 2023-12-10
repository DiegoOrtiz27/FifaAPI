package apicampeonatosfifa.apicampeonatosfifa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;

@Repository
public interface CampeonatoRepositorio extends JpaRepository<Campeonato, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM vEncuentro WHERE idCampeonato_1 = :idCampeonato")
    List<Object[]> obtenerEncuentrosPorCampeonato(@Param("idCampeonato") Long idCampeonato);
}
