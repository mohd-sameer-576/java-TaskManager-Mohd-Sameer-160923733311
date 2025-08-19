package com.example.demo.services;

import com.example.demo.task.TaskManager;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TaskService {
    HashMap<Long, TaskManager> map = new HashMap<>();
    public void createTask(TaskManager taskManager){
        map.put(taskManager.getId(), taskManager);
    }

    public void updateTask(TaskManager taskManager){
        map.put(taskManager.getId(),  taskManager);
    }

    public void deleteTask(TaskManager taskManager){
        map.remove(taskManager.getId());
    }
    public TaskManager getTaskById(Long id){
        return map.get(id);
    }

    public void moveTaskToNextStage(Long id) {
        TaskManager task = map.get(id);
        if (task != null) {
            task.setStatus(task.getStatus().nextStage());
        }
    }

    public void moveTaskToPreviousStage(Long id) {
        TaskManager task = map.get(id);
        if (task != null) {
            task.setStatus(task.getStatus().previousStage());
        }
    }
    public void deleteTask(Long id){
        map.remove(id);
    }


}
