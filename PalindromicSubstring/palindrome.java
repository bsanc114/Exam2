public class palindrome {
    char[] index;
    public int indexSub(String input) {
        index = input.toCharArray();
        int n = index.length;
        int[] dynamicP = new int[n];
        dynamicP[0] = 1;
        for (int i = 1; i < n; i++) {
            dynamicP[i] = dynamicP[i - 1] + 1 + sumIndex(i);
        }
        return dynamicP[n - 1];
    }

    public int sumIndex(int pos) {
        int sum = 0;
        for (int i = 0; i < pos; i++)
            if (index[i] == index[pos] && isPalindrome(i, pos))
                sum++;
        return sum;
    }

    public boolean isPalindrome(int start, int end) {
        int l = start;
        int r = end;
        while (l <= r) {
            if (index[l] != index[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
}
