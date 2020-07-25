package org.example.homecost;

public class EstimateHomeCost {
    private int materialType;
    private double areaOfHouse;
    private boolean isAutomated;
    private double estimateCost;
    public EstimateHomeCost(int materialType,double areaOfHouse,boolean isAutomated){
        this.materialType = materialType;
        this.areaOfHouse = areaOfHouse;
        this.isAutomated = isAutomated;
        switch(this.materialType){
            case 0: this.estimateCost = 1200;
                    break;
            case 1: this.estimateCost = 1500;
                    break;
            case 2: this.estimateCost = 1800;
                    break;
        }
        if(this.isAutomated){
            this.estimateCost += 700;
        }
    }
    public double Estimate(){
        return this.estimateCost * this.areaOfHouse;
    }
}
