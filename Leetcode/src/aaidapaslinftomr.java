//import java.util.*;
//import java.lang.Object;
//
//public class aaidapaslinftomr {
//
//    public static boolean isPalindrome(int x) {
//        int rev = 0, pop = 0;
//            if(x < 0)return false;
//            else{
//
//                while(x > rev ){
//                    pop = x%10;
//                    rev = 10*rev + pop;
//                    x = x/10;
//                }
//            }
//            return (x == rev);
//        }
//
//
//        public static int lengthOfLongestSubstring(String s) {
//            char[] c = s.toCharArray();
//            Set<Character> s_set = new HashSet<Character>();
//            ArrayList<Character> s_arr = new ArrayList<Character>();
//            int longest = 0;
//            for (int i = 0; i<c.length; i++){
//                Set<Character> set1 = new HashSet<Character>();
//                List<Character> arr1 = new ArrayList<Character>();
//                int length = 0;
//                for(int j = i; j<c.length; j++){
//                    set1.add(c[j]);
//                    arr1.add(c[j]);
//                    if(set1.size() != arr1.size() || set1.size() == c.length - i ){
//                        length = set1.size();
//                        if(length > longest){
//                            longest = length;
//                            break;
//                        }
//
//                    }
//                }
//
//            }
//            return longest;
//        }
//
////    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        ListNode sentinel = new ListNode();
////        ListNode d = sentinel;
////        int c = 0;
////        while (l1 != null || l2 != null || c != 0) {
////            int a = 0, b = 0;
////            if(l1 != null){
////                a = l1.val;
////                l1 = l1.next;
////            }
////            if(l2 != null){
////                b = l2.val;
////                l2 = l2.next;
////            }
////            d.next = new ListNode((a + b +c)%10);
////            d = d.next;
////            c = (a + b)/10;
////        }
////        if ( c != 0)
////            d.next = new ListNode(1);
////        return sentinel.next;
////    }
//
//    public static int myAtoi(String str) {
//        int sign = 1, base = 0;
//        char[] c = str.toCharArray();
//        List<Character> characters = new ArrayList<Character>();
//        for(int i = 0; i< c.length; i ++){
//            if(c[i] != ' '){
//                characters.add(c[i]);
//            }
//        }
//        if(characters.get(0) == '-') sign = -1;
//        for(int i = 0; i < characters.size(); i ++){
//            if(characters.get(i) >= '0' || characters.get(i) <= '9'){
//                base = base*10 +  characters.get(i) - '0';
//            }
//            else{
//                break;
//            }
//            // if(base > ){
//            //     return INT_MAX;
//            // }
//        }
//        return base*sign;
//    }
//    public static int maxArea(int[] height) {
//        int ans = 0, i=0, j=height.length -1;
//        while(i!=j){
//            ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
//        if(height[i]<height[j]) i++;
//        else{j--;}}
//        return ans;
//    }
//
//    public static List<String> letterCombinations2(String digits) {
//        Map<String,String> digittoletter = new HashMap<String,String>();
//        LinkedList<String> solu = new LinkedList<String>();
//        if (digits == null || digits == "") return null;
//        solu.add("");
//        digittoletter.put("2","abc");
//        digittoletter.put("3","def");
//        digittoletter.put("4","ghi");
//        digittoletter.put("5","jkl");
//        digittoletter.put("6","mno");
//        digittoletter.put("7","pqrs");
//        digittoletter.put("8","tuv");
//        digittoletter.put("9","wxyz");
//
//        while(solu.peek().length() != digits.length()){
//            String remove = solu.remove();
//            int a = remove.length();
//
//            String map = digittoletter.get(digits.substring(remove.length()));
//            for(char c: map.toCharArray()){
//                solu.addLast(remove+c);
//            }
//        }
//        return solu;
//    }
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        for(int k = 0; k<nums.length; k++){
//            if(k!= 0 && nums[k] == nums[k-1])k++;
//            else{
//                int value = - nums[k];
//                Map<Integer, Integer> map = new HashMap<>();
//                for (int i = k+1 ; i < nums.length; i++) {
//                    int complement = value - nums[i];
//                    if (map.containsKey(complement) ) {
//                        List solu = new ArrayList<>();
//                        solu.add(nums[k]);
//                        solu.add(complement);
//                        solu.add(nums[i]);
//                        result.add(solu);
//                    }
//                    map.put(nums[i], i);
//                }
//            }
//
//        }
//        return result;
//    }
//    public static int threeSumClosest(int[] nums, int target) {
//            Arrays.sort(nums);
//            int result = nums[1]+nums[2]+nums[nums.length-1];
//            for(int i = 0; i < nums.length; i++){
//                //          if(i == 0 || nums[i] != nums[i-1]){
//                int high = nums.length-1;
//                int low = i+1;
//
//                while(low<high){
//                    int sum = nums[high]+nums[low]+nums[i];
//                    if( sum < target){
//                        low ++;
//                    }
//                    else {
//                        high --;
//                    }
//                    if(Math.abs(sum - target) < Math.abs(result - target)){
//                        result = sum;
//                    }
//
//                }
//                //          }
//            }
//            return result;
//        }
//
//
////     public List<String> letterCombinations(String digits) {
////         Map<Character,String> digittoletter = new HashMap<Character,String>();
////         LinkedList<String> solu = new LinkedList<String>();
////         if(digits.isEmpty()) return solu;
////         solu.add("");
////         digittoletter.put('2',"abc");
////         digittoletter.put('3',"def");
////         digittoletter.put('4',"ghi");
////         digittoletter.put('5',"jkl");
////         digittoletter.put('6',"mno");
////         digittoletter.put('7',"pqrs");
////         digittoletter.put('8',"tuv");
////         digittoletter.put('9',"wxyz");
//
////         while(solu.peek().length() != digits.length()){
//// 			String remove = solu.remove();
//// 			String map = digittoletter.get(digits.charAt(remove.length()));
////             for(char c: map.toCharArray()){
//// 				solu.addLast(remove+c);
////             }
////         }
////     return solu;
////     }
//// }
//
//// public List<String> letterCombinations(String digits) {
//// 		LinkedList<String> ans = new LinkedList<String>();
//// 		if(digits.isEmpty()) return ans;
//// 		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//// 		ans.add("");
//// 		while(ans.peek().length()!=digits.length()){
//// 			String remove = ans.remove();
//// 			String map = mapping[digits.charAt(remove.length())-'0'];
//// 			for(char c: map.toCharArray()){
//// 				ans.addLast(remove+c);
//// 			}
//// 		}
//// 		return ans;
//// 	}
//// }
//
////     	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
//
////     	public List<String> letterCombinations(String digits) {
////     		List<String> ret = new LinkedList<String>();
////             if(digits.isEmpty()) return ret;
////     		combination("", digits, 0, ret);
////     		return ret;
////     	}
//
//        //     	private void combination(String prefix, String digits, int offset, List<String> ret) {
////     		if (offset >= digits.length()) {
////     			ret.add(prefix);
////     			return;
////     		}
////     		String letters = KEYS[(digits.charAt(offset) - '0')];
////     		for (int i = 0; i < letters.length(); i++) {
////     			combination(prefix + letters.charAt(i), digits, offset + 1, ret);
////     		}
////     	}
////     }
//        Map<String, String> phone = new HashMap<String, String>() {{
//            put("2", "abc");
//            put("3", "def");
//            put("4", "ghi");
//            put("5", "jkl");
//            put("6", "mno");
//            put("7", "pqrs");
//            put("8", "tuv");
//            put("9", "wxyz");
//        }};
//
//        List<String> output = new ArrayList<String>();
//
//    public void backtraking(String combination, String digits){
//
//        if (digits.length() == 0){
//            output.add(combination);
//        }
//        else{
//            String digit = digits.substring(0,1);
//            String letter = phone.get(digit);
//            for(int i = 0; i<letter.length(); i++){
//                String nextletter = phone.get(digit).substring(i,i+1);
//                backtraking(combination + nextletter, digit.substring(1));
//            }
//
//        }
//
//    }
//
//    public List<String> letterCombinations(String digits) {
//        if (digits.length() != 0) {
//            String combination = "";
//            backtraking(combination, digits);
//        }
//        return output;
//    }
//
//    List<List<Integer>> result = new ArrayList<List<Integer>>();
//
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        int value = 0;
//
//        if(candidates != null){
//            List<Integer> current= new ArrayList<Integer>();
//            combination(candidates, current, value, target);
//        }
//        return result;
//    }
//
//    public void combination(int[] candidates, List<Integer> current, int value, int target){
//
//        if(value == target){
//            result.add(current);
//        }
//        else if(value > target){
//        }
//        else{
//            for(int i = 0; i<candidates.length; i++){
//                combination(candidates,  current.add(candidates[i]), value+candidates[i], target);
//            }
//        }
//    }
//
//
//    public static void main(String[] args){
//        Set<Integer> arrlist = new HashSet<Integer>();
////        arrlist.add(1);
////        arrlist.add(2);
////        arrlist.add(3);
////        arrlist.add(4);
////        arrlist.add(4);
////        System.out.println(arrlist.size());
////        String s = "jbpnbwwd";
////        List<Character> characters = new ArrayList<Character>();
////        characters.add(' ');
////        System.out.println(characters.size());
////        System.out.println(lengthOfLongestSubstring(s));
////        String str = "4193 with words";
////        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
////        int[] a = new  int[]{1,1,-1,-1,3};
////       System.out.println(threeSumClosest(a,-1));
////        char att = 'c';
////        String bee = "sbr";
////        LinkedList<String> solu = new LinkedList<String>();
////        solu.addLast(bee+att);
////        String remove = "z";
////        String remove1;
////        remove1 = remove[0];
////        int b = remove.length();
////        System.out.println(b);
//        aaidapaslinftomr a = new aaidapaslinftomr();
//        System.out.println(a.letterCombinations("25"));
////
////        output.add(combination);
//       List<String> output = new ArrayList<String>();
//        output.add("aaa");
//        output.add("bbb");
//        output.add(""+"ccc");
//        System.out.println(output);
//
//    }
//}
