package com.example.jamie.favouritefruits;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity {
  TextView fruitRating;
  TextView fruitName;
  TextView fruitWeight;
  ImageView fruitImage;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fruit);

    fruitRating = findViewById(R.id.fruitRating);
    fruitName = findViewById(R.id.fruitName);
    fruitWeight = findViewById(R.id.fruitWeight);
    fruitImage = findViewById(R.id.fruitImage);

    setDetails();
  }

  private void setDetails() {
    Bundle details = getIntent().getExtras();
    String name = (String) details.get("name");
    String rating = details.get("rating").toString();
    String weight = details.get("weight").toString() + "g";
    Drawable image = getDrawable(getResources().getIdentifier(name, "drawable", "com.example.jamie.favouritefruits"));

    fruitRating.setText(rating);
    fruitName.setText(name.substring(0, 1).toUpperCase() + name.substring(1));
    fruitWeight.setText(weight);
    fruitImage.setImageDrawable(image);
  }
}
