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

    public BigFraction(){ //feltöltő ha nincs semmi
        setNumerator(new BigInteger("0"));
        setDenominator(new BigInteger("1"));
    }

    public BigFraction(String numeratorStr, String denominatorStr){
        setNumerator(new BigInteger(numeratorStr));
        setDenominator(new BigInteger(denominatorStr));
    }
    public BigFraction(long numeratorL, long denominatorL){
        setNumerator(BigInteger.valueOf(numeratorL));
        setDenominator(BigInteger.valueOf(denominatorL));
    }

    public BigFraction(int numerator, int denominator){
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }

    public BigFraction(BigInteger numerator, BigInteger denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public static BigFraction parse(String fractionStr){
        // "-3/5" TODO - or "(-3/5)"
        String[] split = fractionStr.split("/");
        String numeratorStr = split[0];
        String denominatorStr = split[1];
        return new BigFraction(numeratorStr, denominatorStr);
    }
    @Override
    public String toString(){
        return String.format("(%s/%s)", getNumerator().toString(), getDenominator().toString());
    }
}
