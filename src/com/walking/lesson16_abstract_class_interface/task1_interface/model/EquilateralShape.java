package com.walking.lesson16_abstract_class_interface.task1_interface.model;

interface EquilateralShape {
    String EMPTY_ELEMENT = " ";
    String EMPTY_STRING = "";
    char NEW_LINE_SYMBOL = '\n';

    void setLength(int length) ;

    int getLength();

    String createShapeString() ;
}