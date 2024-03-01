import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        File f = new File("names.txt");

        ArrayList<String> names = new ArrayList<String>();
        try {
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String n = s.nextLine();
                names.add(n);
            }
        }
        catch (Exception e) {

        }

        System.out.println(names);

        for (String s: names) {
            Trie.insert(s);
        }
        }
    }
