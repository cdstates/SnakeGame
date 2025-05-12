package com.cs.snakeGame.gameController;

import com.cs.snakeGame.gameLogic.GameLogic;
import com.cs.snakeGame.gameInterface.GameView;

import javax.swing.*;

public class GameController {
    private final GameLogic gameLogic;
    private final GameView gameView;

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
        Timer gameTimer = new Timer(300, e -> {
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
