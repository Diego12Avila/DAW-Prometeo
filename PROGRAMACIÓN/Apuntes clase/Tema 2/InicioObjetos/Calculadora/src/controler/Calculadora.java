package controler;

public class Calculadora {

    private int operando1, oprenado2;

    double resultado;

    public Calculadora (){};

    public double sumar(int operando1, int oprenado2){
        this.operando1=operando1;
        this.oprenado2=oprenado2;
        this.resultado=this.operando1+this.oprenado2;
        return this.resultado;
    }


    public int getOperando1() {
        return operando1;
    }

    public int getOprenado2() {
        return oprenado2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOprenado2(int oprenado2) {
        this.oprenado2 = oprenado2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
