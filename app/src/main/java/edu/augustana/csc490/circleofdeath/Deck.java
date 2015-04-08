package edu.augustana.csc490.circleofdeath;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import au.com.bytecode.opencsv.CSVReader;

/**
 * Created by horuscuevas11 on 4/8/2015.
 */
public class Deck {
    private List<Card> cards;

    public Deck() {
        //Code courtesy of Dan and I's team Egret project.
        String filename = "Deck.csv";

        cards = new ArrayList<Card>();

        try {
            CSVReader reader = new CSVReader(new FileReader(filename));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                Card newCard = new Card(nextLine[0],
                        Integer.parseInt(nextLine[1]), nextLine[2]);
                cards.add(newCard);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // File Not Found - print to stack trace
            e.printStackTrace();
        } catch (IOException e) {
            // IOException - print to stack trace
            e.printStackTrace();
        }
    }

    public void shuffle() {
        Collections.shuffle(cards, new Random());
    }
}
