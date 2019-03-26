package com.example.demo.Graph;

public class Vertex implements Comparable<Vertex> {

    int x;
    int y;
    String name;
    private int lengthFromStart=Integer.MAX_VALUE;

    public Vertex(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public int getLengthFromStart() {
        return lengthFromStart;
    }

    public void setLengthFromStart(int lengthFromStart) {
        this.lengthFromStart = lengthFromStart;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Vertex o) //returnerer -1, 0, 1
    {
        if(this.getLengthFromStart() > o.getLengthFromStart()){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString(){
        return name;
    }

}
