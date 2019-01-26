package net.gobbob.mobends.core.math.physics;

import net.gobbob.mobends.core.math.vector.IVec3fRead;
import net.gobbob.mobends.core.math.vector.Vec3fReadonly;

public class AABBox
{
	
	public final Vec3fReadonly min;
	public final Vec3fReadonly max;
	
	public AABBox(IVec3fRead min, IVec3fRead max)
	{
		this.min = new Vec3fReadonly(min);
		this.max = new Vec3fReadonly(max);
	}
	
	public AABBox(float x0, float y0, float z0, float x1, float y1, float z1)
	{
		this.min = new Vec3fReadonly(x0, y0, z0);
		this.max = new Vec3fReadonly(z1, y1, z1);
	}
	
}
