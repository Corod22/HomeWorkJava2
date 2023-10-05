package ru.geekbrains.lesson1;

public class Chocolad extends Product {
   
    private int weight; // Вес
    private int calories; //Калорийность

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public Chocolad(String brand, String name, double price, int weight,  int calories ){
        super(brand, name, price);
        this.weight = weight;
        this.calories=calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - вес: %d- Калорийность %d", brand, name, price, weight,calories);
    }
}
