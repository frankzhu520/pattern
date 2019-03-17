package com.demo.pattern.factory.abstractfactory;

public interface CourseFactory {

    INote createNote();

    IVideo createVideo();

}
