package example.designpattern.structural.adapter;

/**
 * <b>Description</b> :
 * This is the Target Interface : This is what the client expects to work with.
 * It is the adapters job to make new classes compatible with this one.
 *
 * @author Vinod Akkepalli
 */

public interface IEnemyAttacker {

    void fireWeapon();

    void driveForward();

    void assignDriver(String driverName);

}