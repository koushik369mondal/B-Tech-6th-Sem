package Leetcode.Medium;

public class Leet_75 {
    // Bubble Sort
    public void sortColors1(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    
    // Selection Sort
    public void sortColors2(int[] nums) {

    }

    //Insertion Sort 
    public void sortColors3(int[] nums) {

    }

    public static void printArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Leet_75 obj = new Leet_75();
        int[] nums = {2, 0, 2, 1, 1, 0};
        obj.sortColors1(nums);
        printArray(nums);
    }
}

