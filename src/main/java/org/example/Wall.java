package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){return  this.width;}
    public double getHeight(){return  this.height;}
    public void setWidth(double gelen){
        if(gelen<0){
            this.width = 0.0;
        }else {this.width = gelen;}
    }
    public void setHeight(double gelen){
        if(gelen<0){
            this.height = 0.0;
        }else {this.height = gelen;}
    }
    public double getArea(){
        return width*height;
    }
}
