package mx.edu.utng.appcristhian;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by ACER on 18/04/2016.
 */
public class Display extends Activity {
    //se declara variable de tipo ImageView para asignarsela a imvsemaforo
    //y pasarla como parametro a nuesto estado concreto
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        //asigna variable a nuestro ImagenView
        imagen = (ImageView)findViewById(R.id.imvsemaforo);
        //se crea y asigna nuestro boton que nos dara el estado en que se encuentra el semaforo
        Button estadoSema = (Button)findViewById(R.id.btnsemaforo);
        //se genera la acción del boton
        estadoSema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se declara una variable de tipo Random para obtener de forma
                //aleatoria el estado del semaforo
                Random r = new Random();
                //se obtiene el valor entero que arroja el random y se limita a que solo
                //mande valores del 1 - 4
                int valorDado = r.nextInt(4)+1;
               //se intancia nuestra clase que nos proporcionara el estado
                EstadoConcreto estado = new EstadoConcreto();
                estado.EjecutarEstado(valorDado,imagen,Display.this);
            }
        });

    }
}

