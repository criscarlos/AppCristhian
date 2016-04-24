package mx.edu.utng.appcristhian;

import android.content.Context;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ACER on 18/04/2016.
 */
public class EstadoConcreto implements Estado {
    //implementamos la clase de la interface Estado y la manipulamos de tal forma
    //que le pasamos los parametros necesarios para realizar la condición del estado del semaforo
    @Override
    public void EjecutarEstado(int estadoId, ImageView img, Context c) {
        //de acuerdo a estadoId que se recibe como parametro de seleciona el case del switch
        switch (estadoId) {
            case 1:
                //se le pasa a nuestro ImageView que se recibe como parametro,
                // la imagen que le corresponde(imagen previamente agregada a la carpeta drawable)
                img.setImageResource(R.drawable.amarillo_sema);
                //se manda el mensaje de acuerdo al estado
                Toast.makeText(c, "PRECAUCIÓN", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                //se le pasa a nuestro ImageView que se recibe como parametro,
                // la imagen que le corresponde(imagen previamente agregada a la carpeta drawable)
                img.setImageResource(R.drawable.verde_sema);
                //se manda el mensaje de acuerdo al estado
                Toast.makeText(c, "AVANZAR", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                //se le pasa a nuestro ImageView que se recibe como parametro,
                // la imagen que le corresponde(imagen previamente agregada a la carpeta drawable)
                img.setImageResource(R.drawable.rojo_sema);
                //se manda el mensaje de acuerdo al estado
                Toast.makeText(c, "DETENERSE", Toast.LENGTH_SHORT).show();
                break;
            default:
                //se le pasa a nuestro ImageView que se recibe como parametro,
                // la imagen que le corresponde(imagen previamente agregada a la carpeta drawable)
                img.setImageResource(R.drawable.sema_fuera);
                //se manda el mensaje de acuerdo al estado
                Toast.makeText(c, "SEMAFORO FUERA DE SERVICIO", Toast.LENGTH_SHORT).show();
        }
    }

}
