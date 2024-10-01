/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nico.desafio4streams;

/**
 *
 * @author Nicolás
 */
import java.util.Arrays;
import java.util.List;

public class Desafio4Streams {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");

        myList.stream()
              .filter(s -> s.startsWith("c")) // Filtra los que comienzan con "c"
              .map(String::toUpperCase)       // Convierte a mayúsculas
              .sorted()                       // Ordena alfabéticamente
              .forEach(System.out::println);  // Imprime cada elemento
    }
}
