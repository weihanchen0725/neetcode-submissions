class Solution {
    // 128-byte lookup table: maps characters to a normalized value (1..36),
    // and invalid characters (symbols/spaces) to 0.
    private static final byte[] MAP = new byte[128];

    static {
        for (int i = 0; i < 10; i++) {
            MAP['0' + i] = (byte) (1 + i);
        }
        for (int i = 0; i < 26; i++) {
            byte val = (byte) (11 + i);
            MAP['a' + i] = val;
            MAP['A' + i] = val;
        }
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char lChar = chars[left];
            char rChar = chars[right];

            byte lVal = lChar < 128 ? MAP[lChar] : 0;
            byte rVal = rChar < 128 ? MAP[rChar] : 0;

            if (lVal == 0) {
                left++;
            } else if (rVal == 0) {
                right--;
            } else {
                if (lVal != rVal) return false;
                left++;
                right--;
            }
        }

        return true;
    }
}