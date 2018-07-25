package com.idtech.item;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;

public class BloodStaff extends QuickItem {
	{
		name = "Blood Staff";
		texture = "bloodstaff";
	}
	public void onRightClick(){
		BlockPos pos = findBlockAtCursor(1000);
		if(pos != null){
			BlockPos c = pos;
			double cx = pos.getX();
			double cy = pos.getY();
			double cz = pos.getZ();
			double ux = cx +2;
			double urx = cx +1;
			double urz = cz +1;
			double rz = cz +2;
			double drz = cz +1;
			double drx = cx -1;
			double dx = cx -2;
			double dlz = cz -1;
			double dlx = cx -1;
			double lz = cz -2;
			double ulz = cz -1;
			double ulx = cx +1;
			BlockPos u = new BlockPos(ux, cy, cz);
			BlockPos ur = new BlockPos(urx, cy, urz);
			BlockPos r = new BlockPos(cx, cy, rz);
			BlockPos dr = new BlockPos(drx, cy, drz);
			BlockPos d = new BlockPos(dx, cy, cz);
			BlockPos dl = new BlockPos(dlx, cy, dlz);
			BlockPos l = new BlockPos(cx, cy, lz);
			BlockPos ul = new BlockPos(ulx, cy, ulz);
			createLightningBolt(c);
			createLightningBolt(u);
			createLightningBolt(ur);
			createLightningBolt(r);
			createLightningBolt(dr);
			createLightningBolt(d);
			createLightningBolt(dl);
			createLightningBolt(l);
			createLightningBolt(ul);
			createLightningBolt(c);
			float explosionSize = 35;
			boolean destroysBlocks = true;
					createExplosion(pos, explosionSize, destroysBlocks);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					createLightningBolt(pos);
					spawnParticles(player, EnumParticleTypes.REDSTONE, 10);
		}
	}
}
