package strings.challenges.stringTokenizerExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StringTokenizerExample {

    static String TEST_STRING = "id,first_name,last_name,email,gender,ip_address\n"
            + "1,Lanie,MacCoveney,lmaccoveney0@sphinn.com,Female,109.143.51.217\n"
            + "2,Casie,Kinnane,ckinnane1@buzzfeed.com,Female,88.83.213.30\n"
            + "3,Isidore,Splevins,isplevins2@vinaora.com,Male,194.175.166.4\n"
            + "4,Perren,Axell,paxell3@issuu.com,Male,94.243.244.17\n"
            + "5,Ware,Brik,wbrik4@businessinsider.com,Male,73.85.79.240\n"
            + "6,Iseabal,Biesinger,ibiesinger5@nhs.uk,Female,209.241.102.247\n"
            + "7,Cleavland,Leedal,cleedal6@trellian.com,Male,95.232.67.246\n"
            + "8,Melantha,Venus,mvenus7@t-online.de,Female,43.25.103.82\n"
            + "9,Nichol,Belderfield,nbelderfield8@furl.net,Female,24.78.213.58\n"
            + "10,Marie,Raxworthy,mraxworthy9@businessweek.com,Female,16.158.35.196\n ";

    public static List<String> getTokensFromString(String str, String delimiter, Boolean showDelimiter){

        List<String> tokens = new ArrayList<>();

        StringTokenizer stringTokenizer = new StringTokenizer(str, delimiter);

        while(stringTokenizer.hasMoreElements())
            tokens.add(stringTokenizer.nextToken());

        return tokens;
    }

    public static List<String> getTokensFromFile(String path, String delimiter, Boolean showDelimiter ){

        List<String> tokens = new ArrayList<>();
        String currLine = "";
        StringTokenizer tokenizer;

        try (BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                         StringTokenizerExample.class.getResourceAsStream("/" + path))))
        {
            while((currLine = br.readLine()) != null){
                tokenizer = new StringTokenizer(currLine, delimiter, showDelimiter);

                while (tokenizer.hasMoreElements()){
                    tokens.add(tokenizer.nextToken());
                }

            }


        }catch (IOException e){
            e.printStackTrace();
        }

        return tokens;
    }

    public static void main(String[] args) {

       //System.out.println(Collections.singleton(getTokens(TEST_STRING)));

        //getTokens(TEST_STRING).stream().forEach(System.out::println);

        System.out.println(getTokensFromFile("MOCK_DATA.csv", ",", false));


    }
}
