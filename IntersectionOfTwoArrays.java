import java.util.*;

class Solution { 

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = solution.intersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) { 
        Set<Integer> set=new HashSet(); 
        Set<Integer> ans=new HashSet(); 
        for(int n:nums1){ 
            set.add(n); 
        } 
        for(int n:nums2){ 
            if(set.contains(n)){ 
                ans.add(n); 
            } 
        } 
        int[] arr=new int[ans.size()]; 
        int i=0; 
        for(int n:ans){ 
            arr[i++]=n; 
        } 
        return arr; 
    } 
}


// Pattern Recognized: Hashset
// Time Complexity:O(3n) 
// Space Complexity:O(n)