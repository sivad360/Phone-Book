//Name: Davis Tyler
//Class: CS145
//Date: 2/7/2024
//Program: Phone Book
//File: Test
//references: Lectures, https://www.devglan.com/datastructure/linkedlist-implementation-java
//purpose: This program creates a linked list which is made up of people The program gives
// the option to print out, search for, delete, or modify individuals

public class Test {
    public static void main(String[] args){

        // three random people to populate phone book
    Person firstPerson = new Person("John","Doe" 
    ,"Bellingham","Lakeway Dr","1234","123-456-7890");

    Person secondPerson = new Person("Jane","Doe"
    ,"Seattle","Rainer Ave","5678","123-456-7890");
    
    Person thirdPerson = new Person("Jake","Doe"
    ,"Spokane","1st Ave","9012","123-456-7890");


    PhoneBookManager phoneBook = new PhoneBookManager(firstPerson); 
    // initialize phone book with first person

    phoneBook.insertEnd(secondPerson); // add 2 other people
    phoneBook.insertEnd(thirdPerson);

    Menu.welcome();
    
    while(true) { // loop through calling menu each time. 
        Menu.main(phoneBook);
    }

    

    
    }

}
