import java.util.HashSet;

public class ContainsDuplicate {

    
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); 

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 3};

        System.out.println("Array 1 contains duplicates: " + containsDuplicate(nums1)); 
        System.out.println("Array 2 contains duplicates: " + containsDuplicate(nums2)); 
    }
}