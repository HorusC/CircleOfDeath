package edu.augustana.csc490.circleofdeath;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 * Created by horuscuevas11 on 4/9/2015.
 */
public class GameFragment extends Fragment{
     private static final String TAG = "CardGame Activity";

    private static final int CARDS_IN_GAME = 52;

    private List<String> cardFileNameList;
    private List<String> cardList;
    private List<String> usedCards;
    private SecureRandom random;
    private Handler handler;

    private TextView circleOfDeath;
    private ImageView cardImageView;
    private LinearLayout gameLayout;
    private Button nextCardButton;
    private Button cardInfoButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        cardFileNameList = new ArrayList<String>();
        cardList = new ArrayList<String>();
        usedCards = new ArrayList<String>();
        random = new SecureRandom();
        handler = new Handler();

        cardImageView = (ImageView) view.findViewById(R.id.cardView);
        nextCardButton = (Button) view.findViewById(R.id.newCardButton);
        cardInfoButton = (Button) view.findViewById(R.id.directionsButton);

        return view;
    }

    // Reshuffles the cards
    public void newDeck(){
        AssetManager assets = getActivity().getAssets();
        cardFileNameList.clear();

        try{
            //for(String card: assets.list())
            cardFileNameList.add(path.replace(".png", ""));
        }
        catch (IOException exception){
            Log.e(TAG, "Error loading image file names", exception);
        }

        int cardCounter = 1;
        int numberOfCards = cardFileNameList.size();

        while (cardCounter <= CARDS_IN_GAME){
            int randomIndex = random.nextInt(numberOfCards);

            String fileName = cardFileNameList.get(randomIndex);

            if (!cardFileNameList.contains(fileName)){
                cardFileNameList.add(fileName);
                cardCounter++;
            }
        }
        loadNextCard();
    }

    private void loadNextCard(){
        String nextImage = cardFileNameList.remove(0);

    }
}
