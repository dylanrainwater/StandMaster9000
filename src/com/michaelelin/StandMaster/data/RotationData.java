package com.michaelelin.StandMaster.data;

/**
 * A three-dimensional rotation representation.
 */
public final class RotationData implements StandMasterData {
    /**
     * The x value.
     */
    public final float x;
    /**
     * The y value.
     */
    public final float y;
    /**
     * The z value.
     */
    public final float z;

    /**
     * Constructs a RotationData object from the given x, y, and z values.
     * @param x the x value
     * @param y the y value
     * @param z the z value
     */
    public RotationData(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return Float.toString(x) + "," + Float.toString(y) + "," + Float.toString(z);
    }

}
