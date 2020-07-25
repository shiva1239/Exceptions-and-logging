package org.example.interest;

public class Interest {
    private double principalAmount,rateOfInterest,timePeriod,amount;

    public Interest(double principalAmount, double rateOfInterest, double timePeriod)
    {
        this.principalAmount = principalAmount;
        this.rateOfInterest = rateOfInterest;
        this.timePeriod = timePeriod;
    }

    public double calculate_SI()
    {
        return (principalAmount*rateOfInterest*timePeriod)/100;
    }

    public double calculate_CI()
    {
        this.amount = principalAmount*(Math.pow(1+(rateOfInterest/100),timePeriod));
        return this.amount-principalAmount;
    }
}
