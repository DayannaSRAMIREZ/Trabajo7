package coladebanco;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 - agregar(persona) que si la persona no está en la cola, la agrega.
 - atender(persona) que devuelve la persona de la cabecera de la cola y la elimina de la cola
Luego, queremos que las personas mayores de 60 tengan prioridad para ser atendidas.
Modificar la clase para usar Deque y que el metodo agregar, agregue las personas mayores de 60 al principio de la cola.
*/
public class ColaDeBanco {
    Deque<Persona> personasList = new LinkedList<>();

    public ColaDeBanco(Deque<Persona> personasList) {
        this.personasList = personasList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    public Deque<Persona> agregarPersona(Persona persona) {
        if (!personasList.contains(persona)) {
            personasList.add(persona);
        }
        return personasList;
    }
    public Persona atender() {
        Persona eliminada= personasList.element();
        if (hayMayores()) {
            for (Persona persona : personasList) {
                if (persona.edad > 60) {
                    eliminada = persona;
                    personasList.remove(persona);
                    break;
                }
            }
        } else {
            personasList.remove(personasList.element());
        }
        return eliminada;

    }
    public Boolean hayMayores() {
        for (Persona persona : personasList) {
            if (persona.edad > 60) return true;
        }
        return true;
    }
}
