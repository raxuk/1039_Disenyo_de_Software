package Adapter;

import ASCII.AsciiArt;
import Drawings.StringArt;

public class StringArt2AsciiArt extends AsciiArt {
    StringArt stringArt;

    public StringArt2AsciiArt(StringArt stringArt) {
        this.stringArt = stringArt;
        this.lineas = stringArt.dibujo().split("\n");
        System.out.println("l");
    }
}
