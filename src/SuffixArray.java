import java.io.BufferedReader;
import java.io.IOException;

public class SuffixArray {

	private BufferedReader buffer;
	private int counter;
	
	public SuffixArray(BufferedReader buffer) {
		this.counter = 0;
		this.buffer = buffer;
	}
	
	public int[] suffixArray() {
		
		try {
			while (buffer.read() != -1) {
				counter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new int[counter];
	}

}
