package hole5;

import static hole5.Money.money;
public class TaxRate {
    private final Integer percent;

    private TaxRate(Integer percent) {this.percent = percent;}

    public static TaxRate taxRate(Integer percent) {return new TaxRate(percent);}

    public int getPercent() {return percent;}

    Money apply(Money total) {
        Double amount = total.value * (getPercent() / 100d);
        return money(amount.intValue(),total.currency);
    }
}
