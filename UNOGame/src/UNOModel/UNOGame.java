/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOModel;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author e0000708
 */
public class UNOGame {
    private String GameID;
    private ArrayList<UNOPlayer> playerList ;
    private String Status; 
    private UNODeck unodeck;
    //private ArrayList<String> disPile = new ArrayList<String>();
    private UNOCard unocard;

    public UNOGame(String GameID, ArrayList<UNOPlayer> playerList, String Status, UNODeck unodeck) {
        this.GameID = GameID;
        this.playerList = playerList;
        this.Status = Status;
        this.unodeck = unodeck;
    }

    public String getGameID() {
        return GameID;
    }

    public void setGameID(String GameID) {
        this.GameID = GameID;
    }

    public ArrayList<UNOPlayer> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<UNOPlayer> playerList) {
        this.playerList = playerList;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public UNODeck getUnodeck() {
        return unodeck;
    }

    public void setUnodeck(UNODeck unodeck) {
        this.unodeck = unodeck;
    }

    public UNOCard getUnocard() {
        return unocard;
    }

    public void setUnocard(UNOCard unocard) {
        this.unocard = unocard;
    }
    
     public UNODeck ShuffleDeck(UNODeck udDeck)
     {
         Collections.shuffle(udDeck.getDeck());
         return udDeck;
     }
 
     public void startPlay(){
         unodeck = this.ShuffleDeck(unodeck.addDeck());
         
         int count = 1; 
         while(count <=7){
             for(UNOPlayer player : playerList){
                 UNOCard handCard = unodeck.getCardFromDeck();
                 player.setCardToHand(handCard);
             }
             
             count++;
         }
         unocard = unodeck.getCardFromDeck();
     }
    
    
 

    @Override
    public String toString() {
        return "Game ID=" + GameID + "\nDiscard Card=" + unocard + "\nGameStatus=" + Status + "\n" + unodeck + "\n\t" + playerList;
    }
   
}
