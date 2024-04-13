package it.gestoreattivita.bff.util.mock;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class MockDataService {

    private final ObjectMapper objectMapper;

    @Value("${bff.mockData.mockDataPath}")
    private String mockDataPath;

    @Autowired
    public MockDataService(){
        objectMapper = new ObjectMapper();
    }

    public <T> T serialize(String jsonFile,Class<T> cls){
        File file = new File(mockDataPath.concat(jsonFile));
        T element = null;
        try {
            element = objectMapper.readValue(file,cls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return element;
    }

    public <T> List<T> serializeList(String jsonFile){
        File file = new File(mockDataPath.concat(jsonFile));
        try {
            return objectMapper.readValue(file, new TypeReference<List<T>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
