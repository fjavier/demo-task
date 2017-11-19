package com.fbriceno.task.service;

import com.fbriceno.task.entity.Task;

public interface TaskService {
    Iterable<Task> getAll();
    Task save(Task task);
}
