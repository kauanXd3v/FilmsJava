//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("SCREEN MATCH");
        System.out.println("Interestelar");

        int ano = 2014;
        System.out.println(ano);

        Boolean incluidoNoPlano = true;

        double notaDoFilme = 9.8;

        double media = (10 + 8.1 + 6.1) / 3;
        System.out.println("Nota: " + media);

        String sinopse = """
                Interestelar é um filme de ficção científica lançado em 2014 e dirigido por Christopher Nolan. O filme conta a história de uma equipe
                de astronautas que viaja por um buraco de minhoca no espaço a fim de garantir a sobrevivência da humanidade. 
                
                O filme não é recomendado para menores de 12 anos;
                """;

        System.out.println("Sinopse: " + sinopse);

        int classificacaoFilme = (int) (media/2);
        System.out.println("Classificação do filme: " + classificacaoFilme);

    }
}