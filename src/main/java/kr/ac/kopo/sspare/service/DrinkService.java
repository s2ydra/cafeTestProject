package kr.ac.kopo.sspare.service;

import kr.ac.kopo.sspare.model.Drink;

import java.util.List;

public interface DrinkService {
    List<Drink> list();

    void add(Drink item);
}
