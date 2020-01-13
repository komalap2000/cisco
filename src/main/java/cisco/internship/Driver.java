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

	GNode[] aChildren = new GNode[] {B, C, D};
	A.setChild(aChildren);

	GNode[] bChildren = new GNode[] {E, F};
	B.setChild(bChildren);
	
	GNode[] cChildren = new GNode[] {G, H, I};
	C.setChild(cChildren);
	
	GNode[] dChildren = new GNode[] {J};
        D.setChild(dChildren);
	
        System.out.println("Solutions to problems 1 and 2 are provided below");

	// Problem 1
	ArrayList<GNode> finalNodes = A.walkGraph(A);
	System.out.println("The ArrayList that contains each node in the graph are: " + finalNodes);

	// Problem 2
	ArrayList<ArrayList<GNode>> arrayPaths = A.paths(A);
	System.out.println("The ArrayList of the possible paths are: " + arrayPaths);

	// Problem 3
	Map<String, Integer> words = new HashMap<String, Integer>();
        obj.countWord("tests/test02.txt", words);
        System.out.println(words);
    }
}
