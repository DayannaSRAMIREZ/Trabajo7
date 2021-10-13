package listadestring;


import java.util.*;

public class Main {
    //Lista de strings
    public static void main(String[] args) {


        List<String> nombresList = new LinkedList<>();
        nombresList.add("Camila");
        nombresList.add("Pedro");
        nombresList.add("Adonis");
        nombresList.add("Lucia");
        nombresList.add("Luciano");
        nombresList.add("Pablo");
        nombresList.add("Adonis");
        nombresList.add("Maria");
        nombresList.add("Adonis");
        nombresList.add("Adonis");
        nombresList.add("Roberto");
        nombresList.add("Alan");
        nombresList.add("Adonis");

        for (int i = 0; i < nombresList.size(); i++) {
            System.out.print(nombresList.get(i) + ", ");
            if (i == nombresList.size() - 1) System.out.println();
        }

        for (String nombre : nombresList) {
            System.out.print(nombre + ", ");
        }

        nombresList.set(3, "Estrella");
        nombresList.set(0, "Amador");
        nombresList.remove(2);
        nombresList.remove("Adonis");
        System.out.println();
        System.out.println(nombresList.contains("Maria"));
        borrarTodos("Adonis", nombresList);
        System.out.println(nombresList);
    }

    public static List<String> borrarTodos(String nombre, List<String> milista) {
        int contador = 0;
        for (String elemento : milista) {
            if (elemento.equals(nombre)) {
                contador++;
            }
        }
        for (int i = 0; i <= contador; i++) {
            milista.remove(nombre);
        }
        /*
        if (milista.contains(nombre)) {
            milista.remove(nombre);
            borrarTodos(nombre, milista);
        }*/
        return milista;
    }
}