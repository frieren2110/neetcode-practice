class Solution {
    /*
        // Simpler version
        - O(n) space - put the data in a HashSet and search which num from 1 to n is missing first

        - If I update the provided input array inplace - It still using no auxillary space 

        // Proof - every number possible will reached the matched position

        end states
            - don't swap if already matched
            - skip if matched or out range [1-N]
            - keep swapping if the recieved number can be put

        Time complexity - O(n)

        Examples
        1. [-2,-1,0]

    */
    public int firstMissingPositive(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            while(shouldSwap(nums,i)) {
                swap(nums, i-1, nums[i-1]-1);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if(i != nums[i-1]) {
                return i;
            }
        }

        return nums.length + 1;
    }

    private boolean shouldSwap(int nums[], int i) {
        return nums[i-1] != i && nums[i-1] >= 1 && nums[i-1] <= nums.length 
            && nums[i-1] != nums[nums[i-1]-1];
    }

    private void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}