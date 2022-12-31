package com.demo.ShubhamSpring;

public class Course {



    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public Course(int id, String name, String city) {
        Id = id;
        Name = name;
        City = city;
    }

    private int Id;
    private String Name;
    private String City;
}
