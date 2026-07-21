class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        // Start by assuming the first string is the entire answer. 
        // Then compare it against the second string, and shrink your "answer so far" down to whatever they agree on. 
        // Repeat with the third string, fourth, and so on.
        String prefix = strs[0];
        for(int i=1; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}