package aprendizados;

import java.util.Scanner;

public class WhileIndeterrminado {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);


        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.println("Voce diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
