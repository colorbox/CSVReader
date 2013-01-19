package CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class CSVReader{
    //init arrangement StageData
    public static ArrayList readCSV(String FileName){
	ArrayList FileList = loadFile(FileName);
	ArrayList Loaded = new ArrayList();
	for(int i=0;i<FileList.size();i++) {
	    ArrayList Temp = readLine((String)FileList.get(i));
	    Loaded.add(Temp);
	}
	return Loaded;
    }

    //read one line of CSV file
    public static ArrayList readLine(String Line){
	StringTokenizer st = new StringTokenizer(Line, ",");
	ArrayList<String> StringList = new ArrayList<String>();
	while (st.hasMoreTokens()) {
	    //1行の各要素をリストに格納
	    String elem=st.nextToken();
	    //arrElement.add( Integer.parseInt(elem) );
	    StringList.add( elem );
	}
	return (ArrayList)StringList;
    }

    //load file 
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


    //Constractor
    public CSVReader(){}



}
