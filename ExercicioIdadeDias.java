
import java.util.Scanner;

public class ExercicioIdadeDias {
    public static void main(String[] args) {
        int idade, dias;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        dias = idade * 365;

        System.out.print("Sua idade em dias é: " + dias);
    }
}
