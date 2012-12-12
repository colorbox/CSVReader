package CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class LineReader{

    public LineReader(){}

    public static ArrayList lineRead(String Line){
	StringTokenizer st = new StringTokenizer(Line, ",");
	ArrayList StringList = new ArrayList<String>();
	while (st.hasMoreTokens()) {
	    //1行の各要素をリストに格納
	    String elem=st.nextToken();
	    //arrElement.add( Integer.parseInt(elem) );
	    StringList.add( elem );
	}
	return (ArrayList)StringList;
    }

}
