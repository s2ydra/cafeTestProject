package kr.ac.kopo.sspare.model;

public class DrinkCategory {

    private Long drCategoryId;
    private String drCategoryName;
    private int drIsAdult;
    private String drCategoryInfo;

    public Long getDrCategoryId() {
        return drCategoryId;
    }

    public void setDrCategoryId(Long drCategoryId) {
        this.drCategoryId = drCategoryId;
    }

    public String getDrCategoryInfo() {
        return drCategoryInfo;
    }

    public void setDrCategoryInfo(String drCategoryInfo) {
        this.drCategoryInfo = drCategoryInfo;
    }

    public String getDrCategoryName() {
        return drCategoryName;
    }

    public void setDrCategoryName(String drCategoryName) {
        this.drCategoryName = drCategoryName;
    }

    public int getDrIsAdult() {
        return drIsAdult;
    }

    public void setDrIsAdult(int drIsAdult) {
        this.drIsAdult = drIsAdult;
    }
}
