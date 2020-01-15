package cisco.internship;

import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class will count the number of occurrences of a word in a text file.
 */
public class Count {
    /**
     * This method will count words.
     * @param file read in the words
     * @param words each word will be counted
     * @throws FileNotFoundException if there is no file found
     */
    static void countWord(String file, Map<String, Integer> words) throws FileNotFoundException {
        // reads in the file
        Scanner input = new Scanner(new File(file));

        /*
         * Checks to see if it has a next and performs the operation of how many of the same words
         * there are.
         */
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
