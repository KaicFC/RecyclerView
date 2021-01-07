package com.cursoandroid.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.cursoandroid.recyclerview.R;
import com.cursoandroid.recyclerview.activity.RecyclerItemClickListener;
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

        //Eveto de Click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {

                            Filme filme = listaFilme.get(position);

                            Toast.makeText(
                                    getApplicationContext(),
                                    filme.getTituloFilme(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {

                            Filme filme = listaFilme.get(position);

                            Toast.makeText(
                                    getApplicationContext(),
                                    filme.getTituloFilme() + ", " + filme.getGenero() + ", "
                                    + filme.getAno(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );

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

        filme = new Filme("Vingadores: Era de Ultron", "Ação/Aventura", "2015");
        this.listaFilme.add(filme);

        filme = new Filme("Thor: O Mundo Sombrio", "Ação/Fantasia", "2013");
        this.listaFilme.add(filme);

        filme = new Filme("Capitão América 2: O Soldado Invernal", "Ação/Aventura", "2014");
        this.listaFilme.add(filme);

        filme = new Filme("Homem-Formiga e a Vespa", "Ação/Aventura", "2018");
        this.listaFilme.add(filme);

        filme = new Filme("Homem de Ferro 3", "Ação/Aventura", "2013");
        this.listaFilme.add(filme);

        filme = new Filme("Homem-Formiga", "Ação/Aventura", "2015");
        this.listaFilme.add(filme);

        filme = new Filme("O Incrível Hulk", "Ação/Fantasia", "2008");
        this.listaFilme.add(filme);

        filme = new Filme("Homem de Ferro", "Ação/Aventura", "2006");
        this.listaFilme.add(filme);

    }

}
