public class Range {
    private String range;

    public Range(String s) {
        this.range = s;
    }

    // (3,6) = (3  = 3
    private int getFirstNumber(String range){
        String[] number = range.split(",");
        String newValue = number[0]; // (3
        String regex = newValue.replaceAll("[^0-9]", "");
        return Integer.parseInt(regex);
    }

    private int getSecondNumber(String range){
        String[] number = range.split(",");
        String newValue = number[1]; //
        String regex = newValue.replaceAll("[^0-9]", "");
        return Integer.parseInt(regex);
    }

    public boolean notContains(Range otherRange){
        int firstNumber =  getFirstNumber(range);
        int secondNumber =  getSecondNumber(range);

        int firstOtherRange = getFirstNumber(otherRange.range);
        int secondOtherRange =  getSecondNumber(otherRange.range);

        return firstOtherRange < firstNumber || firstOtherRange > secondNumber;

    }
}
