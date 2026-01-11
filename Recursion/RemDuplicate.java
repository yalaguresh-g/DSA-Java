package Recursion;

public class RemDuplicate {

    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]) {

        // Base case
        if (idx == str.length()) {
            System.out.println(newstr.toString());
            return;
        }

        char currChar = str.charAt(idx);

        // If character already exists, skip it
        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newstr, map);
        }
        // If character is new, add it
        else {
            map[currChar - 'a'] = true;
            newstr.append(currChar);
            removeDuplicate(str, idx + 1, newstr, map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
