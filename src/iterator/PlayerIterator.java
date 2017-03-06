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
    public boolean hasPrev() {
        return pos > 0;
    }

    public Player next()
    {
        if ( hasNext() ){
            return players[pos++];
        }
        else
            pos = 0;
            return players[pos++];
    }

    public Player getPrev()
    {
        if ( hasPrev() ){
            return players[pos - 1];
        }
        else
            return players[players.length - 1];
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

}
