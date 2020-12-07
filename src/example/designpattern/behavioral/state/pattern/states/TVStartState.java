package example.designpattern.behavioral.state.pattern.states;

import example.designpattern.behavioral.state.pattern.IState;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */


public class TVStartState implements IState {

    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}
