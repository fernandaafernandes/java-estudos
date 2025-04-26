import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) {
       // info
        String nomeCliente, agencia;
        int numero;
        double saldo;

        //entrada de dados nome e agencia
        nomeCliente = JOptionPane.showInputDialog(null, "Por favor, digite seu nome:");
        agencia = JOptionPane.showInputDialog(null, "Por favor, digite o número da Agência:");
        
        //entrada de dados conta e o saldo
        String numeroStr = JOptionPane.showInputDialog(null, "Por favor, digite o número da Conta:");
        numero = Integer.parseInt(numeroStr); 
        
        String saldoStr = JOptionPane.showInputDialog(null, "Por favor, digite o saldo da Conta:");
        saldo = Double.parseDouble(saldoStr);  

        
        mostrarStatusConta(nomeCliente, agencia, numero, saldo);
    }

    
    public static void mostrarStatusConta(String nomeCliente, String agencia, int numero, double saldo) {
        
        JOptionPane.showMessageDialog(null, 
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n"
            + "Sua agência é: " + agencia + ", conta número: " + numero + "\n"
            + "Seu saldo disponível para saque é: R$ " + saldo);
    }
}
