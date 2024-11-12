package com.example.fazenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_register;
    private ImageView imageView;
    private Button buttonLogin;
    private Button buttonHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciando os componentes do layout
        btn_register = findViewById(R.id.btn_register);
        imageView = findViewById(R.id.imageView);
        buttonLogin = findViewById(R.id.button_login);
        buttonHelp = findViewById(R.id.button_help);

        // Configurando o listener para o botão "Cadastrar-se"
        btn_register.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, telacadastro.class));
        });

        // Ouvintes para os outros botões
        buttonLogin.setOnClickListener(view -> {
            // Ação para o botão "Entrar"
        });

        buttonHelp.setOnClickListener(view -> {
            // Ação para o botão "Ajuda"
        });
    }
}

