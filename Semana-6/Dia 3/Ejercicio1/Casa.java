import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public int contarHabitaciones() {
        return habitaciones.size();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

}