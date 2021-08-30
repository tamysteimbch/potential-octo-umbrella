package com.example.atividade_nv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.atividade_nv3.model.Funcionario;
import com.example.atividade_nv3.model.FuncionarioDAO;

public class CadastroActivity extends AppCompatActivity {

    EditText etNome, etHorasTrabalhadas, etValorHora;
    Button bSalvar;
    FuncionarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        declarations();

        bSalvar.setOnClickListener(v ->{
           if(etNome.getText().toString().isEmpty() ||
              etHorasTrabalhadas.getText().toString().isEmpty() ||
              etValorHora.getText().toString().isEmpty()) {

               Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

           } else {
               Funcionario funcionario = new Funcionario(
                       etNome.getText().toString(),
                       Double.parseDouble(etHorasTrabalhadas.getText().toString()),
                       Double.parseDouble(etValorHora.getText().toString())
               );

                dao.salvar(funcionario);

                Toast.makeText(this, "Funcionário cadastrado!", Toast.LENGTH_SHORT).show();

                finish();
           }
        });

    }

    private void declarations(){
        // declarações de EditText
        etNome = findViewById(R.id.etNome);
        etHorasTrabalhadas = findViewById(R.id.etHorasTrabalhadas);
        etValorHora = findViewById(R.id.etValorHora);

        // declarações de Button
        bSalvar = findViewById(R.id.bSalvar);

        // declaração DAO
        dao = new FuncionarioDAO();
    }
}