package demo.Repository;

import demo.Model.CuentaBancaria;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by david.casaoliva on 01/10/2015.
 */
public interface CuentaBancariaRepository extends PagingAndSortingRepository<CuentaBancaria, Long> {

}

