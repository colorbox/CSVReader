import CSVReader.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class test{

    public static void printList(ArrayList<ArrayList> list){
	for(int i=0;i<list.size();i++){
	    for(int j=0;j<list.get(i).size();j++){
	     	System.out.print((list.get(i).get(j))+",");
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args){
	/*
	ArrayList test = FileLoader.loadFile("test.csv");
	for(int i=0;i<test.size();i++) {
	    ArrayList Temp = LineReader.lineRead((String)test.get(i));
	    Loaded.add(Temp);
	}
	*/

	ArrayList Loaded = CSVReader.readCSV("test.csv");
	printList(Loaded);
    }



}
