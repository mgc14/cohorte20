package controller;
@Controller
@RequestMapping("/")

public class IndexController {

    @RequestMapping(value="2", method=RequestMethod.GET)
    public String getUserForm() {

        return "index";




    }









































}
