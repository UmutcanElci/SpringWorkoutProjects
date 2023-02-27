package kodlama.io.rentApp.core.utilities.mappers;

import org.modelmapper.ModelMapper;
//Core ya da Common iki adda kullanılır
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
