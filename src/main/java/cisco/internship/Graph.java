
package cisco.internship;

import java.util.ArrayList;
import java.util.HashSet;

public class Graph {
    private String node;
    private GNode[] child;
    
    GNode[] empty = new GNode[0];
    private ArrayList<GNode> list = new ArrayList<>(); 
    private ArrayList<ArrayList<GNode>> finalList = new ArrayList<>();
    /**
     * This is the constructor for this class.
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
        this.child = new GNode[length];
        int counter = 0;
        
        for (int i = 0; i < children.length; i++) {
            children[i] = child[i];
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
        if (child == null) {
            return empty;
        } else {
            return child;
        }
    }
    
    
    public ArrayList walkGraph(GNode temp) {
        list.add(temp);
        for (GNode cd : temp.getChildren()) {
            walkGraph(cd);
           
        }
        return list;
    }

    /*
    public ArrayList paths(GNode node) {
	
    }
    */
}
