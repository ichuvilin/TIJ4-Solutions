package initialization;

/****************** Exercise 21 ****************
 * Create an enum of the six lowest denominations
 * of paper currency. Loop through the values()
 * and print each value and its ordinal().
 ***********************************************/

enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}
public class E21_PaperCurrencyTypesEnum {
    public static void main(String[] args) {
        for (PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}
