package com.example.atividade_nv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.atividade_nv3.model.Funcionario;
import com.example.atividade_nv3.model.FuncionarioDAO;

import java.text.NumberFormat;
import java.util.Locale;

public class DetalhesActivity extends AppCompatActivity {

    TextView tvNomeFuncionario, tvSalarioLiquido, tvSalarioBruto, tvINSS, tvIR, tvFGTS;
    Button bVoltar;
    FuncionarioDAO dao;
    NumberFormat numberFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        declarations();
        dao = new FuncionarioDAO();
        numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));
        Intent intent = getIntent();

        int position = intent.getIntExtra("position", -1);
        if (position == -1) { finish(); }

        Funcionario funcionario = dao.getFuncionario(position);

        tvNomeFuncionario.setText(funcionario.getNome());
        tvSalarioBruto.setText("Salário bruto: " + funcionario.getSalarioBruto());
        tvFGTS.setText("FTGS: " + funcionario.getFgts());
        tvINSS.setText("INSS: " + funcionario.getInss());
        tvIR.setText("IR: " + funcionario.getIr());
        tvSalarioLiquido.setText("Salário Líquido: " + funcionario.getSalarioLiquido());

        bVoltar.setOnClickListener(v -> {
            finish();
        });

    }

    private void declarations() {
        tvNomeFuncionario = findViewById(R.id.tvNomeFuncionario);
        tvSalarioBruto = findViewById(R.id.tvSalarioBruto);
        tvFGTS = findViewById(R.id.tvFGTS);
        tvIR = findViewById(R.id.tvIR);
        tvINSS = findViewById(R.id.tvINSS);
        tvSalarioLiquido = findViewById(R.id.tvSalarioLiquido);

        bVoltar = findViewById(R.id.bVoltar);
    }
}