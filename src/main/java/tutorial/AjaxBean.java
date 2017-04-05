package tutorial;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class AjaxBean implements Serializable {
    private int age;

    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've successfully entered the age."));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've successfully entered the name."));
    }

    public void facetListener(javax.faces.event.AjaxBehaviorEvent event)
            throws javax.faces.event.AbortProcessingException {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've successfully entered listener."));
    }
}