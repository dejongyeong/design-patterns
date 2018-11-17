package com.dejong.delivery;

public abstract class ServicesDecorator implements IDelivery {

    protected IDelivery delivery;

    public ServicesDecorator(IDelivery delivery) {
        super();
        this.delivery = delivery;
    }
}
