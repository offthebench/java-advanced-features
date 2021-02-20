package QuestionFour.entity;

import QuestionFour.constants.VehicleType;

abstract public class Vehicle {
    protected VehicleType type;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
