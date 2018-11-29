package ThemePark.Interfaces;

import ThemePark.Visitor;

public interface ITicketed {

    public double defaultPrice();

    public double priceFor(Visitor visitor);
}
