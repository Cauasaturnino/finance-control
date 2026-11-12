import model.Conta;
import java.math.BigDecimal;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta (1L,
                "Minha conta",
                "Centro",
                "1234");

        conta.depositar(new BigDecimal("400.00"));
        conta.depositar(new BigDecimal("50.00"));

        System.out.print(conta.getSaldo());

    }

}
