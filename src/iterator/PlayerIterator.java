package iterator;

import model.Player;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class PlayerIterator implements Iterator{
    private Player[] players;
    private int pos = 0;

    public PlayerIterator( Player players[] )
    {
        this.players = players;
    }

    public boolean hasNext()
    {
        return pos < players.length;
    }

    public Player next() throws NoSuchElementException
    {
        if ( hasNext() ){
            return players[pos++];
        }
        else
            pos = 0;
            return players[pos++];
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

}
