class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int p=0,q=0,ans=0;
        while (p < s.length()) {
            if (!map.containsKey(s.charAt(p))) {
                map.put(s.charAt(p), 1);
                p++;
            } else {
                while (s.charAt(p) != s.charAt(q)) {
                    map.remove(s.charAt(q));
                    q++;
                }
                if (p != q) q++;
                map.remove(s.charAt(p));
            }
            ans = Math.max(ans, p-q);
        }
        return ans;
    }
}
