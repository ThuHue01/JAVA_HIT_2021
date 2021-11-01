package com.company;

public class Person<toString> {
    String name;
    int age;
    String gender;
    String hobby;
    public Person() {

    }
    public Person(String name, int age, String gender, String hobby)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String toString()
    {
        return "Person {" + "\nName: " + name + "\nAge: " + age
                + "\nGender: " + gender + "\nHobby: " + hobby + "\n}";
    }

    public static void main(String[] args) {
        Person p2 = new Person("Nguyen Thi Kim Dung", 20, "Female", "Traveling");
        System.out.println(p2.toString());

        Person p = new Person();
        p.setName("Dang Thi Thu Hue");
        p.setAge(20);
        p.setGender("Female");
        p.setHobby("Music");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Gender: " + p.getGender());
        System.out.println("Hobby: " + p.getHobby());
    }
}
