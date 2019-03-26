package com.example.demo.Graph;

public class Edge<T> {

    T v1;
    T v2;
    int weight;

    public Edge(T v1, T v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public T getV1() {
        return v1;
    }

    public void setV1(T v1) {
        this.v1 = v1;
    }

    public T getV2() {
        return v2;
    }

    public void setV2(T v2) {
        this.v2 = v2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
