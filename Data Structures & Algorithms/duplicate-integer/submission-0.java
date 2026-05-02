class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> distinctNums = new HashSet<>();
        for(int num : nums){
            if(distinctNums.contains(num)){
                return true;
            }
            distinctNums.add(num);
        }
        return false;
    }
}