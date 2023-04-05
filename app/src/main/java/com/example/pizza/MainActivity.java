package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button botaoPedido;
    private Spinner dropdown1;
    private Spinner dropdown2;
    private Spinner dropdown3;
    private Spinner dropdown4;

    private static final String[] paths = {"SELECIONE A QUANTIDADE","1 pizza", "2 pizzas", "3 pizzas" ,"4 pizzas" , "5 pizzas"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dropdown1 = findViewById(R.id.qnt_1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown1.setAdapter(adapter1);
        dropdown1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        dropdown2 = findViewById(R.id.qnt_2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown2.setAdapter(adapter2);
        dropdown2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        dropdown3 = findViewById(R.id.qnt_3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown3.setAdapter(adapter3);
        dropdown3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        dropdown4 = findViewById(R.id.qnt_4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown4.setAdapter(adapter4);
        dropdown4.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        botaoPedido = findViewById(R.id.btnPedido);
        botaoPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pedido concluído", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                break;

        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }

}