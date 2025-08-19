package com.example.demo.task;

public enum TaskStatus {
    TODO,
    IN_PROGRESS,
    COMPLETED,
    BLOCKED;

    public TaskStatus nextStage(){
        return switch(this){
            case TODO -> IN_PROGRESS;
            case IN_PROGRESS -> COMPLETED;
            case COMPLETED -> BLOCKED;
            case BLOCKED -> BLOCKED;
        };
    }

    public TaskStatus previousStage(){
        return switch (this) {
            case BLOCKED -> COMPLETED;
            case COMPLETED -> IN_PROGRESS;
            case IN_PROGRESS -> TODO;
            case TODO -> TODO;
        };
    }
}

