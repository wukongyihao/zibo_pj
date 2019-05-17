package com.example.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    public void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLenhthName("Apple"), R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLenhthName("Banana"), R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLenhthName("Orange"), R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLenhthName("Watermelon"), R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit grape = new Fruit(getRandomLenhthName("Grape"), R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLenhthName("Pineapple"), R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLenhthName("Strawberry"), R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLenhthName("Cherry"), R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLenhthName("Mango"), R.drawable.mongo);
            fruitList.add(mango);
        }

    }

    public String getRandomLenhthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
