package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
  private String manufacturer;

  public Smartphone(int id, String name, int price, String manufacturer) {
    super(id, name, price);
    this.manufacturer = manufacturer;
  }

  public String getManuFacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;


  @Override
  public boolean matches(String search) {
    boolean searchByName = super.matches(search);

    if (searchByName) {
      return true;
    }

    return this.getManufacturer().equalsIgnoreCase(search);
  }
