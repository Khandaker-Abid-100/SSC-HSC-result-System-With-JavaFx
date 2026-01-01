package org.example.resultsystem.model;

public class StudentInfo {
    private String name;
        private String fatherName;
       private   String motherName;
       private   String group;
       private    String roll;
       private   String reg;
       private   String year;
       private   String board;
       private   String exam;


    public StudentInfo(String year, String board) {
        this.year = year;
        this.board = board;
    }

    public StudentInfo(String name, String fatherName, String motherName, String group, String roll, String reg, String year, String board, String exam) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.group = group;
        this.roll = roll;
        this.reg = reg;
        this.year = year;
        this.board = board;
        this.exam = exam;
    }

    public StudentInfo(String name, String group, String roll, String reg, String exam) {
        this.name = name;
        this.group = group;
        this.roll = roll;
        this.reg = reg;
        this.exam = exam;
    }

    public StudentInfo(String name, String fatherName, String motherName, String group, String roll, String board, String year, String reg) {
        this.reg = reg;

        this.year = year;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.group = group;
        this.roll = roll;
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }
}
