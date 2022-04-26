package Examen;

public class Main {

    public static void main(String[] args) {
        SAE sae = new SAE();
        Oferta oferta1 = new Oferta(1,"Buena",true);
        Oferta oferta2 = new Oferta(2,"Mala",false);
        Oferta oferta3 = new Oferta(3,"Regular",false);
        Oferta oferta4 = new Oferta(4,"Decente",true);
        Oferta oferta5 = new Oferta(5,"Mala",false);
        Oferta oferta6 = new Oferta(6,"Buena",true);

        Trabajador trabajador1 = new Trabajador("1","Manuel","Pérez Caro",
                18,"ESO");
        Trabajador trabajador2 = new Trabajador("2","Manolo","Barcia Caro",
                18,"Ingeniería");
        Trabajador trabajador3 = new Trabajador("3","Iván","Negrón Caro",
                18,"ESO y Bachillerato");
        Trabajador trabajador4 = new Trabajador("4","Peter","Cech Castro",
                18,"Ninguno");
        Trabajador trabajador5 = new Trabajador("5","Rogelio","Díaz do Nascimiento",
                18,"ESO");
        Trabajador trabajador6 = new Trabajador("6","María","De la O",
                18,"Ciclo Superior");
        Trabajador trabajador7 = new Trabajador("7","María","Fernández Jimenez",
                18,"ESO y Bachillerato");
        Trabajador trabajador8 = new Trabajador("8","Mari","García Feis",
                18,"ESO");
        Trabajador trabajador9 = new Trabajador("9","Manuel","López García",
                18,"Ciclo Superior");
        Trabajador trabajador10 = new Trabajador("10","Miguel","Pérez Alaván",
                18,"ESO");



        sae.mostrarOfertas();
        sae.cargarDatos();
        sae.guardarDatos();
        sae.addTrabajador(1,trabajador1);
        sae.removeTrabajador(1,trabajador1);
        sae.mostrarTrabajadores(1);
        sae.mostrarTrabajadoresXEdad(1);
        sae.addOferta(oferta1);

    }
}
