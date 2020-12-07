package example.designpattern.behavioral.state.pattern;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class TVContext implements IState {

    private IState tvState;

    public void setState(IState state) {
        this.tvState=state;
    }

    public IState getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}



