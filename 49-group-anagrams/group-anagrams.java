class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();

        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!h.containsKey(key)){
                h.put(key,new ArrayList<>());
            }
            h.get(key).add(word);
        }
        return new ArrayList<>(h.values()); 
    }
}