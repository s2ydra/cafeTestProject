package kr.ac.kopo.sspare.service;

import kr.ac.kopo.sspare.dao.DrinkCategoryDao;
import kr.ac.kopo.sspare.model.DrinkCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkCategoryServiceImpl implements DrinkCategoryService {

    @Autowired
    DrinkCategoryDao dao;

    @Override
    public List<DrinkCategory> list() {
        return dao.list();
    }
}
