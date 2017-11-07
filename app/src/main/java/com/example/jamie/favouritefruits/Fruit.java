package com.example.jamie.favouritefruits;

import android.graphics.drawable.Drawable;

/**
 * Created by jamie on 07/11/2017.
 */

public class Fruit {
  private int rating;
  private String name;
  private int weight;
  private Drawable image;

  public Fruit(int rating, String name, int weight, Drawable image) {
    this.rating = rating;
    this.name = name;
    this.weight = weight;
    this.image = image;
  }

  public int getRating() {
    return rating;
  }

  public String getName() {
    return name;
  }

  public int getWeight() {
    return weight;
  }

  public Drawable getImage() {
    return image;
  }
}
