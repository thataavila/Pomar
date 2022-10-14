public class Tecnico {

    String nome;
    String cargo;
    String horarioTrabalho;
    String telefone;
    String login;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Tecnico cadastrado com sucesso:" + "\n" +
                "nome = " + nome + "\n" +
                "cargo = " + cargo + "\n" +
                "horarioTrabalho = " + horarioTrabalho + "\n" +
                "telefone = " + telefone + "\n" +
                "login = " + login + "\n";
    }
}
