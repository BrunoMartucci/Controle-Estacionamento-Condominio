package controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ControleEstacionamentoCondominioService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/ControleEstacionamentoCondominio")
public class ControleEstacionamentoCondominioController {

    final ControleEstacionamentoCondominioService controleEstacionamentoCondominioService;

    public ControleEstacionamentoCondominioController(ControleEstacionamentoCondominioService controleEstacionamentoCondominioService) {
        this.controleEstacionamentoCondominioService = controleEstacionamentoCondominioService;
    }
}
