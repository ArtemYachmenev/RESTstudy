package org.example;

import java.util.UUID;

public record Task(UUID id, String details, Boolean completed) {
    public Task(String details){
        this(UUID.randomUUID(), details, false);
    }
}

