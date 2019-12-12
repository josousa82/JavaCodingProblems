import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strings.challenges.stringTokenizerExample.StringTokenizerExample;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TokenizerTest {

    private List<String> expectedTokensForString = Arrays.asList(
            "1" , "IND" , "India" ,
            "2" , "MY" , "Malaysia" ,
            "3", "AU" , "Australia" );

    private List<String> expectedTokensFromFile = Arrays.asList(
            "1" , "IND" , "India" ,
            "2" , "MY" , "Malaysia" ,
            "3", "AU" , "Australia" );


    @DisplayName("Test static method StringTokenizerExample.getTokensFromString(str)")
    @Test
    public void testGetTokensFromString(){

        String  str = "1|IND|India|2|MY|Malaysia|3|AU|Australia";
        List<String> actualTokens = StringTokenizerExample.getTokensFromString(str, "|", false);
        assertEquals(expectedTokensForString, actualTokens);

    }

    @Test
    public void testGetTokensFromFile(){

    }

}
