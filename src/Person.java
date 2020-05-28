public class Person {

    private String name;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

}