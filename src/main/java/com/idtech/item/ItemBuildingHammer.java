package com.idtech.item;

import com.idtech.block.QuickBlock;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

public class ItemBuildingHammer extends QuickItem {
	{
		name = "BuildingHammer";
		texture = "lightninghammer";
		
	}
	public void onRightClick(){
		BlockPos target = findBlockAtCursor(500);
		if (target!= null){
			BlockPos pos = target;
			double tx = pos.getX();
			double ty = pos.getY();
			double tz = pos.getZ();
			double thz = tz+7;
			double thx = tx+7;
			double tby = ty+1;
			double tcy = ty+2;
			double tdy = ty+3;
			double tey = ty+4;
			
			double tbx = tx+1;
			
			IBlockState walls = Blocks.LOG.getDefaultState();
			IBlockState windows = Blocks.GLASS.getDefaultState();
			IBlockState roof = Blocks.LOG.getDefaultState();
			
			double aaax = tx;
			double baax= tx +1;
			double caax= tx+2;
			double daax=tx+3;
			double eaax=tx+4;
			double faax=tx+5;
			double gaax=tx+6;
			double haax=tx+7;
			

			double aabz= tz+1;
			double aacz= tz+2;
			double aadz=tz+3;
			double aaez=tz+4;
			double aafz=tz+5;
			double aagz=tz+6;
			double aahz=tz+7;
			
			
			
			double bahx=tx+1;
			double cahx=tx+2;
			double dahx=tx+3;
			double eahx=tx+4;
			double fahx=tx+5;
			double gahx=tx+6;
			double hahx=tx+7;
			
			
			double habz=tz+1;
			double hacz=tz+2;
			double hadz=tz+3;
			double haez=tz+4;
			double hafz=tz+5;
			double hagz=tz+6;
			
			

			
			
			BlockPos aaa = new BlockPos(aaax,ty,tz);
			

			BlockPos baa = new BlockPos(baax,ty,tz);
			BlockPos caa = new BlockPos(caax,ty,tz);
			BlockPos daa = new BlockPos(daax,ty,tz);
			BlockPos eaa = new BlockPos(eaax,ty,tz);
			BlockPos faa = new BlockPos(faax,ty,tz);
			BlockPos gaa = new BlockPos(gaax,ty,tz);
			BlockPos haa = new BlockPos(haax,ty,tz);
			
			BlockPos aab = new BlockPos(tx,ty,aabz);
			BlockPos aac = new BlockPos(tx,ty,aacz);
			BlockPos aad = new BlockPos(tx,ty,aadz);
			BlockPos aae = new BlockPos(tx,ty,aaez);
			BlockPos aaf = new BlockPos(tx,ty,aafz);
			BlockPos aag = new BlockPos(tx,ty,aagz);
			BlockPos aah = new BlockPos(tx,ty,aahz);
			
			BlockPos bah = new BlockPos(bahx,ty,thz);
			BlockPos cah = new BlockPos(cahx,ty,thz);
			BlockPos dah = new BlockPos(dahx,ty,thz);
			BlockPos eah = new BlockPos(eahx,ty,thz);
			BlockPos fah = new BlockPos(fahx,ty,thz);
			BlockPos gah = new BlockPos(gahx,ty,thz);
			BlockPos hah = new BlockPos(hahx,ty,thz);
			
			BlockPos hab = new BlockPos(thx, ty, habz);
			BlockPos hac = new BlockPos(thx, ty, hacz);
			BlockPos had = new BlockPos(thx, ty, hadz);
			BlockPos hae = new BlockPos(thx, ty, haez);
			BlockPos haf = new BlockPos(thx, ty, hafz);
			BlockPos hag = new BlockPos(thx, ty, hagz);
			
			
			
			
			world.setBlockState(aaa, walls);
			world.setBlockState(baa, walls);
			world.setBlockState(caa, walls);
			world.setBlockState(daa, walls);
			world.setBlockState(eaa, walls);
			world.setBlockState(faa, walls);
			world.setBlockState(gaa, walls);
			world.setBlockState(haa, walls);
			world.setBlockState(aab, walls);
			world.setBlockState(aac, walls);
			world.setBlockState(aad, walls);
			world.setBlockState(aae, walls);
			world.setBlockState(aaf, walls);
			world.setBlockState(aag, walls);
			world.setBlockState(aah, walls);
			
			world.setBlockState(hab, walls);
			world.setBlockState(hac, walls);
			world.setBlockState(had, walls);
			world.setBlockState(hae, walls);
			world.setBlockState(haf, walls);
			world.setBlockState(hag, walls);
			
			world.setBlockState(bah, walls);
			world.setBlockState(cah, walls);
			world.setBlockState(dah, walls);
			world.setBlockState(eah, walls);
			world.setBlockState(fah, walls);
			world.setBlockState(gah, walls);
			world.setBlockState(hah, walls);
			BlockPos abe= new BlockPos(tx,tby,aaez);
			BlockPos abf= new BlockPos(tx,tby,aafz);
			BlockPos abg= new BlockPos(tx,tby,aagz);
			BlockPos abh= new BlockPos(tx,tby,aahz);
			BlockPos bbh= new BlockPos(bahx,tby,thz);
			BlockPos cbh= new BlockPos(cahx,tby,thz);
			BlockPos dbh= new BlockPos(dahx,tby,thz);
			BlockPos ebh= new BlockPos(eahx,tby,thz);
			BlockPos fbh= new BlockPos(fahx,tby,thz);
			BlockPos gbh= new BlockPos(gahx,tby,thz);
			BlockPos hbh= new BlockPos(hahx,tby,thz);
			BlockPos hbb= new BlockPos(thx,tby, habz);
			BlockPos hbc= new BlockPos(thx,tby, hacz);
			BlockPos hbd= new BlockPos(thx,tby, hadz);
			BlockPos hbe= new BlockPos(thx,tby, haez);
			BlockPos hbf= new BlockPos(thx,tby, hafz);
			BlockPos hbg= new BlockPos(thx,tby, hagz);
			BlockPos aba= new BlockPos(aaax,tby,tz);
			BlockPos bba= new BlockPos(baax,tby,tz);
			BlockPos cba= new BlockPos(caax,tby,tz);
			BlockPos dba= new BlockPos(daax,tby,tz);
			BlockPos eba= new BlockPos(eaax,tby,tz);
			BlockPos fba= new BlockPos(faax,tby,tz);
			BlockPos gba= new BlockPos(gaax,tby,tz);
			BlockPos hba= new BlockPos(haax,tby,tz);
			BlockPos abb= new BlockPos(tx,tby,aabz);
			BlockPos abc= new BlockPos(tx,tby,aacz);
			BlockPos abd= new BlockPos(tx,tby,aadz);
			world.setBlockState(aba, walls);
			world.setBlockState(bba, walls);
			world.setBlockState(cba, walls);
			world.setBlockState(dba, walls);
			world.setBlockState(eba, walls);
			world.setBlockState(fba, walls);
			world.setBlockState(gba, walls);
			world.setBlockState(hba, walls);
			world.setBlockState(abb, walls);
			world.setBlockState(abc, walls);
			world.setBlockState(abd, walls);
			world.setBlockState(abe, walls);
			world.setBlockState(abf, walls);
			world.setBlockState(abg, walls);
			world.setBlockState(abh, walls);
			world.setBlockState(hbb, walls);
			world.setBlockState(hbc, walls);
			world.setBlockState(hbd, walls);
			world.setBlockState(hbe, walls);
			world.setBlockState(hbf, walls);
			world.setBlockState(hbg, walls);
			world.setBlockState(bbh, walls);
			world.setBlockState(cbh, walls);
			world.setBlockState(dbh, walls);
			world.setBlockState(ebh, walls);
			world.setBlockState(fbh, walls);
			world.setBlockState(gbh, walls);
			world.setBlockState(hbh, walls);
			BlockPos aca= new BlockPos(aaax,tcy,tz);
			BlockPos bca= new BlockPos(baax,tcy,tz);
			BlockPos cca= new BlockPos(caax,tcy,tz);
			BlockPos dca= new BlockPos(daax,tcy,tz);
			BlockPos eca= new BlockPos(eaax,tcy,tz);
			BlockPos fca= new BlockPos(faax,tcy,tz);
			BlockPos gca= new BlockPos(gaax,tcy,tz);
			BlockPos hca= new BlockPos(haax,tcy,tz);
			BlockPos acb= new BlockPos(tx,tcy,aabz);
			BlockPos acc= new BlockPos(tx,tcy,aacz);
			BlockPos acd= new BlockPos(tx,tcy,aadz);
			BlockPos ace= new BlockPos(tx,tcy,aaez);
			BlockPos acf= new BlockPos(tx,tcy,aafz);
			BlockPos acg= new BlockPos(tx,tcy,aagz);
			BlockPos ach= new BlockPos(tx,tcy,aahz);
			BlockPos bch= new BlockPos(bahx,tcy,thz);
			BlockPos cch= new BlockPos(cahx,tcy,thz);
			BlockPos dch= new BlockPos(dahx,tcy,thz);
			BlockPos ech= new BlockPos(eahx,tcy,thz);
			BlockPos fch= new BlockPos(fahx,tcy,thz);
			BlockPos gch= new BlockPos(gahx,tcy,thz);
			BlockPos hch= new BlockPos(hahx,tcy,thz);
			BlockPos hcb= new BlockPos(thx,tcy, habz);
			BlockPos hcc= new BlockPos(thx,tcy, hacz);
			BlockPos hcd= new BlockPos(thx,tcy, hadz);
			BlockPos hce= new BlockPos(thx,tcy, haez);
			BlockPos hcf= new BlockPos(thx,tcy, hafz);
			BlockPos hcg= new BlockPos(thx,tcy, hagz);
			world.setBlockState(aca, walls);
			world.setBlockState(bca, walls);
			world.setBlockState(cca, walls);
			world.setBlockState(dca, walls);
			world.setBlockState(eca, walls);
			world.setBlockState(fca, walls);
			world.setBlockState(gca, walls);
			world.setBlockState(hca, walls);
			world.setBlockState(acb, walls);
			world.setBlockState(acc, walls);
			world.setBlockState(acd, walls);
			world.setBlockState(ace, walls);
			world.setBlockState(acf, walls);
			world.setBlockState(acg, walls);
			world.setBlockState(ach, walls);
			world.setBlockState(hcb, walls);
			world.setBlockState(hcc, walls);
			world.setBlockState(hcd, walls);
			world.setBlockState(hce, walls);
			world.setBlockState(hcf, walls);
			world.setBlockState(hcg, walls);
			world.setBlockState(bch, walls);
			world.setBlockState(cch, walls);
			world.setBlockState(dch, walls);
			world.setBlockState(ech, walls);
			world.setBlockState(fch, walls);
			world.setBlockState(gch, walls);
			world.setBlockState(hch, walls);
			BlockPos ada= new BlockPos(aaax,tdy,tz);
			BlockPos bda= new BlockPos(baax,tdy,tz);
			BlockPos cda= new BlockPos(caax,tdy,tz);
			BlockPos dda= new BlockPos(daax,tdy,tz);
			BlockPos eda= new BlockPos(eaax,tdy,tz);
			BlockPos fda= new BlockPos(faax,tdy,tz);
			BlockPos gda= new BlockPos(gaax,tdy,tz);
			BlockPos hda= new BlockPos(haax,tdy,tz);
			BlockPos adb= new BlockPos(tx,tdy,aabz);
			BlockPos adc= new BlockPos(tx,tdy,aacz);
			BlockPos add= new BlockPos(tx,tdy,aadz);
			BlockPos ade= new BlockPos(tx,tdy,aaez);
			BlockPos adf= new BlockPos(tx,tdy,aafz);
			BlockPos adg= new BlockPos(tx,tdy,aagz);
			BlockPos adh= new BlockPos(tx,tdy,aahz);
			BlockPos bdh= new BlockPos(bahx,tdy,thz);
			BlockPos cdh= new BlockPos(cahx,tdy,thz);
			BlockPos ddh= new BlockPos(dahx,tdy,thz);
			BlockPos edh= new BlockPos(eahx,tdy,thz);
			BlockPos fdh= new BlockPos(fahx,tdy,thz);
			BlockPos gdh= new BlockPos(gahx,tdy,thz);
			BlockPos hdh= new BlockPos(hahx,tdy,thz);
			BlockPos hdb= new BlockPos(thx,tdy, habz);
			BlockPos hdc= new BlockPos(thx,tdy, hacz);
			BlockPos hdd= new BlockPos(thx,tdy, hadz);
			BlockPos hde= new BlockPos(thx,tdy, haez);
			BlockPos hdf= new BlockPos(thx,tdy, hafz);
			BlockPos hdg= new BlockPos(thx,tdy, hagz);
			world.setBlockState(ada, walls);
			world.setBlockState(bda, walls);
			world.setBlockState(cda, walls);
			world.setBlockState(dda, walls);
			world.setBlockState(eda, walls);
			world.setBlockState(fda, walls);
			world.setBlockState(gda, walls);
			world.setBlockState(hda, walls);
			world.setBlockState(adb, walls);
			world.setBlockState(adc, walls);
			world.setBlockState(add, walls);
			world.setBlockState(ade, walls);
			world.setBlockState(adf, walls);
			world.setBlockState(adg, walls);
			world.setBlockState(adh, walls);
			world.setBlockState(hdb, walls);
			world.setBlockState(hdc, walls);
			world.setBlockState(hdd, walls);
			world.setBlockState(hde, walls);
			world.setBlockState(hdf, walls);
			world.setBlockState(hdg, walls);
			world.setBlockState(bdh, walls);
			world.setBlockState(cdh, walls);
			world.setBlockState(ddh, walls);
			world.setBlockState(edh, walls);
			world.setBlockState(fdh, walls);
			world.setBlockState(gdh, walls);
			world.setBlockState(hdh, walls);
			BlockPos aea= new BlockPos(aaax,tey,tz);
			BlockPos bea= new BlockPos(baax,tey,tz);
			BlockPos cea= new BlockPos(caax,tey,tz);
			BlockPos dea= new BlockPos(daax,tey,tz);
			BlockPos eea= new BlockPos(eaax,tey,tz);
			BlockPos fea= new BlockPos(faax,tey,tz);
			BlockPos gea= new BlockPos(gaax,tey,tz);
			BlockPos hea= new BlockPos(haax,tey,tz);
			BlockPos aeb= new BlockPos(tx,tey,aabz);
			BlockPos aec= new BlockPos(tx,tey,aacz);
			BlockPos aed= new BlockPos(tx,tey,aadz);
			BlockPos aee= new BlockPos(tx,tey,aaez);
			BlockPos aef= new BlockPos(tx,tey,aafz);
			BlockPos aeg= new BlockPos(tx,tey,aagz);
			BlockPos aeh= new BlockPos(tx,tey,aahz);
			BlockPos beh= new BlockPos(bahx,tey,thz);
			BlockPos ceh= new BlockPos(cahx,tey,thz);
			BlockPos deh= new BlockPos(dahx,tey,thz);
			BlockPos eeh= new BlockPos(eahx,tey,thz);
			BlockPos feh= new BlockPos(fahx,tey,thz);
			BlockPos geh= new BlockPos(gahx,tey,thz);
			BlockPos heh= new BlockPos(hahx,tey,thz);
			BlockPos heb= new BlockPos(thx,tey, habz);
			BlockPos hec= new BlockPos(thx,tey, hacz);
			BlockPos hed= new BlockPos(thx,tey, hadz);
			BlockPos hee= new BlockPos(thx,tey, haez);
			BlockPos hef= new BlockPos(thx,tey, hafz);
			BlockPos heg= new BlockPos(thx,tey, hagz);
			world.setBlockState(aea, walls);
			world.setBlockState(bea, walls);
			world.setBlockState(cea, walls);
			world.setBlockState(dea, walls);
			world.setBlockState(eea, walls);
			world.setBlockState(fea, walls);
			world.setBlockState(gea, walls);
			world.setBlockState(hea, walls);
			world.setBlockState(aeb, walls);
			world.setBlockState(aec, walls);
			world.setBlockState(aed, walls);
			world.setBlockState(aee, walls);
			world.setBlockState(aef, walls);
			world.setBlockState(aeg, walls);
			world.setBlockState(aeh, walls);
			world.setBlockState(heb, walls);
			world.setBlockState(hec, walls);
			world.setBlockState(hed, walls);
			world.setBlockState(hee, walls);
			world.setBlockState(hef, walls);
			world.setBlockState(heg, walls);
			world.setBlockState(beh, walls);
			world.setBlockState(ceh, walls);
			world.setBlockState(deh, walls);
			world.setBlockState(eeh, walls);
			world.setBlockState(feh, walls);
			world.setBlockState(geh, walls);
			world.setBlockState(heh, walls);
		}
	}
	
}
