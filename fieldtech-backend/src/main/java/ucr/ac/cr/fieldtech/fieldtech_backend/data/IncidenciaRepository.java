package ucr.ac.cr.fieldtech.fieldtech_backend.data;

import ucr.ac.cr.fieldtech.fieldtech_backend.domain.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {
    List<Incidencia> findByTecnicoCodigoOrderByFechaReporteDesc(String codigo);
}
