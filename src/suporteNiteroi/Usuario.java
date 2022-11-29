package suporteNiteroi;

public class Usuario {
    String cargo;
    String nome;
    String ip;
    String hostname;
    
    public Usuario(String cargo, String nome, String ip, String hostname) {
        this.cargo = cargo;
        this.nome = nome;
        this.ip = ip;
        this.hostname = hostname;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
}
