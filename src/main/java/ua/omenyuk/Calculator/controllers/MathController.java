package ua.omenyuk.Calculator.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin
@RequestMapping("/math/examples")
public class MathController {

    @GetMapping
    public List<String> getRandomNumbers(@RequestParam(value = "count") Integer count) {
        List<String> examples = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int operand1 = random.nextInt(100);
            int operand2 = random.nextInt(100);
            int operator = random.nextInt(4);

            switch (operator) {
                case 0:
                    examples.add(operand1 + " + " + operand2);
                    break;
                case 1:
                    examples.add(operand1 + " - " + operand2);
                    break;
                case 2:
                    examples.add(operand1 + " * " + operand2);
                    break;
                case 3:
                    examples.add(operand1 + " / " + operand2);
                    break;
            }
        }

        return examples;
    }
}



