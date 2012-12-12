package CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class FileLoader{
    public static ArrayList loadFile(String FileName){
	// load csv file
	File csv;
	BufferedReader br;
	ArrayList LineList = new ArrayList<String>();
	try {
	    csv = new File(FileName);
	    br =  new BufferedReader(new FileReader(csv));
	    String line;
	    while ((line = br.readLine()) != null) {
		//System.out.println(line);
		LineList.add(line);
	    }

	    //return br;
	} catch (FileNotFoundException e) {
	    // Fileオブジェクト生成時の例外捕捉
	    e.printStackTrace();
	} catch (IOException e) {
	    // Fileオブジェクト生成時の例外捕捉
	    e.printStackTrace();
	}
	return LineList;
    }


}

