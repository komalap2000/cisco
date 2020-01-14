package cisco.internship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;

/**
 * This will be the tester class.
 */
public class Driver {

    /**
     * This is the main method where it will be tested.
     * @param args part of the main method
     * @throws FileNotFoundException if the file isn't found
     */
    public static void main(String[] args) throws FileNotFoundException {
        Count obj = new Count();
        
        // using the nodes provided in the graph
        Graph A = new Graph("A");
        Graph B = new Graph("B");
        Graph C = new Graph("C");
        Graph D = new Graph("D");
        Graph E = new Graph("E");
        Graph F = new Graph("F");
        Graph G = new Graph("G");
        Graph H = new Graph("H");
        Graph I = new Graph("I");
        Graph J = new Graph("J");

        // using the example in the document
        GNode[] aChildren = new GNode[] {B, C, D};
        A.setChild(aChildren);

        // using the example in the document 
        GNode[] bChildren = new GNode[] {E, F};
        B.setChild(bChildren);

        // using the example in the document 
        GNode[] cChildren = new GNode[] {G, H, I};
        C.setChild(cChildren);

        // using the example in the document 
        GNode[] dChildren = new GNode[] {J};
        D.setChild(dChildren);

        // Problem 1
        System.out.println("Solution to problem 1 is provided below");
        ArrayList<GNode> finalNodes = A.walkGraph(A);
        System.out.println("The ArrayList that contains each node in the graph are: " + finalNodes);
        System.out.println();
        
        // Problem 2
        ArrayList<ArrayList<GNode>> arrayPaths = A.paths(A);
        System.out.println("Solution to problem 2 is provided below");
        System.out.println("The ArrayList of the possible paths are: " + arrayPaths);
        System.out.println();
        
        // Problem 3
        System.out.println("Solution to problem 3 is provided below");
        Map<String, Integer> words = new HashMap<String, Integer>();
        obj.countWord("tests/test02.txt", words);
        System.out.println(words);
    }
}
