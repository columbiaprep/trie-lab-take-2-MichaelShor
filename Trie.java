// Java implementation of search and insert operations
// on Trie
//Stolen and modified from Baeldung

public class Trie {


    //base of the trie
    public static TrieNode root;




    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    public static void insert(String key, TrieNode n) {

        if (key.length() < 2) {
            return;
        }

        // strip the first character from word
        else {

            char currentLetter = key.charAt(0);
            TrieNode[] kids = root.children;
            for (TrieNode k: kids) {
                if (currentLetter == k.theLetter) {
                    insert(key.substring(1), k);
                }
                else {
                    // add that letter
                }
            }
            insert(key.substring(1), new TrieNode());
        }

    }

}