package model;

public class Student {
    protected String name;
    protected int age;
    protected char gender;
    protected int ID_NO;

    public Student(String name, int age, char gender, int ID_NO) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_NO = ID_NO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getID() {
        return ID_NO;
    }

    public void setID(int id) {
        this.ID_NO = id;
    }

    public static void main(String[] args) {
        Student student = new Student("Andy", 13, 'F', 1);
        System.out.println("Name: " + student.getName() + "\nGender: " + student.getGender() + "\nAge: " + student.getAge() + "\nID_NO: " + student.getID());
    }
}
