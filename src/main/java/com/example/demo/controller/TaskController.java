package com.example.demo.controller;

import com.example.demo.services.TaskService;
import com.example.demo.task.TaskManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
    private TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/task/create")
    public String create(@RequestBody TaskManager taskManager) {
        taskService.createTask(taskManager);
        return "Task created Successfully";
    }

    @GetMapping("/task/{id}")
    public TaskManager get(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/task/next/{id}")
    public TaskManager moveToNextStage(@PathVariable Long id) {
        taskService.moveTaskToNextStage(id);
        return taskService.getTaskById(id);
    }

    @PutMapping("/task/previous/{id}")
    public TaskManager moveToPreviousStage(@PathVariable Long id) {
        taskService.moveTaskToPreviousStage(id);
        return taskService.getTaskById(id);
    }

    @PutMapping("/task/{id}")
    public TaskManager update(@PathVariable Long id, @RequestBody TaskManager taskManager) {
        taskManager.setId(id);
        taskService.updateTask(taskManager);
        return taskManager;
    }

    @DeleteMapping("/task/{id}")
    public String delete(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted successfully with id: " + id;
    }

}
