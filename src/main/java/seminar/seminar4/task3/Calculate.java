package main.java.seminar.seminar4.task3;

import java.util.List;

public class Calculate<E extends Number> {
    List<E> numbersList;

    public Calculate(List<E> numbersList) {
        this.numbersList = numbersList;
    }

    public Calculate() {
    }

    public List<E> getNumbersList() {
        return numbersList;
    }

    public void setNumbersList(List<E> numbersList) {
        this.numbersList = numbersList;
    }


    /**
     * @apiNote возвращающий сумму элементов коллекции (метод sum)
     * @return сумма всех элементов массива
     */
    public Double sum() {
        Double res = 0.0;
        for (E num: this.numbersList) {
            res += num.doubleValue();
        }
        return res;
    }
}
