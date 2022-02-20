/*
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * 
 * e espaços. A base e altura da escada devem ser iguais ao valor n. A última linha deve conter 
 * nenhum espaço
 */
package desafiocapgemini.java;

import java.util.Scanner;

/**
 * Desafio 1
 * @author Letícia Akemi
 */
public class DesafioCapgeminiJava {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num;
        
        System.out.println("Digite a quantidade de degraus que deseja: ");
        num = ent.nextInt();
        
        System.out.println(escada(num));
        
        
    }
    
    private static int escada(int num){
        int i, j;
        
        for (j=0; j<(num+1); j++){
            String linha = "";
            for (i=0; i<j; i++){
               linha +=  " " + '*';
            }
            System.out.println(linha);
        }
        return num;
    }
    
}
