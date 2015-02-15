package com.example.geoffroy.myapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainActivity extends Activity {
    TextView resultArea;
    private EditText fEmail, fMdp;
    private TextView error;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
        resultArea = new TextView(this);
        resultArea.setText("Please wait.");
        setContentView(resultArea);
        new FetchSQL().execute();**/
    }
    private class FetchSQL extends AsyncTask<Void,Void,String> {
        @Override
        protected String doInBackground(Void... params) {
            String retval = "";
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                retval = e.toString();
            }
            String url = "jdbc:postgresql://192.168.1.41:5432/application_android?user=postgres&password=localhost";
            Connection conn;
            try {
                DriverManager.setLoginTimeout(5);
                conn = DriverManager.getConnection(url);
                Statement st = conn.createStatement();
                String sql;
                sql = "SELECT encrypted_password from users where id = 932 ";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()) {
                    retval = rs.getString(1);
                }
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                retval = e.toString();
            }
            return retval;
        }
        @Override
        protected void onPostExecute(String value) {
            resultArea.setText(value);
        }
    }

    public void connection(View view){
        error.setText("");
        //condition de connection pour afficher l'erreur avant de lancer la Home_Page
        //retour de la fonction pour la condition
        //connect(fEmail.getText().toString(), fMdp.getText().toString());
    }

    private void connect(String email, String mdp){
/**
        NetworkRequestAdapter net = new NetworkRequestAdapter(this);
        net.addObserver(this);

        String address = getResources().getString(R.string.serveurAdd)
                + getResources().getString(R.string.connexionAdd);

        net.setUrl(address);
        net.addParam("email", email);
        net.addParam("mdp", mdp);

        net.send();**/

    }
}
