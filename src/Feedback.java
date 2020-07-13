public class Feedback {
    private String link;
    private Envio envio;
    private String avalicaoEncomenda;
    private String avalicaoTransportadora;

    public Feedback(String link, Envio envio, String avalicaoEncomenda, String avalicaoTransportadora) {
        this.link = link;
        this.envio = envio;
        this.avalicaoEncomenda = avalicaoEncomenda;
        this.avalicaoTransportadora = avalicaoTransportadora;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public String getAvalicaoEncomenda() {
        return avalicaoEncomenda;
    }

    public void setAvalicaoEncomenda(String avalicaoEncomenda) {
        this.avalicaoEncomenda = avalicaoEncomenda;
    }

    public String getAvalicaoTransportadora() {
        return avalicaoTransportadora;
    }

    public void setAvalicaoTransportadora(String avalicaoTransportadora) {
        this.avalicaoTransportadora = avalicaoTransportadora;
    }
}
