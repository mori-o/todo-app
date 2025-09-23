package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Task> items = new ArrayList<>();

    public void add(String item) {
        if (item != null) {
            item = item.trim();
            if (!item.isEmpty()) {
                items.add(new Task(item));
            }
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }

    public boolean done(int index) {
        if (index >= 0 && index < items.size()) {
            Task t =  items.get(index);
            t.completed = !t.completed;
            return true;
        }
        return false;
    }

    public boolean search(String substring) {
        if (substring == null || substring.trim().isEmpty()) return false;
        if (items.isEmpty()) return true;
        boolean found = false;
        substring = substring.trim().toLowerCase();
        for (Task task : items) {
            if (task.text.toLowerCase().contains(substring)) {
                System.out.println(task);
                found = true;
            }
        }
        return found;
    }

    public void clear() { items.clear(); }
    public List<Task> getItems() { return new ArrayList<>(items); }
    public int size() { return items.size(); }
}