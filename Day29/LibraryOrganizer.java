/*
A librarian has a list of book titles stored in a string array. 
However, the books were accidentally shuffled.
 The librarian wants to sort the books alphabetically.
 but also filter out any titles that are shorter than 3 characters or contain non-alphabetic characters 
 (e.g., digits or punctuation). Write a program that returns the cleaned and sorted list of titles.
*/

import java.util.*;

public class LibraryOrganizer {
    public static boolean isValid(String word) {
        return word.length() >= 3 && word.matches("[a-zA-Z]+");
    }

    public static List<String> cleanAndSortTitles(String[] titles) {
        List<String> validTitles = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            if (isValid(titles[i])) {
                validTitles.add(titles[i]);
            }
        }
        Collections.sort(validTitles);
        return validTitles;
    }

    public static void main(String[] args) {
        String[] titles = {"Zoo", "a", "The3", "Book", "a#", "apple", "cat"};
        System.out.println(cleanAndSortTitles(titles));  // Output: [Book, Zoo, apple, cat]
    }
}
