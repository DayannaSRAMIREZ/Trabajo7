package arraysysorting;

import java.util.*;

import static java.util.Arrays.sort;


public class Main {
    public static void main(String[] args) {
        //Crear una lista de números desordenada
        // Usar java.util.Collections.sort(lista) para ordenar la lista
        //Usar el metodo lista.toArray() para convertir de lista a array.
        List<Integer> numerosDesordenados = new ArrayList<>();
        numerosDesordenados.add(7);
        numerosDesordenados.add(24);
        numerosDesordenados.add(11);
        numerosDesordenados.add(20);
        numerosDesordenados.add(30);
        Collections.sort(numerosDesordenados);
        System.out.println(numerosDesordenados);
        System.out.println();
        Integer[] numerosDesordenados2 = (Integer[]) numerosDesordenados.toArray();


        //Crear un array de ints con varios valores.
        //Usar java.util.Arrays.sort(array) y ver que ordena el array.
        //Usar java.util.Arrays.asList(array) y transformar el array en una lista
        int[] arrayints = {4, 8, 6, 9, 2, 3, 1};
        sort(arrayints);
        for (int i = 0; i < arrayints.length; i++) {
            System.out.print(arrayints[i] + ", ");
        }
        int[] miArrayDeEnteros = {2, 8, 20, 5};
        Integer[] miArrayInteger = new Integer[miArrayDeEnteros.length];
        for (int i = 0; i < miArrayDeEnteros.length; i++) {
            miArrayInteger[i] = miArrayDeEnteros[i];
        }
        List<Integer> miLista = Arrays.asList(miArrayInteger);
        System.out.println(miLista);

    }
}