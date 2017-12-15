package Masco;

public class Mascota {

    private String nombre;
    private int vida;
    private boolean estavivo;

    public Mascota (){
        this.nombre = "blacky";
        this.vida = 100;
    }

    public Mascota (String nombre){
        this.nombre = nombre;
        this.vida = 100;
    }
    public void alimentar () {
        this.vida =  this.vida + 10;

    }

    public void golpear () {
        this.vida -= 10;

    }
    public void revivir (){
        vida = 100;

    }
    public void estado (){
        String estado;
       
        if (estavivo){
            estado = "Vivo";

        }else {
            estado = "Muerto";

        }

        System.out.println(nombre + " - " + estado + " - " + vida+"%");

    }
    public boolean estavivo (){

        return vida > 0;
    }

}
