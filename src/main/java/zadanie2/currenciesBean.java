package zadanie2;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.*;

@ManagedBean
@ApplicationScoped
public class currenciesBean {


    public static Map<String, Double> getCurrencyMap() {
        return currencyMap;
    }

    private static Map<String,Double> currencyMap = new HashMap<String, Double>();
    static {
        currencyMap.put("PLN",1.0);
        currencyMap.put("EUR",4.32);
    }

    public Set<String> getCurrencySet() {
        return currencyMap.keySet();
    }
}
