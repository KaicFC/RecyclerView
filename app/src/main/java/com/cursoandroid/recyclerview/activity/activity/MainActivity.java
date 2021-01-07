package com.cursoandroid.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.cursoandroid.recyclerview.R;
import com.cursoandroid.recyclerview.activity.adapter.Adapter;
import com.cursoandroid.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilme = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //configurar o Adapter
        Adapter adapter = new Adapter( listaFilme);

        //Configurar o recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        // LinearLayout ou GridLayout
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //Recomendação Google
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL)); //Criar o divisor para cada linearlayout Vertical
        recyclerView.setAdapter(adapter); // Adapter instanciado

    }

    public void criarFilmes(){

        Filme filme = new Filme("Homem-Aranha: Longe de Casa", "Ação/Aventura", "2019");
        this.listaFilme.add(filme);

        filme = new Filme("Capitã Marvel", "Ação/Ficção científica", "2019");
        this.listaFilme.add(filme);

        filme = new Filme("Vingadores: Guerra Infinita", "Ação/Ficção científica", "2018");
        this.listaFilme.add(filme);

        filme = new Filme("Pantera Negra", "Ação/Aventura", "2018");
        this.listaFilme.add(filme);

        filme = new Filme("Thor: Ragnarok", "Ação/Aventura", "2017");
        this.listaFilme.add(filme);

        filme = new Filme("Guardiões da Galáxia Vol. 2", "Ação/Ficção científica", "2017");
        this.listaFilme.add(filme);

        filme = new Filme("Vingadores: Ultimato", "Ação/Ficção científica", "2019");
        this.listaFilme.add(filme);

        filme = new Filme("Homem-Formiga e a Vespa", "Ação/Aventura", "2018");
        this.listaFilme.add(filme);

        filme = new Filme("Doutor Estranho", "Ação/Fantasia", "2016");
        this.listaFilme.add(filme);

        filme = new Filme("Capitão América: Guerra Civil", "Ação/Aventura", "2016");
        this.listaFilme.add(filme);

    }

}
