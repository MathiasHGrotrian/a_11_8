package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise8
{
        /*
            Write a method minLength that accepts a set of strings as a parameter
            and that returns the length of the shortest string in the list.
            If your method is passed an empty set, it should return 0.
         */

    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("This is a string");
        set.add("We have to compare string lengths");
        set.add("Let's get started");
        set.add("Are you ready?");

        minLength(set);
    }

    public static int minLength(Set<String> set)
    {
        Iterator<String> iterator = set.iterator();

        String temp = "The quick brown fox jumped over the lazy dog. Pack my box with five dozen liquor jugs.";

        while(iterator.hasNext())
        {
            String current = iterator.next();

            if(current.length() < temp.length())
            {
                temp = current;
            }
        }

        System.out.println("Shortest string is : " + temp);
        return temp.length();
    }
}
