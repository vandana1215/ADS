import java.util.*;

class Student{
    private String name;
    private int rollNumber;
    private int age;

    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "name=" + name + ", rollNumber=" + rollNumber + ", age=" + age ;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("abc", 12, 19));
        students.add(new Student("def", 21, 21));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}