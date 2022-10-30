class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        func(list, "", 0, 0, n);
        return list;
    }
    public void func(List<String> list, String s, int open, int close, int n) {
        if (2*n == s.length()) {
            list.add(s);
            return;
        }
        if (open < n) {
            func(list, s + "(", open+1, close, n);
        }
        if (close < open) {
            func(list, s + ")", open, close+1, n);
        }
    }
}
