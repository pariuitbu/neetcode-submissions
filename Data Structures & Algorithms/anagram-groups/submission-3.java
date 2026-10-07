class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map =new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.computeIfAbsent(s, k->new ArrayList<>()).add(strs[i]);
        }

        return map.values().stream().collect(Collectors.toList());
        
    }
}
