package main.java.seminar.seminar4.task1;

public class GenBox<T> {
    T obj;

    public GenBox() {
    }

    public GenBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
