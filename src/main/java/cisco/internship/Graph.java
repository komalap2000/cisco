package cisco.internship;

import java.util.ArrayList;
import java.util.Stack;

/**
 * This class will implement the GNode interface and it will be dealing 
 * will graphs.
 */
public class Graph implements GNode {
    private String node;
    private GNode[] children;

    private ArrayList<GNode> list = new ArrayList<>(); 
    private ArrayList<ArrayList<GNode>> finalLt = new ArrayList<>();
    private Stack<GNode> stack = new Stack<>();
    private ArrayList<GNode> temporaryLt = new ArrayList<>();
    
    GNode[] empty = new GNode[0];

    
    /**
     * This is the constructor for this class.
     * @param node setting the node
     */
    public Graph(String node) {
        this.node = node;
    }


    /**
     * This method sets the current child in the array.
     * @param children the new children that is going to be 
     * set.
     */
    public void setChild(GNode[] children) {
        int length = children.length;
        this.children = new GNode[length];
        int counter = 0;
        
        // will loop through the array and add / instantiate
        for (int i = 0; i < children.length; i++) {
            this.children[i] = children[i];
            counter += 1;
        }
    }

    
    /**
     * This will return the name of the node.
     * @return the node
     */
    public String getName() {
        return this.node;
    }


    /**
     * This will return the children in the array. If it is 
     * null, then return null.
     * @return the children in the array.
     */
    public GNode[] getChildren() {
        // checks to see if it is null
        if (this.children == null) {
            return empty;
        } else {
            return this.children;
        }
    }



    /**
     * This will return the name of the node.
     * @return the name of the string / node
     */
    public String toString() {
        return this.getName();
    }


    
    /**
     * This will return an ArrayList containing every GNode in the graph. Each
     * node should appear in the ArrayList exactly once (i.e. no duplicates).
     * @param temp the temporary GNode
     * @return Arraylist containing every GNode in the graph.   
     */
    public ArrayList<GNode> walkGraph(GNode temp) {
        // will get the name of the node and add it to the list
        String name = temp.getName();
        list.add(temp);
        for (GNode child : temp.getChildren()) {
            walkGraph(child);
        }
        
        return list;
    }


    /**
     * This will return an ArrayList that represents all possible paths through 
     * the graph starting at 'node'. The ArrayList returned can be thought of as 
     * paths, where each path is represented as an ArrayList of GNodes.
     * @param node the different possibilities of how a graph can look starting 
     * at this node
     * @return an ArrayList of all the possible paths
     */
    public ArrayList<ArrayList<GNode>> paths(GNode node) {
        stack.push(node);
        temporaryLt.add(node);
        // performs the actions while the stack is not empty
        while (!stack.isEmpty()) {
            GNode curTempNode = stack.peek();
            GNode[] children = curTempNode.getChildren();

            // checks to see if it empty / 0
            if (children.length == 0) {
                finalLt.add(new ArrayList<GNode>(temporaryLt));
            }

            for (GNode child : children) {
                paths(child);

                stack.pop();
                temporaryLt.remove(temporaryLt.size() - 1);
            }
            break;
        }
        return finalLt;
    }

}
