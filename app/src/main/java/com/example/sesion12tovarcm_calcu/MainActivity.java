package com.example.sesion12tovarcm_calcu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
         //variables globales de interface XML
        EditText etNum1,etNum2;
        TextView tvSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo oncreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Integrar elementoas XML a Java
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);

        tvSalida=findViewById(R.id.tvSalida);

        Button buton = (Button)findViewById(R.id.btnToast1);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast3 = new Toast(getApplicationContext());

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast2, null);

                TextView txtMsg = (TextView) layout.findViewById(R.id.tvSalida);
                txtMsg.setText("Toast Personalizado");

                toast3.setDuration(Toast.LENGTH_LONG);
                toast3.setView(layout);
                toast3.show();
            }

        });
    }//termina metodo oncreate

    //metodo para suma
    public void sumaNumeros(View view){

        String valor1=etNum1.getText().toString();
        String valor2=etNum2.getText().toString();

        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);

        int suma=nro1+nro2;

        String resulSuma=String.valueOf(suma);
        tvSalida.setText(resulSuma);

    }//termina metodo suma
    //metodo para suma
    public void restaNumeros(View view){

        String valor1=etNum1.getText().toString();
        String valor2=etNum2.getText().toString();

        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);

        int resta=nro1-nro2;

        String resulResta=String.valueOf(resta);
        tvSalida.setText(resulResta);

    }//termina metodo suma



}