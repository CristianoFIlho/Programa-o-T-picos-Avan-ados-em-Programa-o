 package br.com.atividade06;

 public class TamanhoString {
     public static void main(String[] args) {
         String[] vetor = new String[10];
         System.out.println("Tamanho do string: " +
             tamanhoString(vetor));
     }

     public static int tamanhoString(String[] vetor) {
         int contador = 0;
         for (int i = 0; i < vetor.length; i++) {
             if (vetor[i] == ".") {
                 return contador;
             }
             contador++;
         }
         return contador;
     }
 }