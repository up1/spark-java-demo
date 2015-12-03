package up1.demo.api.model;

public class Employee {
    public Long id;
    public String firstName;
    public String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
