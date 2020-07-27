class Solution {
    public boolean isPalindrome(int x) {
        int oldX = x;
        int y = 0;
        while(x != 0) {
            y = (y * 10) + (x % 10);
            x /= 10;
        }
        return oldX == y;
    }
}
