import java.util.HashMap;
import java.util.Map;
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
     public int[] twoSum(int[] nums, int target) { 
        Map<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){ 
            if(map.containsKey(target-nums[i])){ 
                return new int[] {i,map.get(target-nums[i])}; 
            } 
            else{ 
                map.put(nums[i],i); 
            } 
        } 
        return new int[] {0,0};
     } 
    }
    


// Pattern Recognized: HashTable-map 
// Time Complexity: O(n) 
// Space Complexity:O(n) 
// beacuse of extra map Code: 