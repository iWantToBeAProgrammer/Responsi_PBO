/**
 * Person
 */
public class Person { //PARENT CLASS

    protected String name;
    protected String address;
    protected String hobi;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public void hobi() {
        System.out.println("hobi saya: " + hobi);
    }

    public String getAddress() {
        return address;
    }

    public void identity() {
        System.out.println("Nama: " + name);
        System.out.println("alamat: " + address);
    }
 
}