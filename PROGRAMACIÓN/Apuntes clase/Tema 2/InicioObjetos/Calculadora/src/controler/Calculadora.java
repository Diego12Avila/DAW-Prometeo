package controler;

public class Calculadora {

    private int operando1, operando2;

    double resultado;

    public Calculadora (){};

    public double sumar(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.resultado=this.operando1+this.operando2;
        return this.resultado;
    }

    public double restar(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.resultado=this.operando1-this.operando2;
        return this.resultado;
    }

    public double multiplicar(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.resultado=this.operando1*this.operando2;
        return this.resultado;
    }

    public double dividir(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.resultado= (double) this.operando1 / this.operando2;
        return this.resultado;
    }

    public double modular(int operando1, int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
        this.resultado=this.operando1%this.operando2;
        return this.resultado;
    }


    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOprenado2(int oprenado2) {
        this.operando2 = operando2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
