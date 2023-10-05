package ru.geekbrains.lesson1;

public class ChocolateOfBar extends Product {

    private double weight; //Вес шоколада
    private int calories; //Калорийность
    private String typeOfChocolate; //Тип шоколада

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getTypeOfChocolate() {
        return typeOfChocolate;
    }

    public void setTypeOfChocolate(String typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    public ChocolateOfBar(String brand, String name, double price, double weight, int calories, String typeOfChocolate ){
        super(brand, name, price);
        this.weight = weight;
        this.calories=calories;
        this.typeOfChocolate=typeOfChocolate;
    }
    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - вес: %.2f-калорийность: %d-вид шоколада %s", brand, name, price, weight, calories,typeOfChocolate);
    }

}
