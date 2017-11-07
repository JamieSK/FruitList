package com.example.jamie.favouritefruits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TopFruits topFruits = new TopFruits();
    ArrayList<Fruit> fruitsList = topFruits.getList();

    TopFruitsAdapter fruitsAdapter = new TopFruitsAdapter(this, fruitsList);
    ListView fruitList = findViewById(R.id.fruitList);
    fruitList.setAdapter(fruitsAdapter);
  }

  public void getFruit(View listItem) {
    Fruit fruit = (Fruit) listItem.getTag();
    Intent i = new Intent(this, FruitActivity.class);
    i.putExtra("name", fruit.getName());
    i.putExtra("rating", fruit.getRating());
    i.putExtra("weight", fruit.getWeight());
    startActivity(i);
  }
}
