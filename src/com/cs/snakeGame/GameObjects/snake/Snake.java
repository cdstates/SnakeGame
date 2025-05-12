package com.cs.snakeGame.GameObjects.snake;

import com.cs.snakeGame.common.Point;
import com.cs.snakeGame.common.SnakeDirection;
import com.cs.snakeGame.common.GameConstants;

import java.util.LinkedList;

public abstract class Snake {
    private SnakeDirection direction;
    protected boolean isAlive;
    protected LinkedList<Point> body;
    protected Point head;

    public Snake() {
        this.direction = SnakeDirection.RIGHT;
        this.isAlive = true;
        this.body = new LinkedList<>();
        this.head = new Point(GameConstants.fieldWidth / 2, GameConstants.fieldWidth / 2);
    }

    public void move(Point apple) {
        Point newHead = newHeadPoint();

        if (newHead.getX() < 0 || newHead.getX() >= GameConstants.fieldWidth ||
                newHead.getY() < 0 || newHead.getY() >= GameConstants.fieldHeight) {
            headCollisions(); 
        }
        if(!isAlive)return;

        if (body.contains(newHead)) {
            isAlive = false;
            return; 
        }
        body.add(head);

        head = newHead; 
        if (!head.equals(apple)) {
            body.removeFirst(); 
        }
    }


    protected abstract void headCollisions();

    public void setDirection(SnakeDirection newDirection) {
        if ((direction == SnakeDirection.UP && newDirection != SnakeDirection.DOWN) ||
                (direction == SnakeDirection.DOWN && newDirection != SnakeDirection.UP) ||
                (direction == SnakeDirection.LEFT && newDirection != SnakeDirection.RIGHT) ||
                (direction == SnakeDirection.RIGHT && newDirection != SnakeDirection.LEFT)) {
            direction = newDirection;
        }
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public LinkedList<Point> getBody() {
        return body;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Point getHead() {
        return head;
    }

    private Point newHeadPoint() {
        switch (direction) {
            case UP:
                return new Point(head.getX(), head.getY() - 1);
            case DOWN:
                return new Point(head.getX(), head.getY() + 1);
            case LEFT:
                return new Point(head.getX() - 1, head.getY());
            case RIGHT:
                return new Point(head.getX() + 1, head.getY());
            default:
                throw new IllegalArgumentException();
        }
    }
}
