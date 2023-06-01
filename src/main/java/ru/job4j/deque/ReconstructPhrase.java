package ru.job4j.deque;

import java.util.Deque;
import java.util.LinkedList;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder str = new StringBuilder();
        int element = evenElements.size();
        for (int i = 0; i < element; i++) {
            if (i % 2 == 0) {
                str.append(evenElements.poll());
            } else {
                evenElements.poll();
            }
        }
        return str.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        int size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            sb.append(descendingElements.pollLast());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
