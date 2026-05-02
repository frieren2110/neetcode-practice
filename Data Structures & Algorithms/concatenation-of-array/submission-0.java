class Solution {
    public int[] getConcatenation(int[] nums) {
        return IntStream.concat(IntStream.of(nums), IntStream.of(nums)).toArray();
    }
}