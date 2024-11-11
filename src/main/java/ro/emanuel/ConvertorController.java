package ro.emanuel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertorController {


    @GetMapping("/convert")
    public ModelAndView convertCurrency(
            @RequestParam double suma,
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double rate) {

        double result;
        String currency;

        if ("RO".equals(from) && "EUR".equals(to)) {
            result = suma / rate;
            currency = "EURO";
        } else if ("EUR".equals(from) && "RON".equals(to)) {
            result = suma * rate;
            currency = "RON";
        } else {
            result = 0;
            currency = "Valoare invalidă";
        }

        ModelAndView mav = new ModelAndView("convert.jsp");
        mav.addObject("convertedSum", result);
        mav.addObject("currency", currency);

        return mav;
    }
}
