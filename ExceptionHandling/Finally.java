package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

	static String FILENAME= "readMe.txt";

	static BufferedReader br=null;

	static FileReader fr=null;

	public static void main(String[] args) {

		try {
      //System.exit(0);
			fr= new FileReader(FILENAME);
			br=new BufferedReader(fr);

			String sCurrentLine;

			while((sCurrentLine= br.readLine())!=null) {

				System.out.println(sCurrentLine);

			}

		}catch(IOException e){

			e.printStackTrace();


		}finally {
			try {
				if(br!=null)
					br.close();

				if(fr!=null)
					fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}