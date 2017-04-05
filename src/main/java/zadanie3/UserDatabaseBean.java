package zadanie3;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.List;

@Stateless
@ManagedBean
@ApplicationScoped
public class UserDatabaseBean implements UserDatabase {
    List<User> userList;

    @PostConstruct
    public void init(){
        userList= new ArrayList<User>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void add(User user) {
        userList.add(user);
    }
}
