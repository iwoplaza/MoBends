package net.gobbob.mobends.standard.client.mutators;

import java.util.function.Function;

import net.gobbob.mobends.standard.data.ZombieData;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.monster.EntityZombie;

/**
 * This base is used both by ZombieMutator and ZombieVillagerMutator, but since
 * the ModelZombieVillager doesn't extend ModelZombie, a seperate base class had
 * to be made.
 * 
 * @author Iwo Plaza
 *
 * @param <D>
 * @param <E>
 * @param <M>
 */
public abstract class ZombieMutatorBase<D extends ZombieData<D, E>,
										E extends EntityZombie,
										M extends ModelBiped>
									   extends BipedMutator<D, E, M>
{

	// Should the height of the texture be 64 or 32(half)?
	protected boolean halfTexture = false;
	
	public ZombieMutatorBase(Function<E, D> dataCreationFunction)
	{
		super(dataCreationFunction);
	}
	
	@Override
	public void fetchFields(RenderLivingBase<? extends E> renderer)
	{
		super.fetchFields(renderer);

		if (renderer.getMainModel() instanceof ModelZombie)
		{
			ModelZombie model = (ModelZombie) renderer.getMainModel();
			
			this.halfTexture = model.textureHeight == 32;
		}
	}
}
