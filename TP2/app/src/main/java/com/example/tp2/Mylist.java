package com.example.tp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Mylist extends AppCompatActivity {

    private static final String TAG = "Mylist";
    ArrayList<Etablissement> etablissements = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylist);
        Log.d(TAG, "Mylist onCreate: called");
        initRecylerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "you choose : " + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "you choose : " + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "you choose : " + item.getTitle(), Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "you choose : Default", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initRecylerView() {
        Log.d(TAG, "initRecylerView: called");

        Etablissement ensias = new Etablissement("ENSIAS", "Ecole Nationale Supérieure d'Informatique et d'Analyse des Systémes", R.drawable.ensias);
        Etablissement esith = new Etablissement("ESITH", "Ecole Supérieure des Indutries du Textile et de l’Habillement", R.drawable.esith);
        Etablissement EHTP = new Etablissement("EHTP", "Ecole Hassania Des Travaux Publics", R.drawable.ehtp);
        Etablissement EMI = new Etablissement("EMI", "Ecole Mohammadia d'ingénieurs", R.drawable.emi);
        Etablissement INSEA = new Etablissement("INSEA", "Institut National de Statistique et d'Economie Appliquée", R.drawable.insea);

        etablissements.add(ensias);
        etablissements.add(esith);
        etablissements.add(EHTP);
        etablissements.add(EMI);
        etablissements.add(INSEA);
        etablissements.add(ensias);
        etablissements.add(esith);
        etablissements.add(EHTP);
        etablissements.add(EMI);
        etablissements.add(INSEA);

        RecyclerView recyclerView = findViewById(R.id.list);
        MyAdapter adapter = new MyAdapter(etablissements);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}