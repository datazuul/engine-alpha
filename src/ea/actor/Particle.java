/*
 * Engine Alpha ist eine anfängerorientierte 2D-Gaming Engine.
 *
 * Copyright (c) 2011 - 2018 Michael Andonie and contributors.
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

package ea.actor;

import ea.FrameUpdateListener;
import ea.handle.BodyType;
import ea.internal.annotations.API;

import java.awt.Color;

@API
public class Particle extends Circle implements FrameUpdateListener {
    private static final float MAX_ALPHA = 255f;

    private int life;
    private int age = 0;

    /**
     * Konstruktor.
     *
     * @param diameter Durchmesser des Kreises
     */
    public Particle(float diameter, int life) {
        super(diameter);

        this.setBodyType(BodyType.PARTICLE);
        this.life = life;

        addMountListener(e -> getLayer().addFrameUpdateListener(this));
        addUnmountListener(e -> getLayer().removeFrameUpdateListener(this));
    }

    @Override
    public void onFrameUpdate(float frameDuration) {
        this.age += frameDuration;

        Color color = getColor();

        int alpha = (int) (MAX_ALPHA * getRemainingLifetime() / life);
        this.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha));

        if (isDead()) {
            remove();
        }
    }

    @API
    public boolean isDead() {
        return getRemainingLifetime() == 0;
    }

    @API
    public int getRemainingLifetime() {
        return Math.max(0, this.life - this.age);
    }
}
