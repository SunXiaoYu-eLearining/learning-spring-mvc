package cp03;

public class Person {
    private int id;
    private String name;
    private Car car;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString(){
        return "[id=" + id + ", name=" + name + ", car=" + car.toString() + "]";
    }
}
