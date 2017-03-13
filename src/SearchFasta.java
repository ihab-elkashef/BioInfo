import java.io.*;

public class SearchFasta {

	
	
	public String searchFastaNaive(String pathname, String sequence){
		String genome = "" , currentLine, positions = ""; 
		FileReader file;
		BufferedReader bf;
		int glength, slength, j=0;
		boolean pursue = false;
		
		try{
			file = new FileReader(pathname);
			bf = new BufferedReader(file);
			
			//On rempli la variable "genome" d'un String contenant l'ensemble des caractères du génome
			while ((currentLine = bf.readLine()) != null) {
				genome += currentLine; 
			}
			
			System.out.println(genome);
			
			glength = genome.length();
			slength = sequence.length();
						
			//On parcourt le génome et on compare chaque caractère au premier caractère de la séquence
			for (int i=0; i<glength; i++) {
				j = 0; //Initialiser à 0 pour ne pas dépasser la longueur de la séquence lors des itérations suivantes
				
				if (genome.charAt(i) == sequence.charAt(j)) {
					pursue = true; //Booléen qui permet d'interrompre la boucle si un des caractère suivant est différent
					j++;
					
					while (pursue && (i+j)<glength && j<slength) {
						if (genome.charAt(i+j) == sequence.charAt(j)) {
							j++;
						}else{
							pursue = false;
						}
					}
				}				
				if (j == slength) {
					positions += i+" ";
				}
				
			}			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return positions;
		
	}
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchFasta test = new SearchFasta();
		
		System.out.println("Occurence de la séquence aux indices suivant : "+test.searchFastaNaive("/home/baz/workspace/TP1_BI/fasta.txt", "CTA"));

	}*/

}
