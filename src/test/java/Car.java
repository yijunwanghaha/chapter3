public class Car {

    private String name;
    private  String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(){}
    public Car(String _name,String _color){
        this.name=_name;
        this.color=_color;
    }
    public void showInfo(){
        System.out.print(name+": "+color);
    }
}
