public class Calculadora {
    float primerNumero;
    float segundoNumero;

    //constructor
    public Calculadora(float primerNumero, float segundoNumero){
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public void sumar(){
        float sum = primerNumero + segundoNumero;
        System.out.println("la suma es: " + sum);
    }

    public void restar(){
        float res = primerNumero - segundoNumero;
        System.out.println("la resta es: " + res);
    }

    public void dividir(){
        float div = primerNumero / segundoNumero;
        System.out.println("la division es: " + div);
    }

    public void multiplicar(){
        float mul = primerNumero * segundoNumero;
        System.out.println("la multiplicacion es: " + mul);
    }

    public void exponencial() {
        double resultado = Math.pow(this.primerNumero, this.segundoNumero);
        System.out.println(this.primerNumero + "^" + this.segundoNumero + " = " + resultado);
    }
}

