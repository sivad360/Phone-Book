public class Person {
    
    private String firstName; 
    private String lastName;
    private String city;
    private String street;
    private String address;
    private String phoneNumber;

    public Person(String firstNameGiven, String lastNameGiven, String cityGiven, String streetGiven, String addressGiven
    , String phoneNumberGiven){

        this.firstName = firstNameGiven; // initialize characteristics for new node
        this.lastName = lastNameGiven;
        this.city = cityGiven;
        this.street = streetGiven;
        this.address = addressGiven;
        this.phoneNumber = phoneNumberGiven;

    }// end person constructor

    public Person(Person newPerson){

        this.firstName = newPerson.getCharacteristic('f'); // initialize characteristics for new node
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

    public Person setCharacteristic(char type, String value) {

        if( type == 'f'){

            Person person = new Person(value, this.lastName, this.city, this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type == 'l') {

            Person person = new Person(this.firstName, value, this.city, this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='c') {

            Person person = new Person(this.firstName, this.lastName, value, this.street, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='s'){ 

            Person person = new Person(this.firstName, this.lastName, this.city, value, this.address, this.phoneNumber);
            
            return person;

        } else if( type =='a') {

            Person person = new Person(this.firstName, this.lastName, this.city, this.street, value, this.phoneNumber);
            
            return person;

        } else if( type =='p') {

            Person person = new Person(this.firstName, this.lastName, this.city, this.street, this.address, value);
            
            return person;

        }

        return null;

    } // end setCharacteristic()

}
