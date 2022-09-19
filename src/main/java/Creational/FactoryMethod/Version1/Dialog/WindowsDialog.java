package Creational.FactoryMethod.Version1.Dialog;

import Creational.FactoryMethod.Version1.Button.IButton;
import Creational.FactoryMethod.Version1.Button.WindowsButton;

public class WindowsDialog implements IDialog{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }
}
