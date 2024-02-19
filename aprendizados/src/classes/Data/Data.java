package classes.Data;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada(){

        return String.format("%d/%d/%d", dia, mes, ano);
    }


    void imprimirDataFormatada(){
        //System.out.printf("%d/%d/%d", dia, mes, ano);
        System.out.println(obterDataFormatada());
    }
}
