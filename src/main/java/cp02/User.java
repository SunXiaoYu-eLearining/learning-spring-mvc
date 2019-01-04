package cp02;

public class User {
    private int id;
    private String name;
    private int age;

    public User(){
        System.out.println("User Object been Created");
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

    public String toString(){
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + "]";
    }
}
