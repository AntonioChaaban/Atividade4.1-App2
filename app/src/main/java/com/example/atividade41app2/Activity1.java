package com.example.atividade41app2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String idade;


    public void saveVariables(View v){
        EditText tx = (EditText) findViewById(R.id.nome);
        nome = tx.getText().toString();
        if(!nome.isEmpty()) {
            TextView tv = (TextView) findViewById(R.id.ViewNome);
            tv.setText(nome);
        }

        EditText tx1 = (EditText) findViewById(R.id.cpf);
        cpf = tx1.getText().toString();
        if(!cpf.isEmpty()) {
            TextView tv1 = (TextView) findViewById(R.id.ViewCpf);
            tv1.setText(cpf);
        }

        EditText tx2 = (EditText) findViewById(R.id.email);
        email = tx2.getText().toString();
        if(!email.isEmpty()) {
            TextView tv2 = (TextView) findViewById(R.id.ViewEmail);
            tv2.setText(email);
        }

        EditText tx3 = (EditText) findViewById(R.id.idade);
        idade = tx3.getText().toString();
        if(!idade.isEmpty()) {
            TextView tv3 = (TextView) findViewById(R.id.ViewIdade);
            tv3.setText(idade);
        }

        EditText tx4 = (EditText) findViewById(R.id.telefone);
        telefone = tx4.getText().toString();
        if(!telefone.isEmpty()) {
            TextView tv4 = (TextView) findViewById(R.id.ViewTelefone);
            tv4.setText(telefone);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText et = (EditText) findViewById(R.id.nome);
        nome = et.getText().toString();
        EditText et1 = (EditText) findViewById(R.id.idade);
        EditText et2 = (EditText) findViewById(R.id.cpf);
        EditText et3 = (EditText) findViewById(R.id.email);
        EditText et4 = (EditText) findViewById(R.id.telefone);

        if(nome != null ){
            //nome = et.getText().toString();
            outState.putString("nome",nome);
        }
        if(et1 != null){
            idade = et1.getText().toString();
            outState.putString("idade",idade);
        }
        if(et2 != null){
            cpf = et2.getText().toString();
            outState.putString("cpf",cpf);
        }
        if(et3 != null){
            email = et3.getText().toString();
            outState.putString("email",email);
        }
        if(et4 != null){
            telefone = et4.getText().toString();
            outState.putString("telefone",telefone);
        }

        /*
        nome = et.getText().toString();
        idade = et1.getText().toString();
        cpf = et2.getText().toString();
        email = et3.getText().toString();
        telefone = et4.getText().toString();

        outState.putString("nome",nome);
        outState.putString("idade",idade);
        outState.putString("cpf",cpf);
        outState.putString("email",email);
        outState.putString("telefone",telefone);


         */
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(!savedInstanceState.getString("nome").isEmpty()) {
            nome = savedInstanceState.getString("nome");
            TextView tv = (TextView) findViewById(R.id.ViewNome);
            tv.setText(nome);
        }
        if(!savedInstanceState.getString("idade").isEmpty()) {
            idade = savedInstanceState.getString("idade");
            TextView tv2 = (TextView) findViewById(R.id.ViewIdade);
            tv2.setText(idade);
        }
        if(!savedInstanceState.getString("cpf").isEmpty()) {
            cpf = savedInstanceState.getString("cpf");
            TextView tv3 = (TextView) findViewById(R.id.ViewCpf);
            tv3.setText(cpf);
        }
        if(!savedInstanceState.getString("email").isEmpty()) {
            email = savedInstanceState.getString("email");
            TextView tv4 = (TextView) findViewById(R.id.ViewEmail);
            tv4.setText(email);
        }
        if(!savedInstanceState.getString("telefone").isEmpty()) {
            telefone = savedInstanceState.getString("telefone");
            TextView tv5 = (TextView) findViewById(R.id.ViewTelefone);
            tv5.setText(telefone);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}