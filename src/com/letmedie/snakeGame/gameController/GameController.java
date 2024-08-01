package com.letmedie.snakeGame.gameController;

import com.letmedie.snakeGame.gameLogic.GameLogic;
import com.letmedie.snakeGame.gameInterface.GameView;

import javax.swing.*;

public class GameController {
    private final GameLogic gameLogic;
    private final GameView gameView;
    private Timer gameTimer;

    public GameController(GameLogic gameLogic, GameView gameView) {
        this.gameLogic = gameLogic;
        this.gameView = gameView;
        setupInputHandler();
        startGame();
    }

    private void setupInputHandler() {
        InputHandler inputHandler = new InputHandler(gameLogic);
        gameView.addKeyListener(inputHandler);
        gameView.setFocusable(true);
    }

    private void startGame() {
        gameLogic.startGame();
        gameTimer = new Timer(300, e -> {
            gameLogic.moveSnake();
            if (!gameLogic.isGameActive()) {
                stopGame();
            }
        });
        gameTimer.start();
    }

    private void stopGame() {
        gameView.setGameOverDisplayed(false);
    }
}
