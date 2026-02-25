public class Operadores {
    
    public static void main(String[] args) {
        
        // Operadores Aritméticos
        double soma = 5 + 3;
        double subtracao = 5 - 3;
        double multiplicacao = 5 * 3;
        double divisao = 15 / 3;
        double resto = 15 % 3;
        double potencia = Math.pow(5, 3);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Potência: " + potencia);

        // Contatenação de Strings
        String nome = "Rafael";
        String sobrenome = "Amaral";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

        // Operadores Unários
        int numero = 5;
        numero++; // Incremento
        System.out.println("Número após incremento: " + numero);
        numero--; // Decremento
        System.out.println("Número após decremento: " + numero);
        boolean isTrue = true;
        System.out.println("Valor booleano: " + isTrue);
        System.out.println("Valor booleano negado: " + !isTrue);

        // Operador Ternário
        int idade = 18;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado do operador ternário: " + resultado);

        // Operadores Lógicos
        boolean a = true;
        boolean b = false;
        System.out.println("a AND b: " + (a && b));
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + (!a));
    }
}
