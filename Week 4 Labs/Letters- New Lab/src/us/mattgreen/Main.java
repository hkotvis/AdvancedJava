package us.mattgreen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        double wis = 15726398;
        double cal = 38041430;
        double texas = 26059203;

        System.out.println(cal/texas);
        System.out.println("Number of Copies: ");
        System.out.println("Cost: ");

        String text ="There was once a little princess whose father was king over a great\n" +
                "country full of mountains and valleys.  His palace was built upon one\n" +
                "of the mountains, and was very grand and beautiful.  The princess,\n" +
                "whose name was Irene, was born there, but she was sent soon after her\n" +
                "birth, because her mother was not very strong, to be brought up by\n" +
                "country people in a large house, half castle, half farmhouse, on the\n" +
                "side of another mountain, about half-way between its base and its peak.\n" +
                "\n" +
                "The princess was a sweet little creature, and at the time my story\n" +
                "begins was about eight years old, I think, but she got older very fast.\n" +
                "Her face was fair and pretty, with eyes like two bits of night sky,\n" +
                "each with a star dissolved in the blue.  Those eyes you would have\n" +
                "thought must have known they came from there, so often were they turned\n" +
                "up in that direction.  The ceiling of her nursery was blue, with stars\n" +
                "in it, as like the sky as they could make it. But I doubt if ever she\n" +
                "saw the real sky with the stars in it, for a reason which I had better\n" +
                "mention at once.\n" +
                "\n" +
                "These mountains were full of hollow places underneath; huge caverns,\n" +
                "and winding ways, some with water running through them, and some\n" +
                "shining with all colours of the rainbow when a light was taken in.\n" +
                "There would not have been much known about them, had there not been\n" +
                "mines there, great deep pits, with long galleries and passages running\n" +
                "off from them, which had been dug to get at the ore of which the\n" +
                "mountains were full.  In the course of digging, the miners came upon\n" +
                "many of these natural caverns.  A few of them had far-off openings out\n" +
                "on the side of a mountain, or into a ravine.\n";

        text = text.replace(",", "").replace(".","").trim();
        String[] words = text.split(" ");
        HashMap hm = new HashMap();
        for (String s: words){
            if(hm.containsKey(s)){
                hm.put(s, (Integer) hm.get(s) + 1);
            }
            else{
                hm.put(s, new Integer(1));
            }
        }
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }
}


//----------------------------------------------------------------------------------------------------------------------
//1.Create a class that includes a main method that calculates how many letters everyone in Wisconsin would have to
// write if they wrote everyone in California a letter and how many copies of those letters would have to be made for
// everyone in Texas to have a copy.  Print the number of copies that would have to be made for Texas and how much it
// would cost at $3.23 each to copy them.2.Populations:Wisconsin Total5,726,398California 38,041,430Texas26,059,203


