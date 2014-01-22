package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
        String unite=en_romain_unites(this.valeur%10);
        String design=en_romain_design(this.valeur/10);
    	return (design+unite);
    }

    static String[] tab_unites = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static String[] tab_design = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

    public String en_romain_unites(int n) {
        return tab_unites[n];
    }

    public String en_romain_design(int n) {
        return tab_design[n];
    }
}
