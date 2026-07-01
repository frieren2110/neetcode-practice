class Solution {
    public int[] singleNumber(int[] nums) {
        final Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        // result
        int[] res = new int[2];
        int resIndex = 0;
        for (int setVal : set) {
            res[resIndex] = setVal;
            resIndex++;
        }

        return res;
    }
}