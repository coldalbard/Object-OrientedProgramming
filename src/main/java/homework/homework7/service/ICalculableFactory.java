package main.java.homework.homework7.service;

import main.java.homework.homework7.model.Calculable;

import java.util.List;

public interface ICalculableFactory<E> {
    Calculable create(List<E> numbers);
}
