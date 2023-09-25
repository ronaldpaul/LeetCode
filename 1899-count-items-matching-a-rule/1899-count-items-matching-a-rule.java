class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> l : items) {
                if ((ruleKey.equals("type") && l.get(0).equals(ruleValue)) || 
                (ruleKey.equals("color") && l.get(1).equals(ruleValue)) || 
                (ruleKey.equals("name") && l.get(2).equals(ruleValue))) {
                    count++;
            }   
        }
        return count;
    }
}