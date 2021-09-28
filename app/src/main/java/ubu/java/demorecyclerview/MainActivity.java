package ubu.java.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ubu.java.demorecyclerview.model.Food;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("ยำหมูยอ");
        food.setFood_image("https://img.wongnai.com/p/1920x0/2017/07/29/a969fb6cb6404fbbb4a4596ce65ff9d1.jpg");
        food.setFood_price(30);
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("ส้มตำ");
        food2.setFood_image("https://img.wongnai.com/p/1300x640/2016/11/02/aa74497471c54aeba8eb47a011e1354d.jpg");
        food2.setFood_price(35);
        foods.add(food2);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);
    }
}
