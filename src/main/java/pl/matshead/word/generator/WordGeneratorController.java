package pl.matshead.word.generator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WordGeneratorController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/result")
    public String getResult(ModelMap modelMap, @RequestParam String category, @RequestParam Integer amount) {
        modelMap.put("result", WordGenerator.defineWordsLength(category, amount));
        return "result";
    }
}
