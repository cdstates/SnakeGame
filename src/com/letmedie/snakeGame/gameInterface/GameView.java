package com.letmedie.snakeGame.gameInterface;

import com.letmedie.snakeGame.GameObjects.GameData;
import com.letmedie.snakeGame.common.GameConstants;
import com.letmedie.snakeGame.common.Observer;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel implements Observer {
    private GameData gameData;
    private GameObjectsView[] gameObjectsViews;
    private JFrame frame;
    private boolean gameOverDisplayed;

    public GameView(GameData gameData, GameObjectsView[] gameObjectsViews) {
        this.gameData = gameData;
        this.gameObjectsViews = gameObjectsViews;
        this.gameOverDisplayed = false;
        setupFrame();
    }

    @Override
    public void update() {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GameObjectsView gameObjectsView : gameObjectsViews) {
            gameObjectsView.display(gameData, g);
        }
        if (!gameData.snakeIsAlive() && !gameOverDisplayed) {
            showGameOverDialog();
            gameOverDisplayed = true;
        }
    }

    private void setupFrame() {
        frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int panelWidth = GameConstants.fieldWidth * GameConstants.CELL_SIZE;
        int panelHeight = GameConstants.fieldHeight * GameConstants.CELL_SIZE + GameConstants.PADDING;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        requestFocusInWindow();
    }

    public void setGameOverDisplayed(boolean gameOverDisplayed) {
        this.gameOverDisplayed = gameOverDisplayed;
    }

    private void showGameOverDialog() {
        SwingUtilities.invokeLater(() -> new GameOverDialog(gameData.getScore()));
    }
}
