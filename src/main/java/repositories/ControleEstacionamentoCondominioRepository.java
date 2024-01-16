package repositories;

import models.ControleEstacionamentoCondominioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ControleEstacionamentoCondominioRepository extends JpaRepository<ControleEstacionamentoCondominioModel, UUID> {
}
