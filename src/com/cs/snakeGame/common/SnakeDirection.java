package com.cs.snakeGame.common;

public enum SnakeDirection{
    UP, DOWN, LEFT, RIGHT;

    public static SnakeDirection fromKey(char key) {
        return switch (Character.toUpperCase(key)) {
            case 'W' -> UP;
            case 'S' -> DOWN;
            case 'A' -> LEFT;
            case 'D' -> RIGHT;
            default -> throw new IllegalArgumentException("Invalid key: " + key);
        };
    }
}
