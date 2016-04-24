package mx.edu.utng.appcristhian;

/**
 * Created by ACER on 18/04/2016.
 * Clase del patron singledon que nos permite solo crear una instancia de la clase
 */
public class LoginSingle {

    //se crea la variable que obtendra la unica instancia de la clase
   public static LoginSingle login;
    //se crean nuestra variables de usurio y password con los valores predeterminados
    //que seran comparados en la clase MainActivity, de acuerdo a los valores que ingrese el usuario
   private String usuario = "Cristian_admin";
   private String password ="12345" ;


    //se crea el constructor privado para que no se pueda crea otra instancia de la clase
    private LoginSingle(){

    }

    //Creamos un método de tipo LoginSingle para obtener nuestra instancia y nos retornara la misma
    public static LoginSingle obtenerInstancia(){
        //se verifica que no haya una instancia ya creada, de lo contrario
        //se conserva crea.
        if(login == null){
            login = new LoginSingle();
        }
        return login;
    }


    //se generan los método accesores de nuestra variable para obtener los valores a comparar de usuario y pass
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
