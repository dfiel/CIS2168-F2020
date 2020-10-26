public class TestSLList2 {
    public static void main(String[] args) {
        Node<String> node2 = new Node<>("World");
        Node<String> node1 = new Node<>("Hello", node2);

        for(Node current = node1; current != null; current = current.next){
            System.out.print(current.data + " ");
        }
    }
}
