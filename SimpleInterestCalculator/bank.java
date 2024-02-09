package SimpleInterestCalculator;

abstract class bank {

    abstract double calculateInterest(double amount, int month);
}


class SBI extends bank {
    @Override
    double calculateInterest(double amount, int month){

        return (6.3/100) * amount* month;
    }

}

class HDFC extends bank {
    @Override
    double calculateInterest(double amount,int month){

        return (7.3/100) * amount* month;
    }

}

