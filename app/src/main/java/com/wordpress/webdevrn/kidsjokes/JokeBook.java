package com.wordpress.webdevrn.kidsjokes;
import android.graphics.Color;

import java.util.Random;
/**
 * Created by christopherStephens on 1/9/15.
 */
public class JokeBook {
// this is a propertie so gets a m for member
        public String[] mJokes = {
                 "What did the bike say to the flower that was sitting on it?\n\n\n\nPetal will you!",
                 "What did the Gingerbreadman put on his bed?\n\n\n\nCookie Sheets ",
                 "What does a chicken do when it rains?\n\n\n\nIt gets wet",
                 "What is the biggest ant in the world\n\n\n\nA gi-ant",
                 "What do you call an alligator in a vest?\n\n\n\nAn investigator",
                 "Why did Tigger stick his head in the toilet?\n\n\n\nHe was looking for Pooh",
                 "There are two muffins in an oven.\nOne muffin turns to the other muffin and says, 'Boy, is it hot in here.'\nThe other muffin says, 'OH MY GOSH A TALKING MUFFIN.'",
                 "What did one eye say to the other eye?\n\n\n\nDon’t look now, but something between us smells.",
                 "Why is 6 afraid of 7?\n\n\n\nCause 7, 8, 9"
                };
    // this is a method
    public String getJoke() {
        String joke = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mJokes.length) ;
        joke = mJokes[randomNumber];

        return joke;
    };
};

