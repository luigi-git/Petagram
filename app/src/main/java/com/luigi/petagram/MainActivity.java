package com.luigi.petagram;

//import android.support.design.widget.FloatingActionButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        //agregarFAB();

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void irMascotasFavoritas(View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Micky",2,R.drawable.raton));
        mascotas.add(new Mascota("Patas",4,R.drawable.conejo));
        mascotas.add(new Mascota("Manchas",5,R.drawable.gato));
        mascotas.add(new Mascota("Bigotes",2,R.drawable.hamster));
        mascotas.add(new Mascota("Franky",1,R.drawable.perico));
        mascotas.add(new Mascota("Thor",4,R.drawable.perro));
        mascotas.add(new Mascota("Lazaro",4,R.drawable.pez));
        mascotas.add(new Mascota("Crispin",2,R.drawable.raton_1));
        mascotas.add(new Mascota("Octavio",3,R.drawable.tarantula));
        mascotas.add(new Mascota("Timoty",4,R.drawable.pez_2));
        mascotas.add(new Mascota("Doroteo",4,R.drawable.perico_2));
        mascotas.add(new Mascota("Miguelito",1,R.drawable.raton_2));

    }
    /*public void agregarFAB(){
        FloatingActionButton miFAB = (FloatingActionButton) findViewById(R.id.fabMiFAB);
        miFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }*/
}
