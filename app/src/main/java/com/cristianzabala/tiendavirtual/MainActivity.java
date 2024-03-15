package com.cristianzabala.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> list_products = new ArrayList<>();
    private RecyclerView rvProductsMain;
    private Toolbar topAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();

        rvProductsMain = findViewById(R.id.rv_products_main);
        topAppBar = findViewById(R.id.top_app_bar_list_product);
        ProductAdapter myAdapter = new ProductAdapter(list_products);

        GridLayoutManager myGrid = new GridLayoutManager(getApplicationContext(),3);
        LinearLayoutManager myLinear = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false);
        StaggeredGridLayoutManager myStagger = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL );
        rvProductsMain.setLayoutManager(myStagger);

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem Item) {
                if (Item.getItemId()==R.id.item_add_product){
                    startActivity(new Intent(MainActivity.this, FormProductActivity.class));
                }else if (Item.getItemId()==R.id.item_add_category){
                    Toast.makeText(MainActivity.this, "Click en Add Category",Toast.LENGTH_SHORT);
                }
                return true;
            }
        });

        rvProductsMain.setAdapter(myAdapter);
    }

    private void loadFakeData(){
        Product product1 = new Product("Compurador Asus", "El mejor computador gamer que puedes comprar", 11000000.0, "https://rampcrosario.com/wp-content/uploads/2019/03/pc-gamer.png");
        Product product2 = new Product("Teclado Asus", "El mejor Teclado gamer que puedes comprar", 100000.0, "https://d22fxaf9t8d39k.cloudfront.net/f65ad7c8036f1e99b17e1e3fbcd89625026e26a0e81e4af34b1dc8b0cf7d235c169554.png");
        Product product3 = new Product("Celular Asus", "El mejor Celular gamer que puedes comprar", 7000000.0, "https://dlcdnwebimgs.asus.com/gain/FB338DAC-B312-4D25-A7A3-DBDBDBC123CA");
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
        list_products.add(product1);
        list_products.add(product2);
        list_products.add(product3);
    }
}