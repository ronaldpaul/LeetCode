class Solution {
    public String defangIPaddr(String address) {
        char[] c = address.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i=0; i< c.length; i++) {
            if (c[i]=='.') {
                s = s.append("["+c[i]+"]");
            } else {
                s = s.append(c[i]);
            }
        }
        return s.toString();
    }
}