package conjunto;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Integer numero= 8;
        int numero2= 7;
        InterPrueba conjuntopPar= new InterPrueba();
        System.out.println(conjuntopPar.pertenece(numero2));

        List<Object> miLista= new ArrayList<>();
        miLista.add("Daiana");
        miLista.add("Maria");

        Objetos misObj= new Objetos(miLista);
        System.out.println(misObj.pertenece("Luca"));
        System.out.println(misObj.pertenece("Daiana"));



    }
}