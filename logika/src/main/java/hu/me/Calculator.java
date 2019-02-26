package hu.me;

class Calculator {
    private String muvelet = null;
    private double[] operandusok = {0, 0};

//    public Calculator(String muvelet, double[] operandusok) {
//        this.muvelet = muvelet;
//        this.operandusok = operandusok;
//    }

    String getMuvelet() {
        return this.muvelet;
    }

    void setMuvelet(String muvelet) {
        this.muvelet = muvelet;
    }

    double[] getOperandusok() {
        return this.operandusok;
    }

    void setOperandusok(double[] operandusok) {
        this.operandusok = operandusok;
    }

//    double osszeadas(double[] operandusok){
//        return operandusok[0] + operandusok[1];
//    }
//    double kivonas(double[] operandusok){
//        return operandusok[0] - operandusok[1];
//    }
//    double szorzas(double[] operandusok){
//        return operandusok[0] * operandusok[1];
//    }
//    double osztas(double[] operandusok){
//        return operandusok[0] / operandusok[1];
//    }
}
