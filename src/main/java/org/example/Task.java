package org.example;

public class Task {
    public final String text;
    public boolean completed = false;

    public Task(String text) { this.text = text; }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + text;
    }
}
