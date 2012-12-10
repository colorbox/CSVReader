package CSVReader;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import java.util.ArrayList;

public class TestLineReader{
    static private LineReader LR;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestLineReader.class);
    }

    @Before public void setUp() {
	LR = new LineReader();
    }

    @Test public void lineReadTest(){
	ArrayList test = LineReader.lineRead("1,2,3");
	assertEquals("1",test.get(0));
	assertEquals("2",test.get(1));
	assertEquals("3",test.get(2));
    }

}