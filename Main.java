import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
        System.out.println("Altura da pessoa é: " + z);
        System.out.println("Sendo do sexo: " + w);

       scanner.close();

    }
}
