package tsi.ensg.jee.onlineshop;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Time;

public class DeliveryClassic extends Delivery{

    @Autowired
    private Time averageTime;

    public DeliveryClassic(String description){
        super(description);
    }

    public DeliveryClassic(String description, Time averageTime){
        super(description);
        this.averageTime = averageTime;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with a delay of " + averageTime.toString();
    }

}
