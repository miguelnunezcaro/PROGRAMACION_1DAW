package Examen;

import java.io.*;
import java.util.*;

public class SAE {

    private Map<String, Set<Trabajador>> mapaTrabajadores;
    private Map<Integer, Set<Oferta>> mapaOfertas;

    public SAE() {
        this.mapaTrabajadores = new HashMap<>();
        this.mapaOfertas = new HashMap<>();
    }

    public Map<String, Set<Trabajador>> getMapaJugadores() {
        return mapaTrabajadores;
    }

    public Map<Integer, Set<Oferta>> getMapaOfertas() {
        return mapaOfertas;
    }

    public Set<Oferta> addOferta(Oferta oferta) {

        Integer clave = oferta.getcodigoOfert();

        if (!mapaOfertas.containsKey(clave)) {
            mapaOfertas.put(clave, (Set<Oferta>) oferta);
        }
        return mapaOfertas.remove(oferta);
    }

    public boolean addTrabajador(Integer codigoOfert, Trabajador trabajador) {
        String clave = trabajador.getDni();

        if (!mapaTrabajadores.containsKey(clave)) {
            mapaTrabajadores.put(clave, (Set<Trabajador>) trabajador);
        }

        mapaTrabajadores.get(clave).add(trabajador);
        return true;
    }

    public boolean removeTrabajador(Integer codigoOfert, Trabajador trabajador){
        String clave = trabajador.getDni();

        if (mapaTrabajadores.containsKey(clave)){
            mapaTrabajadores.remove(clave, trabajador);
            return true;
        }
        return false;
    }
    public void mostrarTrabajadores(Integer codigo) {
        ArrayList<Trabajador> lista = new ArrayList<>();
        Collection<Set<Trabajador>> saco = mapaTrabajadores.values();
        Iterator<Set<Trabajador>> it = saco.iterator();
        while (it.hasNext()) {
            lista.addAll((Set<Trabajador>) it.next());
            Collections.sort(lista, new Comparator<Trabajador>() {
                @Override
                public int compare(Trabajador trabajador1, Trabajador trabajador2) {
                    if (trabajador1.getApellidos().equals(trabajador2.getApellidos())) {
                        trabajador1.getNombre().compareTo(trabajador2.getNombre());
                    }
                    return trabajador1.getApellidos().compareTo(trabajador2.getApellidos());
                }
            });
            System.out.println(lista);
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo) {
        ArrayList<Trabajador> lista = new ArrayList<>();
        Collection<Set<Trabajador>> saco = mapaTrabajadores.values();
        Iterator<Set<Trabajador>> it = saco.iterator();
        while (it.hasNext()) {
            lista.addAll((Set<Trabajador>) it.next());
            Collections.sort(lista, new Comparator<Trabajador>() {
                @Override
                public int compare(Trabajador trabajador1, Trabajador trabajador2) {
                    if (Objects.equals(trabajador1.getEdad(), trabajador2.getEdad())) {
                        trabajador1.getNombre().compareTo(trabajador2.getNombre());
                    }
                    return trabajador1.getEdad().compareTo(trabajador2.getEdad());
                }
            });
            System.out.println(lista);
        }
    }

//    public int cantidadOfertas(String dni){
//
//    }
    public void mostrarOfertas() {
        System.out.println(mapaOfertas);
    }

    public void guardarDatos() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));

            Collection<Set<Trabajador>> lista = mapaTrabajadores.values();
            for (Set<Trabajador> a : lista) {
                oos.writeObject(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void cargarDatos() {
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {
                Trabajador t = (Trabajador) ois.readObject();
                mapaTrabajadores.put(t.getNombre(), (Set<Trabajador>) t);
            }
        } catch (IOException e) {
            //e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
