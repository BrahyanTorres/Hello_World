package com.brahyantorres.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Mensaje_Visible;
    EditText Nombre_Usuario;
    int username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mensaje_Visible = findViewById(R.id.Mensaje_Visible);
        Nombre_Usuario = findViewById(R.id.Nombre_Usuario);

        Mensaje_Visible.setText("Hola señor Usuario");

        username = Integer.parseInt(Nombre_Usuario.getText().toString());

    }
}