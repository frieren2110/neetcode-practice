class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i <= matrix.length - 1; i++){
            if(existsInSortedArray(matrix[i], target)){
                return true;
            }
        }
        return false;
    }

    public boolean existsInSortedArray(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == arr[mid]) {
                return true;
            }
            else if (target < arr[mid]){
                high = mid -1;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
        }
        return false;
    }
}
