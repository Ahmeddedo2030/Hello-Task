package com.example;

import com.atlassian.bamboo.task.TaskContext;
import com.atlassian.bamboo.task.TaskException;
import com.atlassian.bamboo.task.TaskResult;
import com.atlassian.bamboo.task.TaskResultBuilder;
import com.atlassian.bamboo.task.TaskType;
import com.atlassian.bamboo.deployments.execution.DeploymentTaskContext;
import com.atlassian.bamboo.deployments.execution.DeploymentTaskType;

public class HelloWorld implements TaskType, DeploymentTaskType {

	@Override
    public TaskResult execute(TaskContext taskContext) throws TaskException{
        
        taskContext.getBuildLogger().addBuildLogEntry("Hello from MyTask!");
        return TaskResultBuilder.newBuilder(taskContext).success().build();
    }

    @Override
    public TaskResult execute(DeploymentTaskContext taskContext) throws TaskException {
        taskContext.getBuildLogger().addBuildLogEntry("Hello from My Deployment Task!");
        return TaskResultBuilder.newBuilder(taskContext).success().build();
    }
}
