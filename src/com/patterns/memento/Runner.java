package com.patterns.memento;

import com.patterns.memento.objects.Game;
import com.patterns.memento.objects.GameState;
import com.patterns.memento.objects.GameStateService;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class Runner {

    public static void main( String[] args){

        Game game = new Game();
        game.setLevel("level 1");
        game.setDistance(100);
        System.out.println(game);

        GameStateService gameStateService = new GameStateService();
        gameStateService.setGameState( game.getGameState());

        game.setGameState("level 2", 200);
        System.out.println(game);

        System.out.println("Loading saved data FROM DataBase...");
        game.load( gameStateService.getGameState());
        System.out.println(game);





    }
}
