package com.example.semana2mediator.encapsulaciones;


public class TankUnit implements ArmedUnit{
    private Commander commander;
    public TankUnit(Commander commander){
        this.commander=commander;
    }
    public void  attack()
    {
        if(commander.canAttack())
        {
            System.out.println("TankUnit: Attacking.....");
            commander.setAttackStatus(false);
        }
        else{
            System.out.println("TankUnit: Cannot attack now. Other units attacking....");
        }
    }
    public void  stopAttack(){
        System.out.println("TankUnit: Stopped attacking.....");
        commander.setAttackStatus(true);
    }
}
