package com.fbriceno.task.repository;

import com.fbriceno.task.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
