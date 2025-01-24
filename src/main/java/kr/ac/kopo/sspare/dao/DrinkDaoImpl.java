package kr.ac.kopo.sspare.dao;

import kr.ac.kopo.sspare.model.Drink;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinkDaoImpl implements DrinkDao {

    @Autowired
    SqlSession sql;


    @Override
    public List<Drink> list() {
        return sql.selectList("drink.list");
    }
}
