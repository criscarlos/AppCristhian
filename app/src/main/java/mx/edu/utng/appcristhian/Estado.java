package mx.edu.utng.appcristhian;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ACER on 18/04/2016.
 * Se define la interface con el metodo abstracto para ser implementada
 */
public interface Estado {

    void EjecutarEstado(int i, ImageView txv, Context c);

}
