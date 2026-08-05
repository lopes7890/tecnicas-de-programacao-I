
import java.util.Scanner;

public class ExercicioSalarios {
    public static void main(String[] args) {
        double salario, salario_min, quant_salario;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$");
        salario_min = leia.nextDouble();

        System.out.print("Digite seu salário: R$");
        salario = leia.nextDouble();

        quant_salario = salario / salario_min;

        System.out.print("Quantidade de salários mínimos: " + quant_salario);

        leia.close();

    }

}
