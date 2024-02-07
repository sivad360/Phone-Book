public class ListNode {
    
    String firstName; 
    String lastName;
    String city;
    int address;
    int phoneNumber;
    // characteristics of ListNode represents information about a person in
    // the phone book.

    ListNode nextListNode; // reference to the next node in the linked list 
    

    ListNode(String firstNameGiven, String lastNameGiven, String cityGiven, int addressGiven
    , int phoneNumberGiven, ListNode nexListNodeGiven){

        this.firstName = firstNameGiven; // initialize characteristics for new node
        this.lastName = lastNameGiven;
        this.city = cityGiven;
        this.address = addressGiven;
        this.phoneNumber = phoneNumberGiven;

        this.nextListNode = nexListNodeGiven; // initialize reference to next
        // ListNode if null this is last ListNode in List if value then this
        //ListNode is inserted into List before position of nextListNode

    }// end ListNode constructor


    public String getCharacteristicString(char type) {
        //method to return characteristics of node of type String takes type
        // to determine which characteristic and returns String representing
        // the value of that type.

        if( type == 'f'){

            return firstName;

        } else if( type == 'l') {

            return lastName;

        } else if( type =='c') {

            return city;
        }

        return firstName;

    } // end getCharacteristicString()


    public int getCharacteristicInt(char type) {
        //method to return characteristics of ListNode of type int takes type
        // to determine which characteristic and returns int representing
        // the value of that type.

        if( type == 'a'){

            return address;

        } else if( type == 'p') {

            return phoneNumber;

        } 

        return address;

    } // end getCharacteristicInt()


    public void setCharacteristic(char type, String valueString, int valueInt) {

        if( type == 'f'){

            this.firstName = valueString;

        } else if( type == 'l') {

            this.lastName = valueString;

        } else if( type =='c') {

            this.city = valueString;

        } else if( type =='a') {

            this.address = valueInt;

        } else if( type =='p') {

            this.phoneNumber = valueInt;

        }


    } // end setCharacteristic()


}// end ListNode
