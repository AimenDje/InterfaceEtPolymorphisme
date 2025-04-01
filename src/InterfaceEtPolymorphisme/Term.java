package InterfaceEtPolymorphisme;

public final class Term {
    //Attributs
    private final double coefficient;
    private final char variable;
    private final int exponent;

    //Constructeur
    public Term(double coefficient, char variable, int exponent){
        if(coefficient == 0){
            throw new ZeroCoefficientException();
        }
        this.coefficient = coefficient;
        this.variable = variable;
        this.exponent = exponent;
    }
    public double getCoefficient(){
        return coefficient;
    }
    public char getVariable(){
        return variable;
    }
    public int getExponent(){
        return exponent;
    }

    @Override
    public String toString(){
        if(exponent == 0){
            return String.valueOf(coefficient);
        }
        else if(exponent == 1){
            return String.valueOf(coefficient) + variable;
        }
        return String.valueOf(coefficient)+ variable+ "^"+ String.valueOf(exponent);

    }

}
