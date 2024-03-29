//Name: Davis Tyler
//Class: CS145
//Date: 2/7/2024
//Program: Phone Book
//File: person
//references: Lectures, https://www.devglan.com/datastructure/linkedlist-implementation-java
//purpose: This program creates a linked list which is made up of people The program gives
// the option to print out, search for, delete, or modify individuals
public class Person { 
    
    private String firstName; 
    private String lastName;
    private String city;
    private String street;
    private String address;
    private String phoneNumber;

    public Person(String firstNameGiven, String lastNameGiven, String cityGiven
    , String streetGiven, String addressGiven, String phoneNumberGiven){

        this.firstName = firstNameGiven; // initialize characteristics for new node
        this.lastName = lastNameGiven;
        this.city = cityGiven;
        this.street = streetGiven;
        this.address = addressGiven;
        this.phoneNumber = phoneNumberGiven;

    }// end person constructor

    public Person(Person newPerson){

        // initialize characteristics for new node 
        this.firstName = newPerson.getCharacteristic('f'); 
        this.lastName = newPerson.getCharacteristic('l');
        this.city = newPerson.getCharacteristic('c');
        this.street = newPerson.getCharacteristic('s');
        this.address = newPerson.getCharacteristic('a');
        this.phoneNumber = newPerson.getCharacteristic('p');

    }// end person constructor

    public String getCharacteristic(char type) {
        //method to return characteristics of node takes type
        // to determine which characteristic and returns String representing
        // the value of that type.

        if( type == 'f'){

            return this.firstName;

        } else if( type == 'l') {

            return this.lastName;

        } else if( type =='c') {

            return this.city;

        } else if( type =='s') {

            return this.street;

        } else if( type == 'a'){

            return this.address;

        } else if( type == 'p') {

            return this.phoneNumber;

        } 

        return this.address;



    } // end getCharacteristic()

    public Person setCharacteristic(char type, String value) { // creates new
        // person with all the same characteristics except one determined by
        // type to value 

        if( type == 'f'){ // set first name to value

            Person person = new Person(value, this.lastName, this.city
            , this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type == 'l') {// set last name to value

            Person person = new Person(this.firstName, value, this.city
            , this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='c') { // set city to value

            Person person = new Person(this.firstName, this.lastName, value
            , this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='s'){ // set street value

            Person person = new Person(this.firstName, this.lastName, this.city
            , value, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='a') { // set address to value

            Person person = new Person(this.firstName, this.lastName, this.city
            , this.street, value, this.phoneNumber);
            
            return person;

        } else if( type =='p') { // set phone number to value

            Person person = new Person(this.firstName, this.lastName, this.city
            , this.street, this.address, value);
            
            return person;

        }

        return null;

    } // end setCharacteristic()

}
