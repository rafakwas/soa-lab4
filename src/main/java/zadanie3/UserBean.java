package zadanie3;

import javax.ejb.EJB;
import javax.faces.bean.*;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class UserBean {

    @ManagedProperty(value = "#{user}")
    private User user;

    @ManagedProperty(value = "#{userDatabaseBean}")
    private UserDatabaseBean userDatabaseBean;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDatabaseBean getUserDatabaseBean() {
        return userDatabaseBean;
    }

    public void setUserDatabaseBean(UserDatabaseBean userDatabaseBean) {
        this.userDatabaseBean = userDatabaseBean;
    }

    private HtmlCommandButton add;

    public HtmlCommandButton getAdd() {
        return add;
    }

    public void setAdd(HtmlCommandButton add) {
        this.add = add;
    }

    public void activateAdd(ValueChangeEvent e)
    {
        add.setDisabled(false);
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }

    public String accept() {
        userDatabaseBean.add(user);
        return "wyniki.xhtml";
    }

}
