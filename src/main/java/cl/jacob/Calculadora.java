package cl.jacob;

public class Calculadora {
    private float resultado;

    public float suma(float primerNumero, float segundoNumero){
        return resultado = primerNumero + segundoNumero;
    }

    public float resta(float primerNumero, float segundoNumero){
        return resultado = primerNumero - segundoNumero;
    }

    public float multiplicacion(float primerNumero, float segundoNumero){
        return resultado = primerNumero * segundoNumero;
    }

    public float division(float primerNumero, float segundoNumero) {
        if (primerNumero == 0 || segundoNumero == 0) {
            throw new ArithmeticException("Los números deben ser distintos de 0");
        }else{
            resultado = primerNumero / segundoNumero;
        }
        return resultado;
    }
}
