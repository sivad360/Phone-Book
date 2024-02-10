public class PhoneBookManager {

    private Node head; // first node in list all other nodes are refrenced from here

    public PhoneBookManager(Person person){ // constructor must have at least one person

        this.head = new Node(person, null); //declare head node with reference node null

    }


    public void insertEnd(Person person){  // creates and inserts node at end 
        // of list based on person parameter

        Node newLastNode = new Node(person, null);

        Node oldLastNode = getLastNode();

        oldLastNode.setNextNode(newLastNode); // assign reference of old last
        // node to be new last node

    }

    public Node getIndexNode(int index) { // returns node at index of int index

        Node newNode = this.head;

        for(int i = 0; i < index; i ++) {

            newNode = newNode.nextNode; // iterate through list newnode 
            // equal to its own reference node

        }

        return newNode;
        
    }



    public Node getLastNode() { // returns last node in list
        
        boolean cont = true;
        Node currentNode = head;
        Node oldNode = currentNode;
        while(cont = true) {

            oldNode = currentNode; 
            currentNode = currentNode.getNextNode(); // reference of oldNode

            if (currentNode == null) { // check if reference node is null

                cont = false;

                return oldNode;

            }

        }

        return null;
        
    } // end getLastNode

    public Node getFirstNode() { // returnm head 
        
        return this.head;

    } // endGetFirstNode

    public void setFirstNode(Node nodeGiven){ // set head to  nodeGiven
        
        this.head = nodeGiven;

    } // end setFirstNode

}
