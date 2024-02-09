import java.util.Scanner;

public class Menu {

    public static void selector(char inputChar,PhoneBookManager phoneBook) { // method takes in 
        // a char representing the menu selection and an object representing the word search

        Scanner input = new Scanner(System.in);
        
        if (inputChar== 'p' ){ // if 'p' then add a new person to phone book
            
           Person newPerson = new Person(enterPerson());

           phoneBook.insertEnd(newPerson);

        } else if(inputChar == 's') { // print formatted word search

            System.out.printf("%s%n", "Please enter an int representing the index to search for");

            int index = input.nextInt();

            printPerson(phoneBook.getIndexNode(index).getPerson());

        } else if(inputChar == 'm') { //print formatted solution

            System.out.printf("%s%n", "Please enter an int representing the index of person to modify");

            int index = input.nextInt();

            System.out.printf("%s%n%s%n%s%n%s%n", "To modify first name please enter (f)", "To modify last name please enter (l)"
            , "To modify city please enter (c)", "To modify address please enter (a)", "To modify phone number please enter (n)");
            input.nextLine();

            char inputCharNew = Character.toLowerCase(input.next().charAt(0));

            System.out.print( "please enter a new value: ");

            input.nextLine();
            String inputString = input.nextLine();

            if(inputCharNew =='f') {
                
                Node node = phoneBook.getIndexNode(index);

                Person person = node.getPerson();

                Person newPerson = person.setCharacteristic(inputCharNew,inputString);
                
                node.setPerson(newPerson);
            }
                

        } else if(inputChar == 'q') {
            quit();
        }   
        
    }

    public static void welcome () { // welcome menu for opening program

        System.out.printf("%s%n", "Welcome to my phone book!");

    }

    public static void main(PhoneBookManager phoneBook){ // main menu runs in while loop

        System.out.printf("%s%n%s%n%s%n%s%n%s", "Please select an option:"
            , "add a new person (p)", "Search for a person (s)"
            , "modify a persons information(m)","print out the full phone book(f)","Quit the program (q)");

        Scanner input = new Scanner(System.in);
        char inputChar = Character.toLowerCase(input.next().charAt(0));

        selector(inputChar, phoneBook);

    }

    public static void quit(){
    System.exit(0);
    }

    // public static List<String> menuGenerate(){ // takes lines of user input stores them as strings.
    //     // then stores them as strings and puts them in a string list. returns list of strings

    //     Scanner input = new Scanner(System.in);
    //     List<String> WordList = new LinkedList<>();

    //     boolean cont = true;

    //     System.out.printf("%s%n%s%n", "Please enter the words which you would like to be a part of your word search."
    //         , "After every word press enter. Do not include spaces on. enter nothing to end entries.");

    //     while (cont == true ) {

    //         String currentString = input.nextLine();

    //         if (currentString.isEmpty()) {

    //             cont = false;

    //         } else {

    //             WordList.add(currentString);

    //         }

    //     }
        
    //     return WordList;

    // }

    public static void printPerson(Person person){

        System.out.println("First Name: " + person.getCharacteristic('f'));

        System.out.println("Last Name: " + person.getCharacteristic('l'));

        System.out.println("City: " + person.getCharacteristic('c'));

        System.out.println("Street: " + person.getCharacteristic('s'));

        System.out.println("Address: " + person.getCharacteristic('a'));

        System.out.println("Phone Number: " + person.getCharacteristic('p'));

    }

    public static Person enterPerson(){

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n", "You have chosen to enter a new person", "Please enter the persons first name: ");

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

        Person person = new Person(firstName, lastName, city, street, address, phoneNumber);

        return person;

    }




}
