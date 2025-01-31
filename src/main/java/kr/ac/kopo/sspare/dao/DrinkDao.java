package kr.ac.kopo.sspare.dao;

import kr.ac.kopo.sspare.model.Drink;

import java.util.List;

public interface DrinkDao {
    List<Drink> list();

    void add(Drink item);
}
