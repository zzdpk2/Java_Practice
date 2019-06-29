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

    @Override
    public boolean equals(Object o) {
        if(o instanceof Person){
            Person p = (Person)o;
            System.out.println(this.name.equals(p.getName()) && this.age == (p.age));
        }
        return false;
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
