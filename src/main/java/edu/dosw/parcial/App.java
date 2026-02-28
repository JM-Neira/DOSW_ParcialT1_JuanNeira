import java.util.Date;

public abstract class Event {
    private String titulo;

    public Event(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void displayDetails();
}

public class EventoTaller extends Event {
    public EventoTaller(String titulo, Date fechaInicio, int duracion, int cupoMaximo,String materialPrevio) {
        super(titulo);
    }

    public String getMaterialPrevio(){
        return materialPrevio
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    

    @Override
    public void displayDetails() {
        System.out.println("Evento Taller: " + getTitulo() +
                "\nFecha de Inicio: " + getFechaInicio() +
                "\nDuración: " + getDuracion() + " horas" +
                "\nCupo Máximo: " + getCupoMaximo() +
                "\nRequiere material previo: " + getMaterialPrevio());
    }
}

public class EventoConferencia extends Event {
    public EventoConferencia(String titulo, Date fechaInicio, int duracion, int cupoMaximo, String creator) {
        super(titulo, fechaInicio, duracion, cupoMaximo, creator);
    }

    public String getCreator() {
        return creator;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    @Override
    public void displayDetails() {
        System.out.println("Evento Conferencia: " + getTitulo() +
                "\nFecha de Inicio: " + getFechaInicio() +
                "\nDuración: " + getDuracion() + " horas" +
                "\nCupo Máximo: " + getCupoMaximo() +
                "\nCreador: " + getCreator());
    }
}

public class EventoHackathon extends Event {
    public EventoHackathon(String titulo, Date fechaLimite) {
        super(titulo);
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Evento Hackathon: " + getTitulo() +
                "\nFecha Limite de inscripcion: " + getFechaLimite());
    }
}