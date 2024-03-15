//Name: Davis Tyler
//Class: CS145
//Date: 2/7/2024
//Program: Phone Book
//File: Menu
//references: Lectures, https://www.devglan.com/datastructure/linkedlist-implementation-java
//purpose: This program creates a linked list which is made up of people The program gives
// the option to print out, search for, delete, or modify individuals

import java.util.Scanner;

public class Menu {

    public static void selector(char inputChar,PhoneBookManager phoneBook) { 
        // method takes in a char representing the menu selection and an object 
        // representing the word search

        Scanner input = new Scanner(System.in);
        
        if (inputChar== 'p' ){ // if 'p' then add a new person to phone book
            
           Person newPerson = new Person(enterPerson());

           phoneBook.insertEnd(newPerson);

        } else if(inputChar =='b') { // add person to beginning of list
            
            Person newPerson = new Person(enterPerson());

            Node oldNode = phoneBook.getFirstNode();

            Node newNode = new Node(newPerson, oldNode);

            phoneBook.setFirstNode(newNode);

        } else if(inputChar == 's') { // print formatted word search

            System.out.printf("%s%n"
            , "Please enter an int representing the index to search for");

            int index = input.nextInt();

            printPerson(phoneBook.getIndexNode(index).getPerson());

        } else if(inputChar == 'm') { // modify a person in the phone book

            System.out.printf("%s%n"
            , "Please enter an int representing the index of person to modify");

            int index = input.nextInt(); // index represents which node

            System.out.printf("%s%n%s%n%s%n%s%n%s%n" // prompt for which characteristic
            , "To modify first name please enter (f)"
            , "To modify last name please enter (l)"
            , "To modify city please enter (c)"
            , "To modify address please enter (a)"
            , "To modify phone number please enter (n)");
            input.nextLine();

            char inputCharNew = Character.toLowerCase(input.next().charAt(0));

            System.out.print( "please enter a new value: "); // prompt for value
            // for characteristic

            input.nextLine();
            String inputString = input.nextLine(); 
                
            Node node = phoneBook.getIndexNode(index);

            Person person = node.getPerson(); // get person out of node

            Person newPerson = person.setCharacteristic(inputCharNew,inputString);
            // set characteristic to value 
            
            node.setPerson(newPerson); // put modified person back in node
                
        } else if(inputChar =='i') { // new node and person at index

            int index = 0;

            while(index <= 0) {

            System.out.printf("%s%n" // prompt for index
            , "please enter an index greater than 0, to insert a new person at");
            index = input.nextInt();

            }
            
            Person newPerson = new Person(enterPerson());

            Node oldNode = phoneBook.getIndexNode(index);

            Node previousNode = phoneBook.getIndexNode(index-1);

            Node newNode = new Node(newPerson, oldNode);

            previousNode.setNextNode(newNode);

            

        } else if(inputChar =='f') { // print out all persons in phone book

            Node newNode = phoneBook.getFirstNode();

            boolean cont = true;
            
            while(cont == true) { // loop through all nodes

                printPerson(newNode.getPerson());
                
                newNode = newNode.getNextNode();

                if(newNode == null) {
                    cont = false;
                }
            }
        } else if(inputChar =='d') {



            System.out.printf("%s%n" // prompt for index
            , "please enter an index to delete");
            int index = input.nextInt();

            if(index ==0) {

                phoneBook.setFirstNode(phoneBook.getIndexNode(1));

            } else if( index >0) {

                Node previousNode = phoneBook.getIndexNode(index-1);
                previousNode.setNextNode(phoneBook.getIndexNode(index+1));

            }

        } else if(inputChar == 'q') {
            quit();
        }   
        
    }

    public static void welcome () { // welcome menu for opening program

        System.out.printf("%n%n%s%n%n", "Welcome to my phone book!");

    }

    public static void main(PhoneBookManager phoneBook){  // prompt for char
        // entry to determine which option

        System.out.printf("%s%n%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s"
            , "Please select an option:"
            , "add a new person at the end of the phone book (p)"
            ,"add a new person at the beginning of the phone book (b)"
            , "add a new person at a given index (i)", "Search for a person (s)"
            , "modify a persons information (m)","print out the full phone book (f)"
            , "delete a person at a given index (d)"
            ,"Quit the program (q)");

        Scanner input = new Scanner(System.in);
        char inputChar = Character.toLowerCase(input.next().charAt(0));

        selector(inputChar, phoneBook);

    }

    public static void quit(){
    System.exit(0);
    }

    public static void printPerson(Person person){ // print each characteristic

        System.out.println("First Name: " + person.getCharacteristic('f'));

        System.out.println("Last Name: " + person.getCharacteristic('l'));

        System.out.println("City: " + person.getCharacteristic('c'));

        System.out.println("Street: " + person.getCharacteristic('s'));

        System.out.println("Address: " + person.getCharacteristic('a'));

        System.out.println("Phone Number: " + person.getCharacteristic('p'));

        System.out.println();

    }

    public static Person enterPerson(){ // prompt and store for each person
        // characteristic

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n", "You have chosen to enter a new person"
        , "Please enter the persons first name: ");

        String firstName = input.nextLine();

        System.out.printf("%s%n","Please enter the persons last name: ");

        String lastName = input.nextLine();

        System.out.printf("%s%n","Please enter the persons city: ");

        String city = input.nextLine();

        System.out.printf("%s%n","Please enter the persons street: ");

        String street = input.nextLine();

        System.out.printf("%s%n","Please enter the persons address: ");

        String address = input.nextLine();

        System.out.printf("%s%n","Please enter the persons phone number: ");

        String phoneNumber = input.nextLine();

        Person person = new Person(firstName, lastName, city, street, address
        , phoneNumber);

        return person;

    }




}
