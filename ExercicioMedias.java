import java.util.Scanner;

public class ExercicioMedias {
    public static void main(String[] args){
        double nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, soma;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        nota1 = leia.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        nota2 = leia.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = leia.nextDouble();

        System.out.print("Digite a nota 4: ");
        nota4 = leia.nextDouble();

        System.out.print("Digite a nota 5: ");
        nota5 = leia.nextDouble();

        System.out.print("Digite a nota 6: ");
        nota6 = leia.nextDouble();

        media1 = (nota1 + nota2 + nota3)/3;

        media2 = (nota4 + nota5 + nota6)/3;

        soma = media1 + media2;

        System.out.println("A média 1 é " + media1 + " e a média 2 é " + media2);
        System.out.print("A soma das médias é: " + soma);

        leia.close();

    }
}
