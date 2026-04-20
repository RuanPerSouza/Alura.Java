package br.com.alura.bytebank;

public class Main {
    static void main() {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interestelar");

        int anoDeLancamento = 2014;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        double notaDoFilme = 9.8;
        System.out.println("Nota do Filme: " + notaDoFilme);
        //Média calculada pelas vozes da minha cabeça
        double media = (9.8 + 6.0 + 5) /3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
            Filme de ficção cientifica no espaço cideral
            Astronaltas explorando o universo
            Imagems lindas do espaso 
        """;
        System.out.println(sinopse);

        
    }
}
