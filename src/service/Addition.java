package service;

import data.ComplexNum;

public class Addition implements CalculatorInterface {

    @Override
    public ComplexNum calculate(ComplexNum num_a, ComplexNum num_b) {
        double realNum = num_a.getRealNum() + num_b.getRealNum();
        double imagNum = num_a.getImagNum() + num_b.getImagNum();
        return new ComplexNum(realNum, imagNum);
    }
}
