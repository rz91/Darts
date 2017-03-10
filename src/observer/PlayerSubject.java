package observer;

import model.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerSubject {
    private final List<PlayerObserver> observerList = new ArrayList();

    public void registerPlayerObserver(PlayerObserver newObserver){
        observerList.add(newObserver);
    }

    public void unregisterPlayerObserver(PlayerObserver newObserver){
        observerList.remove(newObserver);
    }

    public void notifyPlayerObservers(int act, int prev){
        for (PlayerObserver observer : observerList) {
           observer.updatePlayerPanel(act,prev);
        }
    }

    public void notifyPlayerObservers(Player actual_player, int hit_counter) {
        for (PlayerObserver observer : observerList) {
            observer.updatePlayerData(actual_player,hit_counter);
        }
    }
}


