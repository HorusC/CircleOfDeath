package edu.augustana.csc490.circleofdeath;

import android.media.Image;

/**
 * Created by horuscuevas11 on 4/8/2015.
 */
public class Card {
    private String suit;
    private int number;
    private String cardImage;

    public Card (String symbol, int num, String image){
        this.suit = symbol;
        this.number = num;
        this.cardImage = image;
    }


}
