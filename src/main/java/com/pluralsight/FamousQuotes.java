package com.pluralsight;
import java.util.*;
public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "You are: Braver than you believe, Stronger than you seem, and Smarter than you think.- Christopher Robin",
                "A queen is never late. Everyone else is simply early.- Queen Clarisse in The Princess Diaries",
                "Never tell me the odds.- Han Solo",
                "You're gonna rattle the stars, you are!- John Silver in Treasure Planet",
                "A person's a person, no matter how small.- Dr. Seuss",
                "Eleanor was right. She never looked nice. She looked like art, art wasn't supposed to look nice; it was supposed to make you feel something.-Rainbow Rowell from Eleanor and Park",
                "A wizard is never late, Frodo Baggins. He arrives precisely when he means to.- Gandalf in LOTR:Fellowship",
                "Every plant is a weed in a place where it isn't welcome. -Andi Burke",
                "I will always wear the crown that you gave me. We will always stay Lost in Forever, and they'll remember we were legends.-Kelsea Ballerini",
                "I'm so in love with it all, every moment. You say you're too much for me, you're just enough. I won't regret it all. Life is golden and it's broken, and it's fine. It's all true at the same time.-MALINDA"
        };
        System.out.print("Pick a Quote (select #1 - #10): ");
        int index = scanner.nextInt();
        index--;
        Otherwise the index
// will be out of range.
        System.out.println(names[index]);
    }
catch (Exception e) {
        System.out.println("Your number was out of range!");
        e.printStackTrace();
    }
scanner.close();
// change number from range 1-6 to range 0-5
// as long as the user entered a number in the range
// of 1 to 6, this will work
    }
}
