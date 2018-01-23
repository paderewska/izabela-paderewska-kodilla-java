package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean ifExecuted = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        ifExecuted = true;
        return "Namaluj: " + whatToPaint + " w kolorze " + color;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
       return ifExecuted;
    }
}