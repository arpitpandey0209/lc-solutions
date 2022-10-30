class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0) return "";
        if (numRows == 1) return s;
        int rowNum = 1;
        boolean down = true;
        List<Character>[] arr = new ArrayList[numRows+1];
        Arrays.setAll(arr, i->new ArrayList<>());
        for (Character c : s.toCharArray()) {
            arr[rowNum].add(c);
            if (down) rowNum += 1;
            else rowNum -= 1;
            if (rowNum == numRows) {
                down = false;
            }
            if (rowNum == 1) {
                down = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=numRows; i++) {
            for (char c : arr[i]) {
                sb.append(c);
            }            
        }
        return sb.toString();
    }
}
