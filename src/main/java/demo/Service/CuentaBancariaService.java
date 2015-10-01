package demo.Service;

import demo.Model.CuentaBancaria;
import demo.Repository.CuentaBancariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by david.casaoliva on 01/10/2015.
 */

@Service
@Transactional
public class CuentaBancariaService {

    @Autowired

    private CuentaBancariaRepository cuentaBancariaRepository;

    public void ingreso(Long idCuentaBancaria, Double cantidad){

        CuentaBancaria cuentaBancaria = cuentaBancariaRepository.findOne(idCuentaBancaria);
        cuentaBancaria.setSaldo(cuentaBancaria.getSaldo()+cantidad);
        cuentaBancariaRepository.save(cuentaBancaria);
    }
}
