package fr.lecko.contract.save_microsoft_graph.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-17T21:01:10.124+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.swagger.base-path:}")
public class EmailsApiController implements EmailsApi {

    private final EmailsApiDelegate delegate;

    public EmailsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) EmailsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EmailsApiDelegate() {});
    }

    @Override
    public EmailsApiDelegate getDelegate() {
        return delegate;
    }

}
