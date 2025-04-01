package InterfaceEtPolymorphisme;

import java.util.*;

public class PolynomialToolbox {

    public static Polynomial simplify(Polynomial poly) {
        LLPolynomial polySimplifie = new LLPolynomial();
        Map<String, Double> termMap = new HashMap<>();
        List<Term> termesPoly = poly.getAllTerms();

        for(Term term:termesPoly){
            String key = term.getVariable() + "^" + term.getExponent();
            termMap.put(key, termMap.getOrDefault(key, 0.0) + term.getCoefficient());
        }
        for (Map.Entry<String, Double> entree : termMap.entrySet()) {
            double coefficient = entree.getValue();
            if (Math.abs(coefficient) >= 1e-8) {
                String[] parts = entree.getKey().split("\\^");
                char variable = parts[0].charAt(0);
                int exponent = Integer.parseInt(parts[1]);
                polySimplifie.addTerm(new Term(coefficient, variable, exponent));
            }
        }
        return polySimplifie;
    }

    public static Polynomial sum(Polynomial poly1, Polynomial poly2) {
        Polynomial resultatPoly = new LLPolynomial();
        List<Term> termesPoly1 = poly1.getAllTerms();
        List<Term> termesPoly2 = poly2.getAllTerms();
        for(Term term : termesPoly1){
            resultatPoly.addTerm(term);
        }
        for(Term term: termesPoly2){
            resultatPoly.addTerm(term);
        }
        resultatPoly = simplify(resultatPoly);
        return resultatPoly;
    }

}

