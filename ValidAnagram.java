import java.util.HashSet;
import java.util.Set;
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        if(solution.isAnagram(s, t)){
            System.out.println("Is anagram");
        } else {
            System.out.println("Is not anagram");
        }
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
            // Pattern Recognized: constant array
            // Time Complexity: O(n)
            // Space Complexity:O(1)