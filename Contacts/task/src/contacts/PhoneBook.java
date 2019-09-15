package contacts;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Person> contacts = new ArrayList <>();

    public void addPerson(Person person) {
        contacts.add(person);
    }

    public void getList() {
        int i = 1;
        for (Person p: contacts) {
            System.out.println(i + ". " + p);
            i++;
        }
    }

    public void removePerson(int nextInt) {
        contacts.remove(nextInt-1);
    }

    public int getListSize() {
        return contacts.size();
    }

    public Person getPerson(int id){
        --id;
        return contacts.get(id);
    }

    public void editPerson(int index, Person person){
        --index;
        contacts.set(index, person);
    }

}
