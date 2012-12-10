import CSVReader.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class test{
    public static void main(String[] args){
	ArrayList test = FileLoader.loadFile("test.csv");
	for(int i=0;i<test.size();i++) {
	    System.out.println(test.get(i));
	}
	
    }



}
