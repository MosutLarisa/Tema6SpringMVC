package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaptopsController {


    @GetMapping("/laptops")
    public ModelAndView displayBrandInfo(@RequestParam String brand) {
        int c = brand.length();
        String parity = (c % 2 == 0) ? "par" : "impar";

        ModelAndView mav = new ModelAndView("laptops.jsp");
        mav.addObject("name", brand);
        mav.addObject("count", c);
        mav.addObject("parity", parity);

        return mav;
    }
    
    @GetMapping("/laptop")
    public ModelAndView displayLaptopInfo() {
        Laptop laptop = new Laptop("Dell", 2500, 16);

        ModelAndView mav = new ModelAndView("laptop.jsp");
        mav.addObject("lap", laptop);

        return mav;
    }
}
