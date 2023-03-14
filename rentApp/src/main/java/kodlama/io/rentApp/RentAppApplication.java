package kodlama.io.rentApp;

import kodlama.io.rentApp.core.utilities.exception.BusinessException;
import kodlama.io.rentApp.core.utilities.exception.ProblamDetails;
import kodlama.io.rentApp.core.utilities.exception.ValidationProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@SpringBootApplication
@RestControllerAdvice//Bütün Controllerlar bu exception handler a tabii
public class RentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentAppApplication.class, args);
	}

	@ExceptionHandler//Eğer uygulamamızda bir hata oluşursa burdan geçceğini ya da buraya uğrayacağını bilecek
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ProblamDetails handleBusinessException(BusinessException businessException){//Uygulamaızda bir hata oluştu ve hata mesajı dönücez peki bu hata mesajını neye göre dönücez BusinessException a göre
		//Hangi hataya göre handle edileceğini verdik
		ProblamDetails problamDetails = new ProblamDetails();
		problamDetails.setMessage(businessException.getMessage());

		return problamDetails;
	}

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)//AOP teknikleri!
	public ValidationProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException){
		ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
		validationProblemDetails.setMessage("VALIDATION EXCEPTION");
		validationProblemDetails.setValidationErrors(new HashMap<>());//Şimdi evet biz bir hata alıyoruz ayrı bir şekilde methodArgumentNotValid diye tabi biz bunu kontrol etmek istiyoruz
		//Tabi bize istiypruz ki neden hatayı niye alıyoruz onun için de FieldError sınıfını kullanıcaz

		for (FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()){
			validationProblemDetails.getValidationErrors().put(fieldError.getField(),fieldError.getDefaultMessage());
		}
	    return validationProblemDetails;
	}



	@Bean//Bu bir nesne ihtiyaç duyulacak diye spring bunu uygulamamızın içine ekler
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
