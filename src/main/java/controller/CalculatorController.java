package controller;

@RestController
public class CalculatorController {

    @RequestMapping("/calc/add/")
    public int add(@RequestParam int a,
                   @RequestParam int b){

        return a+b;
    }
}
