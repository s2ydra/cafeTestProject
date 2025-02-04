package kr.ac.kopo.sspare.dao;

import kr.ac.kopo.sspare.model.DrinkCategory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrinkCategoryDaoImpl implements DrinkCategoryDao {

    @Autowired
    SqlSession sql;

    @Override
    public List<DrinkCategory> list() {

        return sql.selectList("drinkCategory.list");
    }
}
