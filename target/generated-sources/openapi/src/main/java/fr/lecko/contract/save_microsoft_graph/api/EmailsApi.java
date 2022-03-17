/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.lecko.contract.save_microsoft_graph.api;

import fr.lecko.contract.save_microsoft_graph.dto.Email;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-17T21:01:10.124+01:00[Europe/Paris]")
@Validated
@Api(value = "emails", description = "the emails API")
public interface EmailsApi {

    default EmailsApiDelegate getDelegate() {
        return new EmailsApiDelegate() {};
    }

    /**
     * GET /emails : get emails
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "get emails", nickname = "getEmails", notes = "", response = Email.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Email.class, responseContainer = "List") })
    @GetMapping(
        value = "/emails",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Email>> getEmails() {
        return getDelegate().getEmails();
    }

}
