
import java.util.ArrayList;
import java.util.Scanner;

/*
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas 
para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares 
de substrings que são anagramas.
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] 
respectivamente. 
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], 
[[8],  [9]] e [[0, 1, 2], [1, 2, 3]].
 */

/**
 *
 * @author Kemita Suga
 */
public class desafio3 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String anagrama;
        
        System.out.println("Digite a palavra desejada: ");
        anagrama = ent.next();
        
        ArrayList<String> anagramas = new ArrayList<>();
		
		for(int i = 0; i <anagrama.length(); i++) {
			for(int j = 1; j < anagrama.length(); j++) {
				if(anagrama.charAt(i) == anagrama.charAt(j) && i !=j && i < j) {
					if(anagrama.charAt(i) == anagrama.charAt(i+1)) {
					String x = anagrama.substring(i, i + 1);
					anagramas.add(x);
					} else {
					String a = anagrama.substring(i, j);
					String b = anagrama.substring(i + 1, j + 1);
					
					anagramas.add(a);
					anagramas.add(b);
					
					}
				}
			}
		}
		
		System.out.println(anagramas.size());
	}
        
        
}

