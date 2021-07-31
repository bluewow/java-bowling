package bowling.domain.state;

import bowling.domain.pin.DownedPins;

public class Miss extends State {
    private final DownedPins firstDownedPins;
    private final DownedPins secondDownedPins;

    private Miss(DownedPins firstDownedPins, DownedPins secondDownedPins) {
        this.firstDownedPins = firstDownedPins;
        this.secondDownedPins = secondDownedPins;
    }

    public static State of(DownedPins firstDownedPins, DownedPins secondDownedPins) {
        return new Miss(firstDownedPins, secondDownedPins);
    }

    @Override
    protected State nextState(DownedPins downedPins) {
        return null;
    }
}
