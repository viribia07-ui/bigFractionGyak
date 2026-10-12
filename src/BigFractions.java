public class BigFractions {
    public static boolean isSmallerThanB(BigFraction a, BigFraction b){
        int result = a.toBigDecimal().compareTo(b.toBigDecimal());
        return result < 0; // TODO - common denominator check
    }

    public static boolean equals(BigFraction a, BigFraction b){
        return a.equals(b);
    }

    public static boolean isSmallerThanOrEqualB(BigFraction a, BigFraction b){
        return equals(a,b) || isSmallerThanB(a,b);
    }

    public static boolean isGreaterThanB(BigFraction a, BigFraction b){
        return !isSmallerThanB(a,b);
    }

    public static boolean isGreaterThanOrEqualB(BigFraction a, BigFraction b){
        return equals(a,b) || isGreaterThanB(a,b);
    }

    public static boolean notEquals(BigFraction a, BigFraction b){
        return !equals(a,b);
    }
}
