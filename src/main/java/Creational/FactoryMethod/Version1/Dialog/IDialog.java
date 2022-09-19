package Creational.FactoryMethod.Version1.Dialog;

import Creational.FactoryMethod.Version1.Button.IButton;

public interface IDialog {
    public IButton createButton();
}
