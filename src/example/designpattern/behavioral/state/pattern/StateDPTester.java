package example.designpattern.behavioral.state.pattern;

import example.designpattern.behavioral.state.pattern.states.TVStartState;
import example.designpattern.behavioral.state.pattern.states.TVStopState;

/**
 * <b>Description</b> :
 *
 * Output of above program is same as the basic implementation of TV Remote without using state pattern.
 *
 * State Design Pattern Benefits
 * The benefits of using State pattern to implement polymorphic behavior is clearly visible.
 * The chances of error are less and it’s very easy to add more states for additional behavior.
 * Thus making our code more robust, easily maintainable and flexible.
 * Also State pattern helped in avoiding if-else or switch-case conditional logic in this scenario.
 *
 * State Pattern is very similar to Strategy Pattern
 *
 * https://www.journaldev.com/1751/state-design-pattern-java
 * https://www.youtube.com/watch?v=MGEx35FjBuo
 *
 * @author Vinod Akkepalli
 */
public class StateDPTester {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        IState tvStartState = new TVStartState();
        IState tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();

    }

}
