package fr.lecko.contract.save_microsoft_graph.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T13:35:20.160+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.swagger.base-path:}")
public class MailsApiController implements MailsApi {

    private final MailsApiDelegate delegate;

    public MailsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) MailsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MailsApiDelegate() {});
    }

    @Override
    public MailsApiDelegate getDelegate() {
        return delegate;
    }

}
