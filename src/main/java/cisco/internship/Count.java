package cisco.internship;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

public class Count {

    public static void countWord(String file, Map<String, Integer> words) throws FileNotFoundException {
	Scanner input = new Scanner(new File(file));
	while (input.hasNext()) {
	    String word = input.next();
	    Integer count = words.get(word);
	    if (count != null) {
		count++;
	    } else {
		count = 1;
	    }
	    words.put(word, count);
	}
	input.close();
    }
}
