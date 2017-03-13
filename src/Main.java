import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		String pathname;
		FileReader file;
		BufferedReader buffer;
		
		if (args.length > 2 ) {
			System.out.println("Error : too many arguments");
		}else{
			
			if (args[0].contentEquals("suffix-array")) {
				try{					
					file = new FileReader(args[1].toString());
					buffer = new BufferedReader(file);
					
					SuffixArray suffix = new SuffixArray(buffer);
					
					System.out.println(suffix.suffixArray().length);
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
	}

}
