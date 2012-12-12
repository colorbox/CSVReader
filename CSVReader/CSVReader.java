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
	ArrayList FileList = FileLoader.loadFile(FileName);
	ArrayList Loaded = new ArrayList();
	for(int i=0;i<FileList.size();i++) {
	    ArrayList Temp = LineReader.lineRead((String)FileList.get(i));
	    Loaded.add(Temp);
	}
	return Loaded;
    }

    //Constractor
    public CSVReader(){}

}
