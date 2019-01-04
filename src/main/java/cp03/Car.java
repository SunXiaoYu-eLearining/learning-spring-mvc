package cp03;

public class Car {
    private int num;
    private String brand;

    public Car(int num, String brand){
        this.num = num;
        this.brand = brand;
    }

    public String toString(){
        return "[num=" + num + ", brand=" + brand + "]";
    }
}
