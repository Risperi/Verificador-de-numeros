package Program;

public class ValidadorNumeroConta {

    private ValidadorNumeroConta() {
        // impede instanciação
    }

    public static void verificarNumeroConta(String numeroConta) {
        if (!numeroConta.matches("\\d{8}")) {
            throw new NumeroContaInvalidoException(
                "Numero de conta invalido. Digite exatamente 8 digitos."
            );
        }
    }
}
