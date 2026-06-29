import java.util.HashSet;
import java.util.Set;

class Solution {
     public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 1};
        if(containsDuplicate(nums)){
        System.out.println("Contains duplicate");
        } else {
            System.out.println("Does not contain duplicate");
        }
     }

     static  boolean containsDuplicate(int[] nums) { 
        Set<Integer> set=new HashSet(); 
        for(int i=0;i<nums.length;i++){ 
            if(set.contains(nums[i])){ 
                return true; 
            } 
            else{
                 set.add(nums[i]);
                 } 
        } 
        return false; 
    }
 }