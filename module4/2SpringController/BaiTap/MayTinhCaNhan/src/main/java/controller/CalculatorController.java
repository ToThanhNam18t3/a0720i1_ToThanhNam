package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/cal")
    public String getView() {
        return "Calculator";
    }

    @RequestMapping(value = "/Calculator")
    public String calculator(@RequestParam(value = "value1") float value1,
                             @RequestParam(value = "value2") float value2,
                             @RequestParam(value = "math") String math, Model model) {
        float result = 0;
        if (math.equals("Addition ( + )")) {
            result = value1 + value2;
            model.addAttribute("result", result);
        } else if (math.equals("Subtraction ( - )")) {
            result = value1 - value2;
            model.addAttribute("result", result);
        } else if (math.equals("Multiple ( * )")) {
            result = value1 * value2;
            model.addAttribute("result", result);
        } else if (math.equals("Division ( / )")) {
            if (value2 == 0) {
                model.addAttribute("result", "divide by Zero");
            } else {
                model.addAttribute("result", result);
            }
        }

        return "Calculator";
    }
}
