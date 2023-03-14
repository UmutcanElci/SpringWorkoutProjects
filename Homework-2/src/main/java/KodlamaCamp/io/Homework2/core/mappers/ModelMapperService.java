package KodlamaCamp.io.Homework2.core.mappers;

import org.modelmapper.ModelMapper;


public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
