package Assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    static Map<Character, Integer> getMappedCharacters(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        Map<Character, Integer> charMapper = new HashMap<Character, Integer>();

        String s = null;

        while ((s = br.readLine()) != null) {
            char[] characters = s.toCharArray();

            for (int i = 0; i < characters.length; i++) {
                char character = characters[i];

                if (charMapper.containsKey(character)) {
                    int count = charMapper.get(character);
                    charMapper.put(character, count + 1);
                } else {
                    charMapper.put(character, 1);
                }
            }
        }

        System.out.println("Successfully added characters to map. Closing buffered reader...");
        br.close();
        return charMapper;
    }

    public static void putCharactersIntoFile(Map<Character, Integer> charMapper) {
        try {
            PrintWriter printWriter = new PrintWriter("src/Assignment11/output.txt");

            for(Map.Entry record : charMapper.entrySet()) {
                String line = record.getKey() + " " + record.getValue();
                printWriter.println(line);
            }

            System.out.println("Successfully added the contents of map to the output file. Closing print writer...");
            printWriter.close();
        }

        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String... args) throws IOException {
        String fileName = args[0];

        Map<Character, Integer> charMapper = getMappedCharacters(fileName);
        putCharactersIntoFile(charMapper);
    }
}
