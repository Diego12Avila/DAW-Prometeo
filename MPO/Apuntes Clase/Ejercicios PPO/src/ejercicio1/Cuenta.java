package ejercicio1;

public class Cuenta {

    private String cliente, iban;

    private double interes, saldo;

    public Cuenta (){

        this.saldo=500;
    };

    public Cuenta (String cliente, String iban, double interes, double saldo){
        this.cliente=cliente;
        this.iban=iban;
        this.interes=interes;
        this.saldo=saldo;
    };


    public String getCliente() {
        return cliente;
    }

    public String getIban() {
        return iban;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




}
