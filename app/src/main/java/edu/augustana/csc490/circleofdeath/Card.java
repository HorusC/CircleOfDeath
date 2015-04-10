package edu.augustana.csc490.circleofdeath;

import android.media.Image;

/**
 * Created by horuscuevas11 on 4/8/2015.
 */
public class Card {
    private String suit;
    private int number;

    public Card (int num, String symbol){
        this.suit = symbol;
        this.number = num;
    }

    public String getSuit(){
        return suit;
    }

    public int getNumber(){
        return number;
    }

    public String getDescription(){
        if (number == 1){
            return "Waterfall - You must ask a common knowledge question to the person directly to your right and directly to your left. The first player to correctly answer your question decides the direction in which the circle drinks during this game." +
                    "You then drink from your drink for as long as you'd like. As soon as you start drinking, the next person must start drinking, and then the person after that, etc. until everyone is drinking." +
                    "The people after you cannot stop drinking until the person before them in the circle stops drinking";
        } else if (number == 2){
            return "You - Pick a player and they must take a drink";
        } else if (number == 3){
            return "Me - Take a drink";
        } else if (number == 4){
            return "Never Have I Ever - All players put up 4 fingers and take turns saying things they have never done. If any other player has done said thing, they must put down a finger" +
                    "The first person to put all their fingers down must take a drink.";
        }else if (number == 5){
            return "Guys - Men take a drink";
        }else if (number == 6){
            return "Chicks - Ladies take a drink";
        }else if (number == 7){
            return "Heaven - Everyone must point to the sky, the last person to do so takes a drink";
        }else if (number == 8){
            return "Date - Choose another player, and for the rest of the game, whenever you take a drink, they must take one as well";
        }else if (number == 9){
            return "Rhyme - Say a word, and everyone must continue around the circle taking turns saying a word that ryhmes with the chosen word until someone repeats a word or can't think of one in 3 seconds. " +
                    "The loser takes a drink.";
        }else if (number == 10){
            return "Categories - Pick a category and continue around the circle saying things from within that category until someone repeats a word or can't think of one in 3 seconds. The loser takes a drink";
        }else if (number == 11){
            return "Thumb Master - Until the next Jack is drawn, whenever you put your thumb on the table, all other players must do so as well. The last to do so takes a drink.";
        }else if (number == 12){
            return "Question Master - Until the next Queen is drawn, whenever you ask a question of another player, if they answer they must take a drink";
        } else {
            return "Rule Master - Come up with a rule that must be followed for the rest of the game. Or you may abolish a rule set forth by a previous rule master";
        }
    }
}
