package ru.levs.lesson1_1.myapplication;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private String grade;
    private String birthdayYear;

    public Student(String info) {
        String[] parts = info.split(" ");
        this.name = parts[0];
        this.surname = parts[1];
        this.grade = parts[2];
        this.birthdayYear = parts[3];
        int id = (int) System.currentTimeMillis();
        this.id = id;
    }

    public String toString(){
        return this.id + " " + this.name + " " + this.surname + " " + this.grade + " " + this.birthdayYear;
    }

//    public void setId(Integer id){
//        this.id = id;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setSurname(String surname){
//        this.surname = surname;
//    }
//    public void setGrade(String grade){
//        this.grade = grade;
//    }
//    public void setBirthdayYear(String birthdayYear){
//        this.birthdayYear = birthdayYear;
//    }
    public Integer getId(){
        return this.id;
    }
//    public String getName(){
//        return this.name;
//    }
//    public String getSurname(){
//        return this.surname;
//    }
//    public String getGrade(){
//        return this.grade;
//    }
//    public String getBirthdayYear(){
//        return this.birthdayYear;
//    }
}
