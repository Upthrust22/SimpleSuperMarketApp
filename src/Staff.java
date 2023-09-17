public class Staff {
    private String name;
    private short age;
    private String id;
    private double salary;

    public Staff(String name, short age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Staff(String name, short age, String id, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }




    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
