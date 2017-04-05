package tutorial;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class chrysteBean implements Serializable {

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSayWelcome(){
        //check if null?
        if("".equals(name) || name ==null){
            return "";
        }else{
            return "Ajax message : Welcome " + name;
        }
    }

    public void test(AjaxBehaviorEvent e) {
        System.out.println("JESTEM TU");
    }
}