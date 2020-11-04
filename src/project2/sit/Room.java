package project2.sit;

public class Room {
    private double length;
    private double width;
    private double height;
    private String colour;

    // calculeaza arie;
    public double getArea(){
        return length*width;
    }

    //lungime
    public double getLength() {
        return length;
    }
    public void setLength(double l){
        length=l;
    }
    //latime
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width=w;
    }
    //inaltime
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height=h;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


}

