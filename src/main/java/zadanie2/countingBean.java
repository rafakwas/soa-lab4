package zadanie2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class countingBean {
    private double incomeValue;
    private double outcomeValue;
    private String incomeCurrency;
    private String outcomeCurrency;

    public double getIncomeValue() {
        return incomeValue;
    }

    public double getOutcomeValue() {
        return outcomeValue;
    }

    public String getIncomeCurrency() {
        return incomeCurrency;
    }

    public String getOutcomeCurrency() {
        return outcomeCurrency;
    }

    public void setIncomeValue(double incomeValue) {
        this.incomeValue = incomeValue;
    }

    public void setOutcomeValue(double outcomeValue) {
        this.outcomeValue = outcomeValue;
    }

    public void setIncomeCurrency(String incomeCurrency) {
        this.incomeCurrency = incomeCurrency;
    }

    public void setOutcomeCurrency(String outcomeCurrency) {
        this.outcomeCurrency = outcomeCurrency;
    }

    public String count() {
        outcomeValue = incomeValue*(currenciesBean.getCurrencyMap().get(incomeCurrency)/currenciesBean.getCurrencyMap().get(outcomeCurrency));
        return "wynik.xhtml";
    }
}
