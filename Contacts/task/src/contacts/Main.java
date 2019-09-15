package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook contacts = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter action (add, remove, edit, count, list, exit): ");
            String input = scanner.nextLine();
            switch (input){
                case "add":
                    Person person = new Person();
                    System.out.println("Enter the name: ");
                    person.setName(scanner.nextLine());
                    System.out.println("Enter the surname: ");
                    person.setSurname(scanner.nextLine());
                    System.out.println("Enter the number: ");
                    person.setPhoneNumber(scanner.nextLine());
                    contacts.addPerson(person);
                    System.out.println("The record added.");
                    break;
                case "remove":
                    if (contacts.getListSize() != 0){
                        contacts.getList();
                        System.out.println("Select a record: ");
                        contacts.removePerson(Integer.parseInt(scanner.nextLine()));
                        System.out.println("The record removed!");
                    } else {
                        System.out.println("No records to remove!");
                    }
                    break;
                case "edit":
                    if (contacts.getListSize() != 0){
                        contacts.getList();
                        System.out.println("Select a record: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        Person person1 = contacts.getPerson(index);
                        System.out.println("Select a field (name, surname, number): ");
                        switch (scanner.nextLine()){
                            case "name":
                                System.out.println("Enter the name: ");
                                person1.setName(scanner.nextLine());
                                break;
                            case "surname":
                                System.out.println("Enter the surname: ");
                                person1.setSurname(scanner.nextLine());
                                break;
                            case "number":
                                System.out.println("Enter the number: ");
                                person1.setPhoneNumber(scanner.nextLine());
                                break;
                            default:
                                System.out.println("Wrong field!");
                                break;
                        }
                        contacts.editPerson(index, person1);
                        System.out.println("The record updated!");
                    } else {
                        System.out.println("No records to edit!");
                    }
                    break;
                case "count":
                    System.out.println("The Phone Book has "+ contacts.getListSize() +" records.");
                    break;
                case "list":
                    contacts.getList();
                    break;
                case "exit":
                    return;
            }
        }

    }
}
