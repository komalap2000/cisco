package cisco.internship;

public interface GNode {

    /**
     * This the name of the graph node (GNode)
     */
    String getName();

    /**
     * This function returns an array of children GNodes. When a GNode has no children,
     * it returns an array of size 0.
     *
     * @return
     */
    GNode[] getChildren();
}
