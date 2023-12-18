package adressbookmain;

public class AddressBook {
    public Person[] people;

    public AddressBook(int listPeopleLength) {
        this.people = new Person[listPeopleLength];
    }

    public void addPerson(String name, String surname, String phone) {
        this.addPerson(new Person(name, surname, phone));
    }

    public void addPerson(Person person) {
        for (int i = 0; i < this.people.length; i++) {
            if (this.people[i] == null) {
                this.people[i] = person;
                return;
            }
        }
    }

    public void removePersonByIndex(int index) {
        if (index >= 0 && index < this.people.length) {
            this.people[index] = null;
        }
    }

    public void removePerson(String textOfSearch) {
        for (int i = 0; i < this.people.length; i++) {
            if (people[i] != null && (people[i].name.toLowerCase().contains(textOfSearch.toLowerCase()) ||
                    people[i].surname.toLowerCase().contains(textOfSearch.toLowerCase()) ||
                    people[i].phone.toLowerCase().contains(textOfSearch.toLowerCase()))) {
                people[i] = null;
                return;
            }
        }
    }

    public String search(String textOfSearch) {
        Person[] filteredPeople = new Person[people.length];
        String response = "";
        for (int i = 0; i < this.people.length; i++) {
            Person pi = this.people[i];
            if (pi != null && (pi.name.toLowerCase().contains(textOfSearch.toLowerCase()) ||
                    pi.surname.toLowerCase().contains(textOfSearch.toLowerCase()) ||
                    pi.phone.toLowerCase().contains(textOfSearch.toLowerCase()))) {
                filteredPeople[i] = pi;
                response += this.people[i].toString();
            }
        }
        return response;
    }

    public String toString() {
        String response = "";
        for (int i = 0; i < this.people.length; i++) {
            if (this.people[i] != null) {
                response += this.people[i].toString() + "\n";
            }
        }
        return response;
    }
}
