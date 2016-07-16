// Dragão sem Chama: http://dragaosemchama.com.br/2016/07/android-autocompletetextview/
//Código: Primeiro Exemplo do componente AutoCompleteTextView
//Autor: Márcio Albuquerque
//Email: o.marcio.albu@gmail.com
//Data: Junho/2016
package com.dragao.sem.chama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class MainActivity extends AppCompatActivity {

    //Criação de um vetor com todos os meses do ano.
    String MesesVetor[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Colocar o ícone (ic_launcher) na action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Chamada da estrutura AutoCompleteTextView do Layout para um objeto.
        AutoCompleteTextView acObjText =
                (AutoCompleteTextView) findViewById(R.id.acTexto);

        // Criação de um ArrayAdapter, para que possa mostrar
            // a lista de sugestões para o usuário
        // ArrayAdapter:
        //   -> Do tipo string;
        //   -> É aplicado nessa classe (this);
        //   -> Tem como estrutura layout uma lista simples (android.R.layout.simple_list_item_1)
        //   -> É colocado o vetor que se deseja se aplicado no adapter (MesesVetor)
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, MesesVetor );
        acObjText.setAdapter(adapter);

    }
}// Fim da classe MainActivity
