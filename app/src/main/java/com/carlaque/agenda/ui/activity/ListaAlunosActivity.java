package com.carlaque.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.carlaque.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_de_alunos);
        setTitle("Lista de Alunos TEESTE");

        List<String> alunos = new ArrayList<>(Arrays.asList("aluno 1", "aluno 2", "aluno 3", "aluno 4", "aluno 5", "aluno 6"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_de_alunos_listview);

        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));

    }
}
