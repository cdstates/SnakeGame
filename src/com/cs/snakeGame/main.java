package com.cs.snakeGame;

import com.cs.snakeGame.GameObjects.GameData;
import com.cs.snakeGame.GameObjects.GameFacade;
import com.cs.snakeGame.GameObjects.apple.Apple;
import com.cs.snakeGame.GameObjects.apple.SimpleApple;
import com.cs.snakeGame.GameObjects.snake.Snake;
import com.cs.snakeGame.GameObjects.snake.StandardSnake;
import com.cs.snakeGame.gameInterface.*;
import com.cs.snakeGame.GameObjects.score.Score;
import com.cs.snakeGame.gameController.GameController;
import com.cs.snakeGame.gameLogic.GameLogic;
import com.cs.snakeGame.gameLogic.SnakeGameLogic;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        Snake snake = new StandardSnake();
        Apple apple = new SimpleApple();
        Score score = new Score();

        GameData gameData = new GameData();
        GameFacade gameFacade = new GameFacade(snake, apple, score, gameData);
        GameLogic gameLogic = new SnakeGameLogic(gameFacade);

        GameObjectsView[] gameObjectsView = new GameObjectsView[5];
        gameObjectsView[0] = new GameFieldView();
        gameObjectsView[1] = new AppleView();
        gameObjectsView[2] = new SnakeBodyView();
        gameObjectsView[3] = new SnakeHeadView();
        gameObjectsView[4] = new ScoreView();

        GameView gameView = new GameView(gameData, gameObjectsView);
        gameData.addObserver(gameView);

        GameController gameController = new GameController(gameLogic, gameView);
    }
}


