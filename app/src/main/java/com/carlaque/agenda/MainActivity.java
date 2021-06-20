package com.carlaque.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setTitle("Lista de Aluno");

        List<String> alunos = new ArrayList<>(Arrays.asList("aluno 1", "aluno 2", "aluno 3", "aluno 4", "aluno 5", "aluno 6"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);

        listaDeAlunos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos));

    }
}
