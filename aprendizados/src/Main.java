import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("---------Sistemas Aprendizados---------");

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Qual o curso que está aprendendo?");
        String curso = scan.nextLine();


        System.out.println("-----------------------------");

        System.out.println("Resultados:\n");
        System.out.println("Nome:" + nome);
        System.out.println("Curso de Aprendizagem:" + curso);
    }
}