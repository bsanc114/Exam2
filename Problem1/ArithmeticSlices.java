public class ArithmeticSlices {
    public int sumOfArithmeticSlices(int[] input) {
        int dynamicP = 0;
        int sum = 0;
        for (int i = 2; i < input.length; i++) {
            if (input[i] - input[i - 1] == input[i - 1] - input[i - 2]) {
                dynamicP = 1 + dynamicP;
                sum += dynamicP;
            } else
                dynamicP = 0;
        }
        return sum;
    }
}
