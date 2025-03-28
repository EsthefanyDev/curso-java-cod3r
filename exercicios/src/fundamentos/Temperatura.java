package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // Fórmula de conversão: (°F - 32) x 5/9 = °C
        
        // Constante para ajuste de temperatura em Fahrenheit
        final double AJUSTE = 32;
        // Constante para o fator de conversão de Fahrenheit para Celsius
        final double FATOR = 5.0 / 9.0;
        
        double fahrenheit = 86;
        // Conversão de Fahrenheit para Celsius
        double celsius = (fahrenheit - AJUSTE) * FATOR;
 
        System.out.println("Valor: " + celsius + "°C");
        
        // Outra temperatura em Fahrenheit
        fahrenheit = 100;
        // Conversão de Fahrenheit para Celsius
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("Valor: " + celsius + "°C");
    }
}