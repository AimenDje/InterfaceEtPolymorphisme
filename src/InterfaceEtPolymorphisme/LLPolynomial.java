package InterfaceEtPolymorphisme;

import java.util.*;

public class LLPolynomial implements Polynomial{
    private LinkedList<Term> terms;

    public LLPolynomial(){
        terms = new LinkedList<>();
    }

    @Override
    public boolean addTerm(Term t) {
        return terms.add(t);
    }

    @Override
    public boolean removeTerm(Term t) {
        return terms.remove(t);
    }

    @Override
    public int getTermCount() {
        return terms.size();
    }

    @Override
    public List<Character> getVariables() {
        Set<Character> variables = new LinkedHashSet<>();
        for(Term term:terms){
             variables.add(term.getVariable());
        }
        return new ArrayList<>(variables);
    }

    @Override
    public List<Integer> getExponents() {
        Set<Integer> exponents = new LinkedHashSet<>();
        for(Term term:terms){
            exponents.add(term.getExponent());
        }
        return new ArrayList<>(exponents);
    }

    @Override
    public List<Term> getTerms(char variable, int exponent) {
        List<Term> termesSemblables = new ArrayList<>();
        for(Term term:terms){
            if(term.getVariable() == variable && term.getExponent()== exponent){
                termesSemblables.add(term);
            }
        }
        return termesSemblables;
    }

    @Override
    public List<Term> getAllTerms() {
        return new ArrayList<>(terms);
    }

    @Override
    public String toString() {
        String lesTerms = "";
        for (Term term : terms) {
            if (terms.indexOf(term) == 0) {
                lesTerms = lesTerms + term.toString();
            } else if (term.getCoefficient() > 0) {
                lesTerms = lesTerms + "+" + term.toString();
            }else {
                lesTerms = lesTerms + term.toString();
            }
        }
        return lesTerms;
    }

    public void sort (Polynomial poly){
        Collections.sort(terms, new TermComparator());
    }

}
