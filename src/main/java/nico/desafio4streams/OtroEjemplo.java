/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nico.desafio4streams;

/**
 *
 * @author Nicolás
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OtroEjemplo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "ejemplo", "codigo", "funcion", "programarpoo");

        // Agrupar palabras por longitud
       
        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        // Imprimir el resultado
        
        groupedByLength.forEach((length, wordList) -> 
            System.out.println("Longitud " + length + ": " + wordList));
    }
}
