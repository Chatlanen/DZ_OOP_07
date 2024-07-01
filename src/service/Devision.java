package service;

import data.ComplexNum;

public class Devision implements CalculatorInterface{

    @Override
    public ComplexNum calculate(ComplexNum num_a, ComplexNum num_b) {
        double dividor = num_b.getRealNum() * num_b.getRealNum() + num_b.getImagNum() * num_b.getImagNum();
        double realNum = (num_a.getRealNum() * num_b.getRealNum() + num_a.getImagNum() * num_b.getImagNum()) / dividor;
        double imagNum = (num_a.getImagNum() * num_b.getRealNum() - num_a.getRealNum() * num_b.getImagNum()) / dividor;
        return new ComplexNum(realNum, imagNum);
    }

}
