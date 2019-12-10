package strings.challenges.countDuplicates;

import strings.challenges.countDuplicates.CountDuplicatesChars;

import java.util.Collections;

public class App {

    public static void main(String[] args) {

        String test = "AAADDBGGHTN";

        CountDuplicatesChars.countDuplicatedChars(test, 1).
                entrySet().forEach(entry -> {
                System.out.println("entry.getKey() + entry.getValue() = " + entry.getKey() + " " + entry.getValue());
            });

        System.out.println("Collections Method" +
                Collections.singleton(CountDuplicatesChars.countDuplicatedChars(test, 2)));
        

        System.out.println("Collections Java 8 Streams" + CountDuplicatesChars.countDuplicatesJava8Way(test));
        

        System.out.println("CountDuplicatesChars.countDuplicatedCharsWithUnicodeAndASCIISupport(test) = "
                            + CountDuplicatesChars.countDuplicatedCharsWithUnicodeAndASCIISupport(test));
        
    }
}
