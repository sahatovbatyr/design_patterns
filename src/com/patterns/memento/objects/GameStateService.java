package com.patterns.memento.objects;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class GameStateService {

    GameState gameState;

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    @Override
    public String toString() {
        return "GameStateService{" +
                "gameState=" + gameState +
                '}';
    }
}
