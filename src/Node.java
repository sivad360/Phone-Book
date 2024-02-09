

public class Node {
    
    Person person; 

    Node nextNode; // reference to the next node in the linked list 
    

    Node(Person person, Node nexNodeGiven){

        this.person = person; // initialize person field for new node

        this.nextNode = nexNodeGiven; // initialize reference to next
        // ListNode if null this is last ListNode in List if value then this
        //ListNode is inserted into List before position of nextListNode

    }// end ListNode constructor


    public Person getPerson() { // returns person object.

        return this.person;
       
    } 

    public Node getNextNode() {

        return this.nextNode;

    }

    public void setNextNode(Node nextNode) { //used to modify position of node in list

        this.nextNode = nextNode;

    }


}// end ListNode
