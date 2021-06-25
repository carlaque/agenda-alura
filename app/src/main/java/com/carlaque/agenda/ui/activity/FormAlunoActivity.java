package com.carlaque.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.carlaque.agenda.R;
import com.carlaque.agenda.model.Aluno;

public class FormAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_aluno);

        EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno aluno = new Aluno(nome,telefone,email);

                Toast.makeText(FormAlunoActivity.this, "Aluno criado!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}