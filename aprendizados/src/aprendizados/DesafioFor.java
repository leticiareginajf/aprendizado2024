package aprendizados;

public class DesafioFor {
    public static void main(String args[]){

        String valor = "#";


        for(int i= 1 ; i<= 5 ; i++){
            System.out.println(valor);
            valor += "#";
        }

        // Versão do Desafio
        //Não podde usar valor numerico pra controlar o laco!


        for(String v ="#";!v.equalsIgnoreCase("######"); v+= "#"){
            System.out.println(v);
        }
    }
}
