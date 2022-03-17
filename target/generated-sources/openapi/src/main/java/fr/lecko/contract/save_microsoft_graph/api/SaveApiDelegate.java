package fr.lecko.contract.save_microsoft_graph.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link SaveApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-17T21:01:10.124+01:00[Europe/Paris]")
public interface SaveApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /save : save
     *
     * @return successful operation (status code 200)
     * @see SaveApi#save
     */
    default ResponseEntity<Void> save() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
