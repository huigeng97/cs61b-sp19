import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List result = new ArrayList<ArrayList<String>>();
        helper(s, result, 0, new ArrayList<String>(), 0);
        return result;
    }


    public boolean isPalind (String sub) {
        char[] char_arr = sub.toCharArray();
        int length = char_arr.length;
        for(int i = 0; i < length/2; i++) {
            if (char_arr[i] != char_arr[length-1-i])
                return false;
        }
        return true;
    }


    void helper(String s, List<List<String>> list, int pos, List<String> res, int sec){
        if( s.length() == 0){
            list.add(new ArrayList<>(res));
        }
        for(int i = 0; i<s.length();i++) {
            if(isPalind(s.substring(0,i+1))) {
                res.add(s.substring(0,i+1));
//                if(s.substring(i+1).length() == 0 ){
//                    list.add(new ArrayList<>(res));
//                }
                helper(s.substring(i+1), list, pos, res, sec);
                res.remove(res.size()-1);
            }
        }

    }
    public static class TreeNode {
        int val;
        Solution.TreeNode left;
        Solution.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Solution.TreeNode left, Solution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}