class Solution {
    public boolean validWordSquare(List<String> words) {
        int n = words.size() - 1 ;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= words.get(i).length()-1; j++){
                if(j > n || i > words.get(j).length()-1 ){
                    return false;
                }

                if (words.get(i).charAt(j) != words.get(j).charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
