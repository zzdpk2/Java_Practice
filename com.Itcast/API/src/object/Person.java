package object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String object.tostring.ToString(){
//        return "object.tostring.Person{ name: " + name + " , age: " + age + "};";
//    }


    @Override
    public String toString() {
        return "object.tostring.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if(o == this)   return true;
//
//        if(o instanceof Person){
//            Person p = (Person)o;
//            System.out.println(this.getName().equals(p.getName()) && this.getAge() == (p.getAge()));
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // verify the type of class under reflection
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
