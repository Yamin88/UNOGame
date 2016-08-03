/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UNOModel;

import java.util.ArrayList;

/**
 *
 * @author e0000708
 */
public class UNODeck 
{
    
     private ArrayList<UNOCard> deck = new ArrayList<UNOCard>();

    public UNODeck() {
    }

    public ArrayList<UNOCard> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<UNOCard> deck) {
        this.deck = deck;
    }
    
    public void setCardToDeck(UNOCard und){
        this.getDeck().add(und);
    }
    public UNOCard getCardFromDeck()
    {
        return this.getDeck().remove(0);
    }
    public UNODeck addDeck()
    {
        String Color[] = {"Red", "Yellow", "Green", "Blue", "RYGB"};
        String type[] = {"Normal","Skip","Reverse","Draw2","Wild", "WildDrawFour"};
        
        UNOCard ucard;
        UNODeck udeck = new UNODeck();
        
        for (int c=0 ; c<Color.length;c++)
        {
            int index =0 ;
         
        
        for(int i=0 ; i <=12 ;i++)
        {
            int value = i;
       
            if (i>9)
            {
                index++;
                value=20;
            }
        
            if (c!=4)
            {
                ucard = new UNOCard(Color[c],type[index],value,Color[c]+type[0]+value);
                udeck.setCardToDeck(ucard);
            
                if(i!=0)
                udeck.setCardToDeck(ucard);
            }
        }
            if(c==4)
            {
                int count = 1;
                while(count <=4)
                {
                    for(int j=4;j<type.length;j++)
                    {
                        ucard = new UNOCard(Color[c],type[j],50,Color[c]+type[j]+50);
                        udeck.setCardToDeck(ucard);
                    }
                    count ++ ;
                }

            }
        }
        return udeck;
    }    

    @Override
    public String toString() 
    {
       return "UNO Deck: " + this.getDeck().size()+"\n"+deck;
    }  
        
}    
    
    

