package data;

public class ComplexNum {
    private double realNum;
    private double imagNum;

    public ComplexNum(double realNum, double imagNum) {
        this.realNum = realNum;
        this.imagNum = imagNum;
    }

    /**
     * @return get Imag Number
     */
    public double getImagNum() {
        return imagNum;
    }

    public double getRealNum() {
        return realNum;
    }

    @Override
    public String toString() {
        return realNum + " " + imagNum + "i";
    }

    // public ComplexNum addition(ComplexNum input) {
    //     double realNum = this.realNum + input.realNum;
    //     double imagNum = this.imagNum + input.imagNum;
    //     return new ComplexNum(realNum, imagNum);
    // }


    // public ComplexNum multiplication(ComplexNum input) {
    //     double realNum = this.realNum * input.realNum - this.imagNum * input.imagNum;
    //     double imagNum = this.realNum * input.imagNum + this.imagNum * input.realNum;
    //     return new ComplexNum(realNum, imagNum);
    // }


    // public ComplexNum division(ComplexNum input) {
    //     double dividor = input.realNum * input.realNum + input.imagNum * input.imagNum;
    //     double realNum = (this.realNum * input.realNum + this.imagNum * input.imagNum) / dividor;
    //     double imagNum = (this.imagNum * input.realNum - this.realNum * input.imagNum) / dividor;
    //     return new ComplexNum(realNum, imagNum);
    // }
}