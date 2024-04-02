package com.example.semana2mediator.encapsulaciones;

public class CommanderImpl implements Commander {
    ArmedUnit soldierUnit, tankUnit;
    boolean attackStatus = true;
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
    }
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
    }

    public boolean canAttack() {
        return attackStatus;
    }

    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}