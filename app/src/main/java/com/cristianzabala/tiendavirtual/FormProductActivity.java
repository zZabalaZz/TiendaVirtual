package com.cristianzabala.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class FormProductActivity extends AppCompatActivity {

    private Button btnSaveFrom;
    private TextInputLayout nameTextField, descriptionTextField, priceTextField, imageUrlTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);

        nameTextField = findViewById(R.id.et_name_product_form);
        descriptionTextField = findViewById(R.id.et_description_product_form);
        priceTextField = findViewById((R.id.et_price_product_form));
        imageUrlTextField = findViewById(R.id.et_imageUrl_product_form);

        btnSaveFrom = findViewById(R.id.btn_save_product_form);

        btnSaveFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = nameTextField.getEditText().getText().toString().trim();
                String description = descriptionTextField.getEditText().getText().toString().trim();
                String price = priceTextField.getEditText().getText().toString().trim();
                String imageUrl = imageUrlTextField.getEditText().getText().toString().trim();



                if(name.isEmpty()){
                    nameTextField.setError("Por favor ingrese el nombre.");
                    return;
                } else if (name.length() > 20) {
                    nameTextField.setError("Máximo de caracteres superado.");
                    return;
                }
                if(description.isEmpty()){
                    nameTextField.setError("Por favor ingrese la descripción.");
                    return;
                }
                if(price.isEmpty()){
                    nameTextField.setError("Por favor ingrese el precio.");
                    return;
                }if(imageUrl.isEmpty()){
                    nameTextField.setError("Por favor ingrese el URL de la imágen.");
                    return;
                }

                Product myNewProduct = new Product("Computador", "descripción",5000000,"No hay"  );


                Toast.makeText(FormProductActivity.this, "Pulsado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}