/*
 * Engine Alpha ist eine anfängerorientierte 2D-Gaming Engine.
 *
 * Copyright (c) 2011 - 2014 Michael Andonie and contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package ea.raum;

import ea.Punkt;

import java.awt.*;

/**
 * Ein Objekt, das aus n primitiven Geometrischen Formen - <b>Dreiecken</b> - besteht.
 *
 * @author Michael Andonie
 */
public abstract class Geometrie extends Raum {
    /**
     * Die Farbe dieses Geometrie-Objekts.
     */
    private Color color;

    /**
     * Konstruktor.
     *
     * @param position Die Ausgangsposition dieses Geometrie-Objekts.
     */
    public Geometrie(Punkt position) {
        this.position.set(position);
    }

    /**
     * Setzt ganzheitlich die Farbe aller Formen auf eine bestimmte Farbe.<br /> Dadurch färbt
     * sich im Endeffekt das ganze Objekt neu ein.
     *
     * @param color Die neue Farbe.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Gibt die Farbe aus.
     *
     * @return Die Farbe des Objekts.
     */
    public Color getColor() {
        return color;
    }
}
