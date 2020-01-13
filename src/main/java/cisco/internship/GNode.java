package cisco.internship;

/**
 * This is an interface that will be used in other classes.
 */
public interface GNode {

    /**
     * This the name of the graph node (GNode).
     * @return a name of type String
     */
    String getName();

    /**
     * This function returns an array of children GNodes. When a GNode has no children,
     * it returns an array of size 0.
     * @return an array of type GNode
     */
    GNode[] getChildren();
}
