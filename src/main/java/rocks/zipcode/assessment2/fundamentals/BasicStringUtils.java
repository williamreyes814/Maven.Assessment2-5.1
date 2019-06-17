package rocks.zipcode.assessment2.fundamentals;

import rocks.zipcode.assessment2.arrays.StringArrayUtils;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {



        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {


        // Java does not have a reverse function, need to convert input1 string to StringBuilder
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder
        input1.append(string1);
        // this reverses the order
        input1.reverse();
        // this converts the StringBuilder back to a string
        return input1.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

        String reverseString1 = reverse(string1);
        String reverseString2 = reverse(string2);


        return reverseString1+reverseString2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        String[] removeString  = charactersToRemove.split("");
        String newString = string;
        for(String letter: removeString){

            newString = newString.replace(letter, "");
        }


        return newString;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {


       //String charRemoved = removeCharacters(string, charactersToRemove);

        return reverse(removeCharacters(string, charactersToRemove));
    }
}
