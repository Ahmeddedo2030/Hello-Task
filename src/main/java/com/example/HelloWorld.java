package com.example;

import com.atlassian.bamboo.task.TaskContext;
import com.atlassian.bamboo.task.TaskException;
import com.atlassian.bamboo.task.TaskResult;
import com.atlassian.bamboo.task.TaskResultBuilder;
import com.atlassian.bamboo.task.TaskType;

public class HelloWorld implements TaskType {

	@Override
    public TaskResult execute(TaskContext taskContext) throws TaskException {
        
        taskContext.getBuildLogger().addBuildLogEntry("Hello from MyTask!");
        return TaskResultBuilder.newBuilder(taskContext).success().build();
    }
}
