package aprendizados;

import java.util.Scanner;

public class IfSemanas {

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite qual a sua semana?");
        Integer semana = scanner.nextInt();


        if(semana == 1){
            System.out.println("É Domingo");
        }
        if(semana == 2){
            System.out.println("É Segunda-feira");
        }

        if(semana == 3){
            System.out.println("É Terça-feira");
        }

        if(semana == 4){
            System.out.println("É Quarta-feira");
        }

        if(semana == 5){
            System.out.println("É Quinta-feira");
        }

        if(semana == 6){
            System.out.println("É Sexta-feira");
        }

        if(semana == 7){
            System.out.println("É Sabádo");
        }

        else if (semana == 0 || semana >= 8){
            System.out.println("Digitou número incorretamente.");

    }
        scanner.close();
}
}
