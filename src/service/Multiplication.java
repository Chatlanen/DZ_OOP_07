package service;

import data.ComplexNum;

public class Multiplication implements CalculatorInterface {

    @Override
    public ComplexNum calculate(ComplexNum num_a, ComplexNum num_b) {
        double realNum = num_a.getRealNum() * num_b.getRealNum() - num_a.getImagNum() * num_b.getImagNum();
        double imagNum = num_a.getRealNum() * num_b.getImagNum() + num_a.getImagNum() * num_b.getRealNum();
        return new ComplexNum(realNum, imagNum);
    }
}
