package javaprograms;
//15. Wall Area
//Write a class with the name Wall. The class needs two fields (instance variables) with name width
//and height of type double
public class Wall {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
    private double width;
    private double height;

    //First constructor (no-args constructor)
    public Wall(){

    }
    //second constructor
    public Wall(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getArea() {
        return this.width * this.height;
    }
}
