public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] input) {
        int[] dynamicP = new int[input.length];
        int sum = 0;
        for (int i = 2; i < dynamicP.length; i++) {
            if (input[i] - input[i - 1] == input[i - 1] - input[i - 2]) {
                dynamicP[i] = 1 + dynamicP[i - 1];
                sum += dynamicP[i];
            }
        }
        return sum;
    }
}
