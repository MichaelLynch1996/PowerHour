package mike.ibrahim.artifact;

import default_user.openapi.DefaultApi;
import default_user.openapi.model.DefaultUserResponse;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController implements DefaultApi {

    @Override
    public ResponseEntity<DefaultUserResponse> defaultUserGet(@ApiParam(value = "The content type." ,required=true, allowableValues="application/json", defaultValue="application/json") @RequestHeader(value="Content-Type", required=true) String contentType) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/main")
    public String main(){
        return "main";
    }

}
