package service;

import data.ComplexNum;

public interface CalculatorInterface {
    // /**
    //  * @param num_a
    //  * @param num_b
    //  * @return Сложение комплексных чисел
    //  */
    // ComplexNum addition(ComplexNum num_a, ComplexNum num_b);

    // /**
    //  * @param num_a
    //  * @param num_b
    //  * @return Умножение комплексных чисел
    //  */
    // ComplexNum multiplication(ComplexNum num_a, ComplexNum num_b);
    
    // /**
    //  * @param num_a Делимое
    //  * @param num_b Делитель
    //  * @return Деление комплексных чисел
    //  */
    // ComplexNum division(ComplexNum num_a, ComplexNum num_b);

    ComplexNum calculate(ComplexNum num_a, ComplexNum num_b);
}
