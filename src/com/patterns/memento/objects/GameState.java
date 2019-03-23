package com.patterns.memento.objects;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class GameState {

    private String level;
    private int distance;

    public GameState( String level, int distance ){
        this.level = level;
        this.distance = distance;

    }

    public GameState(  ){

    }

    public String getLevel() {
        return level;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "GameState{" +
                "level='" + level + '\'' +
                ", distance=" + distance +
                '}';
    }
}
