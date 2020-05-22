package package6_HW6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class HomeWork6 {
	public static void main(String[] args) {
		fileLinesOperations();
	}

	private static void fileLinesOperations() {
		File file = new File("/Users/dkosh/Desktop/Friends_reader.txt");

		ArrayList<String> friendsList = new ArrayList<>();

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String l = br.readLine();

			while (l != null) {

				friendsList.add(l);
				System.out.println(l);
				l = br.readLine();
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Collections.sort(friendsList, Collections.reverseOrder());
		for (String friend : friendsList) {
			System.out.println(friend);
		}

		try {
			FileWriter fw = new FileWriter("/Users/dkosh/Desktop/Friends_writer.txt");
			
			for (String friend : friendsList) {
				
				fw.write(friend);
				fw.write("\n");
				
			}
			
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
