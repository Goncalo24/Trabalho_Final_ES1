import java.time.LocalDate;

public class ClienteEncomendaTransportadora extends ClienteEncomenda{
    Transportadora transportadora;
    LocalDate data;
    String LinkTracking;

    public ClienteEncomendaTransportadora(Transportadora transportadora, LocalDate data, String linkTracking) {
        this.transportadora = transportadora;
        this.data = data;
        LinkTracking = linkTracking;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLinkTracking() {
        return LinkTracking;
    }

    public void setLinkTracking(String linkTracking) {
        LinkTracking = linkTracking;
    }
}
