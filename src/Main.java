import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Tecnico tecnico = new Tecnico();
        FakeTecnico fake = new FakeTecnico();

        String login = JOptionPane.showInputDialog("Digite o login do tecnico");

        if(login.equals(fake.getLogin())){
            JOptionPane.showMessageDialog(null, "Tecnico ja esta cadastrado.");
        }else {
            tecnico.setNome(JOptionPane.showInputDialog("Digite o Nome do tecnico"));
            tecnico.setCargo(JOptionPane.showInputDialog("Digite o Cargo do tecnico"));
            tecnico.setTelefone(JOptionPane.showInputDialog("Digite o Telefone do tecnico"));
            tecnico.setHorarioTrabalho(JOptionPane.showInputDialog("Digite o Horario do tecnico"));
            tecnico.setLogin(login);
            JOptionPane.showMessageDialog(null, tecnico);
        }

    }

}
