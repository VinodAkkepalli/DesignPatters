package example.designpattern.structural.adapter;

/**
 * <b>Description</b> :
 * Adapter pattern driver class
 *
 * @author Vinod Akkepalli
 */

public class TestEnemyAttackers{

    public static void main(String[] args){

        AttackerTank rx7Tank = new AttackerTank();

        AttackerRobot fredTheRobot = new AttackerRobot();

        IEnemyAttacker robotAdapter = new AttackerRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}