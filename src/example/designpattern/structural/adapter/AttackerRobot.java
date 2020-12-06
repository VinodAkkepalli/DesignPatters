package example.designpattern.structural.adapter;

/*
  <b>Description</b> :
  This is the Adaptee.
  The Adapter sends method calls to objects that use the IEnemyAttacker interface
  to the right methods defined in AttackerRobot

  @author Vinod Akkepalli
 */

import java.util.Random;

public class AttackerRobot {

    Random generator = new Random();

    public void smashWithHands() {

        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Attacker Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward() {

        int movement = generator.nextInt(5) + 1;

        System.out.println("Attacker Robot Walks Forward " + movement + " spaces");

    }

    public void reactToHuman(String driverName) {

        System.out.println("Attacker Robot Tramps on " + driverName);

    }



}