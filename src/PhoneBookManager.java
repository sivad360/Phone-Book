public class PhoneBookManager {

    private Node head;

    public PhoneBookManager(Person person){

        this.head = new Node(person, null);

    }


    public void insertEnd(Person person){

        Node newLastNode = new Node(person, null);

        Node oldLastNode = getLastNode();

        oldLastNode.setNextNode(newLastNode);

    }

    public Person getIndexNode(int index) {
        
        
    }


    public Node getLastNode() {
        
        boolean cont = true;
        Node currentNode = head;
        Node oldNode = currentNode;
        while(cont = true) {

            oldNode = currentNode;
            currentNode = currentNode.getNextNode();

            if (currentNode == null) {

                cont = false;

                return oldNode;

            }

        }

        return null;
    }

    public Node getFirstNode() {
        
        return this.head;

    }
    public void setCharacteristic(int index, char type, String valueString, int valueint) {

        if( type == 'f'){

        } else if( type == 'l') {

        } else if( type =='c') {

        } else if( type =='a') {

        } else if( type =='p') {

        }


    }

}
