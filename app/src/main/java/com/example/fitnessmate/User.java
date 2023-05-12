package com.example.fitnessmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
    private String name;
    private int age;
    private int weight;
    private int height;
    private int dailyCalorieGoal;

    public User(String name, int age, int weight, int height, int dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDailyCalorieGoal(int dailyCalorieGoal) {
        this.dailyCalorieGoal = dailyCalorieGoal;
    }
}