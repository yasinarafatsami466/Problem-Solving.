
package com.mycompany.mavenproject1;

public class Student {

    private int mark;

    public void setMarks(int mark) {
        this.mark = mark;
        System.out.println("Marks set to " + mark + " Success!");
    }

    public int getMark() {
        return mark;
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Setting marks!");

        s1.setMarks(60);

        System.out.println("Marks = " + s1.getMark());
    }
}
