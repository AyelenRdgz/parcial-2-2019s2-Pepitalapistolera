package ar.edu.unahur.obj2.ejercicio1;

public class PaquetePatagonia implements Paquete {


    public void getItinerario() {
        print("Nombre: Paquete Patagonia");
        print("Transporte Ida: Traslado desde el aeropuerto de El calafate al hotel Huemul");
        print("Dia 1: Visita ciudad Calafate");
        print("Dia 2: Visita Glaciar Perito Moreno");
        print("Dia 3: Naveción Glaciares");
        print("Transporte Vuelta: Traslado del hotel Huemul al aeropuerto de El Calafate ");
    }

    @Override
    public void imprimir() {
        getItinerario();
    }

    private void print(String texto) {
        System.out.println(texto);
    }
}
