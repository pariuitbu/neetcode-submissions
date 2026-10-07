class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int count[]=new int[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            count[c-'a']++;
            char c1=t.charAt(i);
            count[c1-'a']--;

        }
        for(int j=0;j<count.length;j++){
            if(count[j]!=0){
                return false;
            }
        }

        return true;

    }
}
