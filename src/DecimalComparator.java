public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        double cleanFirst = (double) ((int) (first * 1000))/1000;
        double cleanSecond = (double) ((int) (second * 1000))/1000;
        return cleanFirst == cleanSecond;
    }
}
