import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void app(String[] args) {

        Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);

       String x;
       int y;
       double z;
       char w;

       x= scanner.next();
         y= scanner.nextInt();
            z= scanner.nextDouble();
                w= scanner.next().charAt(0);
        
        System.out.println("Dados digitados: ");
        System.out.println("Nome da pessoa: " + x);
        System.out.println("Idade da pessoa: " + y);
        if (y < 18){
            System.out.println("||esta pessoa é menor de idade||");
        }
        else if (y >= 18){
            System.out.println("||esta pessoa é maior de idade||");
        }

        
        System.out.println("Altura da pessoa é: " + z);
        if (z == 1.60){
            System.out.println("||esta pessoa tem uma altura mediana||");
        }
        else if (z < 1.60){
            System.out.println("||esta pessoa é baixa||");
        }
        else if (z > 1.60){
            System.out.println("||esta pessoa é alta||");
        }


        System.out.println("Sendo do sexo: " + w);
        if (w == 'M'){
            System.out.println("||esta pessoa é do sexo masculino||");
        }
        else if (w == 'F'){
            System.out.println("||esta pessoa é do sexo feminino||");
        }
        else {
            System.out.println("||esta pessoa é de outro sexo||");
        }

       scanner.close();

    }
}
 