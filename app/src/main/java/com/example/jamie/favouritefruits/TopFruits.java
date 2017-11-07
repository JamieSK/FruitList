package com.example.jamie.favouritefruits;

import java.util.ArrayList;

/**
 * Created by jamie on 07/11/2017.
 */

public class TopFruits {
  private ArrayList<Fruit> list;

  public TopFruits() {
    list = new ArrayList<>();
    list.add(new Fruit(1, "avocado", 200, null));
    list.add(new Fruit(2, "mango", 800, null));
    list.add(new Fruit(3, "strawberry", 10, null));
    list.add(new Fruit(4, "tomato", 80, null));
    list.add(new Fruit(5, "papaya", 600, null));
  }

  public ArrayList<Fruit> getList() {
    return new ArrayList<Fruit>(list);
  }
}
