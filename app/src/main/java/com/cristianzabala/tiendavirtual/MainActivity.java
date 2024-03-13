package com.cristianzabala.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> list_products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();
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
    }
}