package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.Man;

/**
 * Created by Надежда on 15.05.2017.
 */

@Controller
@RequestMapping("/demo")

public class ManController {

    @Autowired
    private ManRepository manRepository;

    @RequestMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam int N_man, @RequestParam int n_man) {
        Man n = new Man();
        n.setN_man(n_man);
        manRepository.save(n);
        return "Saved";
    }



}

