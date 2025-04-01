package InterfaceEtPolymorphisme;

import java.util.Comparator;

public class TermComparator implements Comparator<Term> {
    @Override
    public int compare(Term t1, Term t2) {
        int resultat = 0;
        if (t1.getVariable() != t2.getVariable()) {
            if (t1.getVariable() == ' ') {
                resultat = 1;
            } else if (t2.getVariable() == ' ') {
                resultat = -1;
            } else {
                resultat = Character.compare(t1.getVariable(), t2.getVariable());
            }
        } else {
            resultat = Integer.compare(t2.getExponent(), t1.getExponent());
        }

        return resultat;
    }
}
