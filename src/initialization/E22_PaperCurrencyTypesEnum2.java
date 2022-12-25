package initialization;

import static lib.Print.print;
import static lib.Print.printnb;

/****************** Exercise 22 ****************
 * Write a switch statement for the enum in
 * Exercise 21. For each case, output a
 * description of that particular currency.
 ***********************************************/
public class E22_PaperCurrencyTypesEnum2 {
    static void describe(PaperCurrencyTypes pct) {
        printnb(pct + " has a portrait of ");
        switch(pct) {
            case ONE: print("George Washington");
                break;
            case TWO: print("Thomas Jefferson");
                break;
            case FIVE: print("Abraham Lincoln");
                break;
            case TEN: print("Alexander Hamilton");
                break;
            case TWENTY: print("Andrew Jackson");
                break;
            case FIFTY: print("U.S. Grant");
                break;
        }
    }

    public static void main(String[] args) {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            describe(s);
    }
}
