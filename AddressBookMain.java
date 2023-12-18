package adressbookmain;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        int choise, nToAdd;
        String textOfSearch, searchText;
        Scanner input = new Scanner(System.in);
        AddressBook a = new AddressBook(10);

        do {
            System.out.println("MENU");
            System.out.println("Write 0 to exit");
            System.out.println("Write 1 to add a decided number of People in PhoneBook");
            System.out.println("Write 2 to remove a person from PhoneBook");
            System.out.println("Write 3 to find a person from PhoneBook");
            System.out.println("Write 4 to view the phonebook");
            choise = input.nextInt();
            switch (choise) {
                case 0:
                    System.out.println("Exit from menu");
                    break;
                case 1:
                    String Name, Surname;
                    String phoneNumber;
                    System.out.println("Define the number of people to add");
                    nToAdd = input.nextInt();
                    for (int i = 0; i < nToAdd; i++) {
                        System.out.println("Type the name");
                        Name = input.next();
                        System.out.println("Type the surname");
                        Surname = input.next();
                        System.out.println("Type the phoneNumber");
                        phoneNumber = input.next();
                        a.addPerson(Name, Surname, phoneNumber);
                    }
                    break;
                case 2:
                    System.out.println("Type the name, surname or phone number of the Person to remove");
                    textOfSearch = input.next();
                    a.removePerson(textOfSearch);
                    break;
                case 3:
                    System.out.println("Type the name, surname or phone number of the Person to find");
                    searchText = input.next();
                    System.out.println(a.search(searchText));
                    break;
                case 4:
                    System.out.println("The phonebook contacts are");
                    System.out.println(a);
                    break;
                default:
                    System.out.println("Write a value from 0 to 4");
                    System.out.println("Write 0 to exit");
                    System.out.println("Write 1 to add a decided number of People in PhoneBook");
                    System.out.println("Write 2 to remove a person from PhoneBook");
                    System.out.println("Write 3 to find a person from PhoneBook");
                    System.out.println("Write 4 to view the phonebook");
            }
        } while (choise != 0);
    }
}
