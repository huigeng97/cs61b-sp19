import java.util.*;
public class combination {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int value = 0;
        Arrays.sort(candidates);
        if(candidates != null){
            List<Integer> current= new ArrayList<Integer>();
            combination(candidates, current, value, target);
        }
        return result;
    }

    public void combination(int[] candidates, List<Integer> current, int value, int target){

        if(value == target){
            result.add(current);
        }
        else if(value > target){
        }
        else{
            for(int i = 0; i<candidates.length; i++){
                int cur_length = current.size();
                if(cur_length == 0 || candidates[i]>=current.get(cur_length-1)){
                    current.add(candidates[i]);
                    combination(candidates, current , value+candidates[i], target);
                }

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


    public static void main(String[] args){
    Solution a = new Solution();
        int[][]b = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        b[0]=b[2];
        Solution.TreeNode root = new Solution.TreeNode() {
        };
        root.val = -1;
        int sum = 8;
//       System.out.println(a.integerBreak(61));
        System.out.println(a.pathSum(root,-1));
       }
}
