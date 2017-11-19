package com.fbriceno.task.controller;

import com.fbriceno.task.entity.Task;
import com.fbriceno.task.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> getAll(){
        return taskService.getAll();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task){
        return taskService.save(task);
    }
}
