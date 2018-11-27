package Controller;

import com.politicalAPI.Main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FecController {

    @RequestMapping("/fec/")
    public String testFecController(){
        return "This is the fec controller";
    }
}
