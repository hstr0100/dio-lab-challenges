package dio;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    public ParametrosInvalidosException(String mensagem, Throwable cause) {
        super(mensagem, cause);
    }
}
