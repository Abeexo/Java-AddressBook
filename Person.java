package adressbookmain;

public class Person {
    public String name;
    public String surname;
    public String phone;

    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String toString() {
        return "Name:" + this.name + "\n" +
                "Surname:" + this.surname + "\n" +
                "Phone:" + this.phone + "\n";
    }
}
