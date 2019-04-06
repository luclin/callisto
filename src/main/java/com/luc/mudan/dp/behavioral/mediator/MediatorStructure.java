package com.luc.mudan.dp.behavioral.mediator;

/**
 * @author : luc
 * @date : 2019-04-06 16:00
 * Description:
 */
public class MediatorStructure extends Mediator {
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if(person == houseOwner){          //如果是房主，则租房者获得信息
            tenant.getMsg(message);
        }
        else{       //反正则是房主获得信息
            houseOwner.getMsg(message);
        }
    }

}
