class Employee {
    private int id;
    private int salary;
    private String firstName;
    private String lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId(){ return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getName(){return firstName + " " + lastName;}
    public int getSalary() {return salary;}
    public int getAnnualSalary() {return 12*salary;}
    
}

public class class2 {
    public static void main(String[] args) {

         Employee emp = new Employee(101, 250000, "Roronoa", "Zoro");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Full Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

    }
}
