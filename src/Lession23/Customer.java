package Lession23;

public class Customer implements Comparable<Customer>{
    int id;
    String name;

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer {" + this.getId() + "," + this.getName() + "}";
    }

    @Override
    public int compareTo(Customer that) {
        return this.getName().compareToIgnoreCase(that.getName());
    }
}
