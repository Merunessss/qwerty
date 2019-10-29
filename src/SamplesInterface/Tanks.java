package SamplesInterface;

import java.time.LocalDateTime;

public class Tanks {
    public static void main(String[] args) {


    }


}

interface Shooting {

    void fire(ShellType shellType);
}

enum ShellType {
    AP(150), ACPR(170), HE(90), HEAT(220);
    int maxThicknessArmour;

    ShellType(int maxThicknessArmour) {
        this.maxThicknessArmour = maxThicknessArmour;
    }
}

class MediumTank extends Tank {


    @Override
    public void fire(ShellType shellType) {

    }
}

class TankDestroyer extends Tank {


    @Override
    public void fire(ShellType shellType) {

    }
}

class HeavyTank extends Tank  {


    @Override
    public void fire(ShellType shellType) {

    }
}

class LightTank extends Tank  {

    @Override
    public void fire(ShellType shellType) {

    }
}

class Infantry implements Shooting {

    @Override
    public void fire(ShellType shellType) {

    }
}

abstract class Tank implements  Shooting {

}

class Division {
    Tank[] tanks = new Tank[]{new LightTank(),new HeavyTank(), new TankDestroyer(), new MediumTank()};
    Infantry[] soldiers = new Infantry[]{new Infantry(), new Infantry()};

    void startAttack (LocalDateTime start,int time){
        for(int i = 0; i < time; i++){
            for(int j = 0; j < tanks.length; j++){
                tanks[j].fire(ShellType.HEAT);
            }
          for(int k = 0; k < soldiers.length; k++){
              soldiers[k].fire(ShellType.HE);
          }
        }

    }
}







