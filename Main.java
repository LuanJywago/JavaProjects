import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "Gustavo";
        int idade = 18;
        double renda = 1800.0;

        //ESSE PRINTF VAI FORMATAR A SAÍDA DE DADOS DANDO OS DADOS SEPARADOS DE ENTRADA E,LOGO APOS, COM A ENTRADA DOS ARGUMENTOS UTILIZADOS
        System.out.printf("O nome da pessoa é %s e essa pessoa possui %d anos de idade, com salário de %.2f reais por mês%n||", nome, idade, renda);

        //O DADO LOCALE VAI LOCALIZAR O PADRÃO US NO SEU COMPUTADOR QUE ESTÁ EM PT-BR
        Locale.setDefault(Locale.US);
       int a = 9, b = 5 , c;
       if (a >= 5){
        c = a + b;
       }
       else{
        c = a - b;
       }
       System.out.println(c);
    }
}
