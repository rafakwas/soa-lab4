package zadanie3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class User {
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String voivodeship;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public User() {}

    public User(String name, String surname, int age, String voivodeship) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.voivodeship = voivodeship;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", voivodeship='" + voivodeship + '\'' +
                '}';
    }

}
