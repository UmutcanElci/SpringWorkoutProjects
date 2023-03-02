package kodlama.io.rentApp.core.utilities.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String brandAlreadyExistsMessage) {
        super(brandAlreadyExistsMessage);
    }
}
