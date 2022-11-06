package HW4;

import java.util.Arrays;

public class Song {
    public static void main(String[] args) {
        String song = "You really believe\n"
                + "We can survive all of this\n"
                + "The black vacuum of the universe\n"
                + "It was designed\n"
                + "To swallow us whole\n"
                + "It's a losing game\n"
                + "We're at death's door\n"
                + "Another world war\n"
                + "Wildfires and earthquakes I foresaw\n"
                + "A life in crisis\n"
                + "A deadly virus\n"
                + "Tsunamis of hate are gonna find us\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "We're at death's door\n"
                + "Another world war\n"
                + "Wildfires and earthquakes I foresaw\n"
                + "A life in crisis\n"
                + "Mutated virus\n"
                + "Tsunamis of hate are gonna drown us\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "True\n"
                + "Just when you think\n"
                + "You are safe and secure\n"
                + "You'll forget what you need to remember\n"
                + "Living in peace\n"
                + "But you're living a lie\n"
                + "The game is rigged\n"
                + "We're at death's door\n"
                + "Another world war\n"
                + "Wildfires and earthquakes I foresaw\n"
                + "A life in crisis\n"
                + "A deadly virus\n"
                + "Tsunamis of hate are gonna drown us\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "Ah\n"
                + "We are fucking fucked\n"
                + "Hole up\n"
                + "Stockpile\n"
                + "Hoard up\n"
                + "We are getting fucking fucked\n"
                + "Ah\n"
                + "We are getting fucked\n"
                + "Ah\n"
                + "We are getting fucked\n"
                + "Hey, hey, hey, fuck off\n"
                + "Hey, hey, hey, stockpile\n"
                + "Hey, hey, hey, fuck off\n"
                + "Hey, hey, we are getting fucking fucked";

        // part 1
        String songToLowerCase = song.toLowerCase();
        String[] words = songToLowerCase.split("[^a-z']+");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // part 2
        int[] letters = new int[26];
        for (String s : words) {
            for (char ch : s.toCharArray()) {
                if (ch >= 97 && ch <= 122) {        // filter all symbols witch are not letters
                    letters[ch - 97]++;             // count letters by adding 1 to corresponding index
                }
            }
        }
        // print results
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > 0) {
                System.out.print((char) (i + 97) + ": " + letters[i] + "\t");
            }
        }
    }
}
