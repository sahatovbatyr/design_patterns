package com.patterns.memento.objects;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class Game {

    private String level;
    private int distance;

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void load(GameState gameState){
        this.level = gameState.getLevel();
        this.distance = gameState.getDistance();
    }

    public GameState getGameState(){
        return  new GameState(level, distance);
    }

    public GameState setGameState( String level, int distance){
        this.level = level;
        this.distance = distance;
        return  new GameState(level, distance);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", distance=" + distance +
                '}';
    }
}
