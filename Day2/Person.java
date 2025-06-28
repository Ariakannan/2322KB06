class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    double basicSalary;

    public Employee(String name, int age, double basicSalary) {
        super(name, age);
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        // Simple salary calc with 10% bonus
        return basicSalary + (basicSalary * 0.10);
    }
}
