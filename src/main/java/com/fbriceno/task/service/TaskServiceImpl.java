package com.fbriceno.task.service;

import com.fbriceno.task.entity.Task;
import com.fbriceno.task.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
