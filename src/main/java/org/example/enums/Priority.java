package org.example.enums;

public enum Priority {
    HIGH(1),MEDIUM(2),LOW(3);

    private final int position;
    Priority(int value) {
        this.position = value;
    }

    public int getPosition() {
        return position;
    }
}
