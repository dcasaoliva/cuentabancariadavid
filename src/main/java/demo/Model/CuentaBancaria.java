package demo.Model;

import javax.persistence.*;

/**
 * Created by david.casaoliva on 01/10/2015.
 */
@Entity
public class CuentaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titular;
    private String numCuenta;
    private Double saldo;
    private Double tipoInteres;

    public Long getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", titular='" + titular + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipoInteres=" + tipoInteres +
                '}';
    }
}
