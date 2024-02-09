import java.util.Scanner;

public class Menu {

    // public static Objects selector(char inputChar, Objects MyObjects) { // method takes in 
    //     // a char representing the menu selection and an object representing the word search
        
    //     if (inputChar== 'g' ){ // if 'g' then generate new wordsearch
            
    //         Objects MyObjectsNew = new Objects(menuGenerate()); // call menugenerate and pass
    //         // the word list to the constructor method.

    //         return MyObjectsNew;

    //     } else if(inputChar == 'p') { // print formatted word search

    //         print(MyObjects, 'm');

    //     } else if(inputChar == 's') { //print formatted solution

    //         print(MyObjects,'s');

    //     } else if(inputChar == 'q') {
    //         quit();
    //     }   

        
    //     return MyObjects;
        
    // }

    public static void welcome () { // welcome menu for opening program

        System.out.printf("%s%n%s%n", "Welcome to my phone book!");

    }

    // public static char main(PhoneBookManager phoneBook){ // main menu runs in while loop

    //     System.out.printf("%s%n%s%n%s%n%s%n%s", "Please select an option:"
    //         , "add a new person (p)", "Search for a person (s)"
    //         , "modify a persons information(m)","print out the full phone book(f)","Quit the program (q)");

    //     Scanner input = new Scanner(System.in);
    //     char inputChar = Character.toLowerCase(input.next().charAt(0));

    //     return inputChar;

    // }

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
