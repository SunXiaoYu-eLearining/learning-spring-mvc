package cp01;

public class Student {
    private int id;
    private String name;
    private int age;
    private Classes classes;

    public Student(){}

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
