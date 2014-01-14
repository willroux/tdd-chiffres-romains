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
    	String[] chiffresRomains = new String[200];

        chiffresRomains[0] = "";
        chiffresRomains[1] = "I";
        chiffresRomains[2] = "II";
        chiffresRomains[3] = "III";
        chiffresRomains[4] = "IV";
        chiffresRomains[5] = "V";

        return chiffresRomains[this.valeur];
    }
}
