package coladebanco;

import java.util.Deque;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona(34739771, "Alan", 28);
        Persona persona2= new Persona(32514744,"Maria", 32);
        Persona persona3= new Persona(3252122, "Pedro", 61);

        Deque<Persona> miLista= new LinkedList<>();
        ColaDeBanco cola1= new ColaDeBanco(miLista);

        miLista.add(persona1);
        miLista.add(persona2);
        miLista.add(persona3);

        Persona persona4= new Persona(3472584, "Lucia", 33);
        cola1.agregarPersona(persona4);
        System.out.println(cola1.atender());
        System.out.println(miLista);




    }
}
