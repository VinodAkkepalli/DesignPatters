package example.designpattern.structural.adapter;

/**
 * <b>Description</b> :
 * The Adapter must provide an alternative action for the the methods that need to be used because
 * IEnemyAttacker was implemented.
 *
 * This adapter does this by containing an object of the same type as the Adaptee (AttackerRobot)
 * All calls to EnemyAttacker methods are sent instead to methods used by AttackerRobot
 *
 * @author Vinod Akkepalli
 */

public class AttackerRobotAdapter implements IEnemyAttacker {

    AttackerRobot theRobot;

    public AttackerRobotAdapter(AttackerRobot newRobot){

        theRobot = newRobot;

    }

    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    public void driveForward() {

        theRobot.walkForward();

    }

    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);

    }



}