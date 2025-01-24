package kr.ac.kopo.sspare.model;

public class Drink {

    private Long drinkId;
    private String drinkName;
    private Long drCategoryId;
    private int drinkPrice;
    private String drinkInfo;


    public Long getDrCategoryId() {
        return drCategoryId;
    }

    public void setDrCategoryId(Long drCategoryId) {
        this.drCategoryId = drCategoryId;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkInfo() {
        return drinkInfo;
    }

    public void setDrinkInfo(String drinkInfo) {
        this.drinkInfo = drinkInfo;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
