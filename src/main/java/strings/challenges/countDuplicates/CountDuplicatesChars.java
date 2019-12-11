package strings.challenges.countDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CountDuplicatesChars {


    public static Map<Character, Integer> countDuplicatedChars(String str, int solution) {

        Map<Character, Integer> result = new HashMap<>();

        if(solution == 1 ) {

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
            }

        }else if(solution == 2){

            for(Character ch: str.toCharArray()){

                result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
            }
        }
        return result;
    }

    public static Map<Character, Long> countDuplicatesJava8Way(String string){

        Map<Character, Long> result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

    public static Map<String, Integer> countDuplicatedCharsWithUnicodeAndASCIISupport(String str){

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if(Character.charCount(cp) == 2) i++; // 2 means Surrogate pair

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        // refactoring the code


        return result;
    }

}