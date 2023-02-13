/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printcarrd;

/**
 *responsible for the generation of cards and stores in the deck array
 * high cohesion
 * @author jaism
 */
public class GenerateCard {
    private int size = 56;
    Card[] deck = new Card[size];
    
    public void generate()
           
    {
         int c = 0;
         for(Card.Suit s:Card.Suit.values())          //enum suits
         {
            for(Card.Value v:Card.Value.values())
            {
            deck[c] = new Card(s,v);         //deck[0] = hearts,1,2;
            c++;
            }
         }
    }
}
