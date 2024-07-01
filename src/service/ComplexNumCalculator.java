package service;

import data.ComplexNum;

public class ComplexNumCalculator {

    private LoggerInterface logs;

    public ComplexNumCalculator(LoggerInterface logs){
        this.logs = logs;
    }

    
    public ComplexNum Сalculate (CalculatorInterface calc, ComplexNum num_a, ComplexNum num_b){
        ComplexNum res = (ComplexNum) calc.calculate(num_a, num_b);
        logs.writeLog("Результат " + calc.getClass().getName() + ": " + res);
        return res;
    }


    // @Override
    // public ComplexNum addition(ComplexNum num_a, ComplexNum num_b) {
    //     ComplexNum res = num_a.addition(num_b);
    //     logs.writeLog("Результат сложения: " + res);
    //     return res;
    // }

    // @Override
    // public ComplexNum multiplication(ComplexNum num_a, ComplexNum num_b) {
    //     ComplexNum res = num_a.multiplication(num_b);
    //     logs.writeLog("Результат умножения: " + res);
    //     return res;
    // }

    // @Override
    // public ComplexNum division(ComplexNum num_a, ComplexNum num_b) {
    //     ComplexNum res = num_a.division(num_b);
    //     logs.writeLog("Результат деления: " + res);
    //     return res;
    // }


}
