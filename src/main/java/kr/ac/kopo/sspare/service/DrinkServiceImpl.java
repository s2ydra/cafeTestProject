package kr.ac.kopo.sspare.service;

import kr.ac.kopo.sspare.dao.DrinkDao;
import kr.ac.kopo.sspare.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {

    private final DrinkDao dao;

    public DrinkServiceImpl(DrinkDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Drink> list() {
        return dao.list();
    }

    @Override
    public void add(Drink item) {
        dao.add(item);
    }
}
