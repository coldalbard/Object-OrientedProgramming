package main.java.homework.homework4;


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

    /**
     * @apiNote 1)расширить класс калькулятор на умножение
     * @return произведение всех элементов массива
     */
    public Double multiplication() {
        Double res = 1.0;
        for (E num: this.numbersList) {
            res *= num.doubleValue();
        }
        return res;
    }


    /**
     * @apiNote 2)расширить класс калькулятор на деление
     * @return деление всех элементов массива
     */
    public Double division() {
        Double res = this.numbersList.get(0).doubleValue();
        int count = 0;
        for (E num: this.numbersList) {
            if (count == 0) {
                count++;
                continue;
            }
            res /= num.doubleValue();
        }
        return res;
    }


    /**
     * @apiNote 3)расширить класс калькулятор на бинарный перевод
     * @return бинарный перевод каждого числа
     */
    public String binaryTranslation(){
        String res = "";
        for (E num : this.numbersList) {
            int val = num.intValue();
            String bNextNum = "";
            while (val > 0){
                bNextNum = (val % 2) + bNextNum;
                val = val / 2;
            }
            while (bNextNum.length() < 4 && !bNextNum.equals("0")){
                bNextNum = "0" + bNextNum;
            }
            res += "\n" + bNextNum;
        }
        return res;
    }
}
