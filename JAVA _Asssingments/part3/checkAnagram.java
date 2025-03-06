import java.util.ArrayList;
import java.util.Collections;

public class checkAnagram {
    public static void main(String[] args) {
        char[] str1 = {'S','i','l','e','n','t'};
        char[] str2 = {'L','i','s','t','e','n'};
        // Copy the elements in list for easier operations
        ArrayList<Character> list1 = new ArrayList<>();
        for (Character character : str1) 
            list1.add(Character.toLowerCase(character));
        ArrayList<Character> list2 = new ArrayList<>();
        for (Character character : str2) 
            list2.add(Character.toLowerCase(character));
        
        // Sort the two lists 
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);


        // Compare if the two strings(ie lists) are equal
        if (list1.equals(list2))
            System.out.println("Huh Congratulations!! Strings are Anagram");
        else
            System.out.println("HaHaHa Strings are not Anagram");
    }
}
