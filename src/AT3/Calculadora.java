package AT3;

public class Calculadora {

    int valor1 = 68;
    int valor2 = 48;
    int resultado;

    void somar() {
        resultado = valor1 + valor2;
        System.out.println("O resultado é: " + resultado);
    }

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somar();
    }
}