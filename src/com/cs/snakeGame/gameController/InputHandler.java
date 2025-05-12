package com.cs.snakeGame.gameController;
import com.cs.snakeGame.gameLogic.GameLogic;
import com.cs.snakeGame.common.SnakeDirection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {
    private final GameLogic gameLogic;

    public InputHandler(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        handleKeyPress(e.getKeyCode());
    }

    private void handleKeyPress(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                gameLogic.changeDirection(SnakeDirection.UP);
                break;
            case KeyEvent.VK_DOWN:
                gameLogic.changeDirection(SnakeDirection.DOWN);
                break;
            case KeyEvent.VK_LEFT:
                gameLogic.changeDirection(SnakeDirection.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                gameLogic.changeDirection(SnakeDirection.RIGHT);
                break;
        }
    }
}
