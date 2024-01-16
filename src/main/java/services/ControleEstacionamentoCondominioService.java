package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ControleEstacionamentoCondominioRepository;

@Service
public class ControleEstacionamentoCondominioService {

    final ControleEstacionamentoCondominioRepository controleEstacionamentoCondominioRepository;
    public ControleEstacionamentoCondominioService(ControleEstacionamentoCondominioRepository controleEstacionamentoCondominioRepository){
        this.controleEstacionamentoCondominioRepository = controleEstacionamentoCondominioRepository;
    }
}
