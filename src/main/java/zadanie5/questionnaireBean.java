package zadanie5;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class questionnaireBean {
    private String name;
    private String email;
    private String zipcode;
    private int age;
    private String sex;
    private String education;
    private int size;

    private String moneyOnClothesPerMonth;
    private String[] mostVisitedShops;
    private String howRecentlyBuying;
    private String[] preferredColors;

    public String forward() {
        return "wyniki.xhtml";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMoneyOnClothesPerMonth() {
        return moneyOnClothesPerMonth;
    }

    public void setMoneyOnClothesPerMonth(String moneyOnClothesPerMonth) {
        this.moneyOnClothesPerMonth = moneyOnClothesPerMonth;
    }

    public String[] getMostVisitedShops() {
        return mostVisitedShops;
    }

    public void setMostVisitedShops(String[] mostVisitedShops) {
        this.mostVisitedShops = mostVisitedShops;
    }

    public String getHowRecentlyBuying() {
        return howRecentlyBuying;
    }

    public void setHowRecentlyBuying(String howRecentlyBuying) {
        this.howRecentlyBuying = howRecentlyBuying;
    }

    public String[] getPreferredColors() {
        return preferredColors;
    }

    public void setPreferredColors(String[] preferredColors) {
        this.preferredColors = preferredColors;
    }
}
