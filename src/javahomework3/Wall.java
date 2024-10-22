package javahomework3;

public class Wall {
    //Write a class with the name Wall. The class needs two fields (instance variables) with name width
    //and height of type double.

    double width;
    double height;

    // No-arg constructor (default constructor)
    public Wall() {

    }
    public Wall(double width, double height) {
        // If width or height is less than 0, set them to 0
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
        // Method to get the width
        public double getWidth() {
            return width;
        }
    // Method to get the height
    public double getHeight() {
        return height;
    }
    // Method to set the width with validation
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
        }else{
            this.height = height;
        }
    }
    public double getArea(){
        return  width*height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }


    }

