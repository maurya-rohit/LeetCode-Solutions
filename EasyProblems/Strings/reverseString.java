class Solution {
    public String reverseString(String s) {
        StringBuilder i= new StringBuilder();
        i.append(s);
        i.reverse();
        return i.toString();
    }
}
