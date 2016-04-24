package mx.edu.utng.appcristhian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button)findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se obtiene el valor de la caja de texto de usuario
                EditText usuario = (EditText)findViewById(R.id.txtusuario);
                String usuarioVal = usuario.getText().toString();
                //se obtiene el valor de la caja de texto password
                EditText password = (EditText)findViewById(R.id.txtpassword);
                String passVal = password.getText().toString();

                //se realiza la instancia de nuestra clase Singledon
                LoginSingle single = LoginSingle.obtenerInstancia();
                //se compara que los valores predeterminado en la clase LoginSingle del usuario y password
                //sean igual a los valores que traen las cajas de texto
                if((single.getUsuario().equals(usuarioVal))&&
                        (single.getPassword()).equals(passVal)){
                          //creamos el intent para que una vez que sea correcta nuestra condición
                          //nos mande a el layout de Display (no olvidar dalo de alta en el AndroidManifest)
                          Intent mostraLayState = new Intent(MainActivity.this, mx.edu.utng.appcristhian.Display.class);
                          startActivity(mostraLayState);
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o Password Incorrecto \n FAVOR DE VERIFICAR", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}