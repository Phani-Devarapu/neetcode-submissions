class Solution {
    public List<String> generateParenthesis(int n) {
         ArrayList<String> res = new ArrayList<>();
        getPara(0, 0, n, "", res);
        return res;
    }

     public void getPara(int open, int close, int n, String st, List<String> res) {

        if (open == n && close == n) {
            res.add(st);
            return;
        }


        if (open < n) {
            getPara(open + 1, close, n, st + "(", res);
        }

        if (close < open) {
            getPara(open, close + 1, n, st + ")", res);
        }
    }
}
