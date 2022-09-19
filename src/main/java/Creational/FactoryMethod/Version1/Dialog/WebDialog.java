package Creational.FactoryMethod.Version1.Dialog;

import Creational.FactoryMethod.Version1.Button.IButton;
import Creational.FactoryMethod.Version1.Button.WebButton;

public class WebDialog implements IDialog{
    @Override
    public IButton createButton() {
        return new WebButton();
    }
}
