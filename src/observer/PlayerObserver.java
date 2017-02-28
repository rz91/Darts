package observer;

import model.Player;

public interface PlayerObserver {

    void updatePlayerData(Player actual_player);
    void updatePlayerPanel(int act, int prev);
}
