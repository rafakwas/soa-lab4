package zadanie5;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@SessionScoped
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

    private boolean isClient;
    private boolean isMale;

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

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean client) {
        isClient = client;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void checkUser(javax.faces.event.AjaxBehaviorEvent e) {
        if(email!=null && name!=null) {
            if(email.equals(name)) {
                isClient = true;
            }
            else {
                isClient = false;
            }
        }

        if(sex != null) {
            if(sex.equals("M")) {
                isMale = true;
            }
            else {
                isMale = false;
            }
        }
    }

    public void inputListener(javax.faces.event.AjaxBehaviorEvent event)
            throws javax.faces.event.AbortProcessingException {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've successfully entered listener."));
    }
}
