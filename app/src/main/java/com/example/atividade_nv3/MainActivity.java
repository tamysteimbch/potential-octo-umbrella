package com.example.atividade_nv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.atividade_nv3.model.Funcionario;
import com.example.atividade_nv3.model.FuncionarioDAO;

public class MainActivity extends AppCompatActivity {

    ListView lvFuncionarios;
    Button bCadastroFunc;

    FuncionarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declarations();

        bCadastroFunc.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        lvFuncionarios.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = new Intent(this, DetalhesActivity.class);
            intent.putExtra("position", position);

            startActivity(intent);

        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        lvFuncionarios.setAdapter(new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1,
            dao.getListaFuncionario()
        ));

    }

    private void declarations(){
        // declarações de list view
        lvFuncionarios = findViewById(R.id.lvFuncionarios);

        // declarações de buttons
        bCadastroFunc = findViewById(R.id.bCadastroFunc);

        dao = new FuncionarioDAO();
    }

}