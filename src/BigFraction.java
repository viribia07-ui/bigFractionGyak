import java.math.BigInteger;

public class BigFraction {
    private BigInteger numerator;   // számláló
    private BigInteger denominator; // nevező


    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }
}
