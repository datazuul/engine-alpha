# Engine Alpha [![Travis Build](https://api.travis-ci.org/engine-alpha/engine-alpha.png?branch=master)](https://travis-ci.org/engine-alpha/engine-alpha)

Eine anfängerorientierte 2D-Gaming-Engine in deutscher Sprache. Ihr Hauptzweck ist es, Begeisterung für Programmierung und Informatik durch schnelle, sichtbare und starke Erfolge zu entwickeln.

## Grundlegendes Beispiel

```java
import ea.*;

public class Sample extends Game {
	public static void main(String[] args) {
		new Sample();
	}
	
	private Rechteck box;
	
	public Sample() {
		super(400, 400);
		
		box = new Rechteck(175, 175, 50, 50);
		box.farbeSetzen("rot");
		
		wurzel.add(box);
	}
	
	@Override
	public void tasteReagieren(int code) {
		switch(code) {
			case 26: box.verschieben(+0, -10); break;
			case 27: box.verschieben(+10, +0); break;
			case 28: box.verschieben(+0, +10); break;
			case 29: box.verschieben(-10, +0); break;
		}
	}
}
```

## Version 4

### Was ist neu oder anders?

* Umstieg auf [JBox2d](http://www.jbox2d.org/) als zugrundeliegender 2D Engine
* Koordinatensystem:
  * Das Koordinatensystem hat seinen Nullpunkt (x=0, y=0) nicht mehr in der linken oberen Ecke, sondern in der Mitte des Spielefensters
  * Mit der Position eines Objekts, z.B. `rectangle.setPosition(-150, 0);`, wird die Position der linken unteren Ecke des Objekts gesetzt.

