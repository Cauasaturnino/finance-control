import model.Conta;
import java.math.BigDecimal;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta (1L,
                "Minha conta",
                "Centro",
                "1234");

        conta.depositar(new BigDecimal("500.00"));
        conta.sacar(new BigDecimal("100.00"));

        System.out.print("Saldo Atual: " +conta.getSaldo());

    }

}
