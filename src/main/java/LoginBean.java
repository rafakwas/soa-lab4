import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class LoginBean {
    private String username;
    private String password;
    private HtmlSelectBooleanCheckbox acceptCheckBox;
    private HtmlCommandButton loginButton;

    public HtmlSelectBooleanCheckbox getAcceptCheckBox() {
        return acceptCheckBox;
    }

    public void setAcceptCheckBox(HtmlSelectBooleanCheckbox acceptCheckBox) {
        this.acceptCheckBox = acceptCheckBox;
    }

    public HtmlCommandButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(HtmlCommandButton loginButton) {
        this.loginButton = loginButton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        if (username.equals(password)) {
            return "przyklad_success.xhtml";
        } else {
            return "przyklad_failure.xhtml";
        }
    }

    public void activateButton(ValueChangeEvent e)
    {
        if (acceptCheckBox.isSelected())
            loginButton.setDisabled(false);
        else
            loginButton.setDisabled(true);

        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }
}
