//Name: Davis Tyler
//Class: CS145
//Date: 2/7/2024
//Program: 


public class Test {
    public static void main(String[] args){

    Person firstPerson = new Person("John","Doe","Bellingham","Lakeway Dr","1234","123-456-7890");

    Person secondPerson = new Person("Jane","Doe","Seattle","Rainer Ave","5678","123-456-7890");
    
    Person thirdPerson = new Person("Jake","Doe","Spokane","1st Ave","9012","123-456-7890");


    PhoneBookManager phoneBook = new PhoneBookManager(firstPerson);

    phoneBook.insertEnd(secondPerson);
    phoneBook.insertEnd(thirdPerson);

    // Menu.printPerson(phoneBook.getFirstNode().getPerson());

    // Menu.printPerson(phoneBook.getIndexNode(1).getPerson());

    // Menu.printPerson(phoneBook.getLastNode().getPerson());

    Menu.welcome();
    
    while(true) {
        Menu.main(phoneBook);
    }

    

    
    }

}