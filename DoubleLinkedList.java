public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list */
    // Take a Node object and adds it to the end of the linked list.
    // Set the newly added node's next pointer.
    public void add (Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail); // Set the previous pointer.
            this.tail = node;
        }
    } // method add

    // overload method add to add a node by value
    public void add(String value) {
        Node newNode = new Node(value);
        this.add(newNode);
    } // method add

    // Report the number of nodes present in the list.
    public int size() {
        return this.size();
    }

    // Return a negative integer number is A is smaller than B,
    // a positive integer number if A is greater than B,
    // and zero when A and B are the similar.
    public int compareTo(DoubleLinkedList other) {
        return this.size() - other.size();
    } // method compareTo

    public int indexOf(String value) {
        // Return is not found
        int index = 0;
        Node current = this.head;
            // Iterate while there are values to explore and the target value has not been found
            while (current != null) {
                // Update the search boolean
                if(value.equals(current.getValue())){
                    return index;
                }
            
          } // method indexOf

    // Return true if the list contains a node with the given string and false otherwise.
    public boolean contains(String value) {
      return this.indexOf(value) > -1;
    } // method contains
} // class DoubleLinkedList
