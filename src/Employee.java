class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return "Employee: " + super.toString();
    }

    public String getPosition() {
        return position;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}