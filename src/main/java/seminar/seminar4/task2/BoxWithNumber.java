package main.java.seminar.seminar4.task2;

public class BoxWithNumber<E extends Number>{
    private E[] obj;

    public BoxWithNumber(E... obj) {
        this.obj = obj;
    }

    public BoxWithNumber() {
    }

    public Double average() {
        Double result = 0.0;
        for (E el : obj) {
            result += el.doubleValue();
        }
        return result / obj.length;
    }

    public E[] getObj() {
        return obj;
    }

    public void setObj(E[] obj) {
        this.obj = obj;
    }
    public Boolean compareAverage(BoxWithNumber<? extends Number> box2){
        return average().equals(box2.average());
    }
}
