package com.company;

public class Director {

    private String name;

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addTeacher(String name){
        Teacher teacher = new Teacher(name);
    }
    public void createLesson(String name){
        Lesson lesson = new Lesson(name);
    }
    public Lesson asignTeacherToLesson(Teacher teacher, Lesson lesson){
        lesson.setTeacher(teacher);
        return lesson;
    }
}
