package tsi.ensg.jee.onlineshop;

import java.util.Set;

public class OnlineShop {

    private String name;
    private Set<Delivery> deliveryOptions;
    private Set<Insurance> insurances;

    public OnlineShop(String name,Set<Delivery> deliveryOptions,Set<Insurance> insurances){
        this.name = name;
        this.deliveryOptions = deliveryOptions;
        this.insurances = insurances;
    }

    public void setDeliveryOptions(Set<Delivery> deliveryOptions){
        this.deliveryOptions = deliveryOptions;
    }

    public void setInsurances(Set<Insurance> insurances){
        this.insurances = insurances;
    }

    public void printDescription(){
        System.out.println(name);
        System.out.println("Delivery options");
        deliveryOptions.forEach(opt -> System.out.println("\t"+opt.getDescription()));
        System.out.println("Insurance options");
        insurances.forEach(insurance -> System.out.println("\t"+insurance.getDescription()));
    }
}
