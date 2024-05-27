package S1_04.N1Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MonthList {
    private List<String> months;

    public MonthList() {
        this.months = new ArrayList<>();
        insertMonths();
    }
    private void insertMonths() {
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
    }

    public List<String> getMonths() {
        return months;
    }
}
