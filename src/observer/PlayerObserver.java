package observer;

import model.Player;

public interface PlayerObserver {

    void updatePlayerData(Player actual_player, int hit_counter);
    void updatePlayerPanel(int act, int prev);
}
