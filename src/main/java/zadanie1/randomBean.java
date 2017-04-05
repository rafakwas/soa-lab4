package zadanie1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class randomBean {
    private static int losuj = (int)(Math.random()*5+1);

    public int getLosuj() {
        return losuj;
    }

    public String random(Integer i) {
        if (losuj == i) {
            losuj = (int)(Math.random()*5+1);
            return "trafiony.xhtml";
        }
        return i.toString() + ".xhtml";
    }
}
