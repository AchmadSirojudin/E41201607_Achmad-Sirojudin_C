package TreeApp;

public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;

    public void dislayNode() {
        System.out.println("{ " + id + ", " + data + " } ");
    }
}
