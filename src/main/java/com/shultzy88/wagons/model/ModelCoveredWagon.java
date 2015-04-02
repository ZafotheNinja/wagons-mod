package com.shultzy88.wagons.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import com.shultzy88.wagons.entity.EntityCoveredWagon;

public class ModelCoveredWagon extends ModelBase
{
	// chassis
	public ModelRenderer chassis;
	public ModelRenderer leftSidePanel;
	public ModelRenderer rightSidePanel;
	public ModelRenderer seatBot;
	public ModelRenderer seatMid;
	public ModelRenderer seatTop;
	public ModelRenderer backAxle;
	public ModelRenderer frontAxle;

	public ModelRenderer yoke;
	public ModelRenderer tongue;

	public ModelRenderer hubBL; // wheel hub on back left
	public ModelRenderer hubBR; // wheel hub on back right
	public ModelRenderer hubFL; // wheel hub on front left
	public ModelRenderer hubFR; // wheel hub on front right

	// spokes back left
	public ModelRenderer spoke1BL;
	public ModelRenderer spoke2BL;
	public ModelRenderer spoke3BL;
	public ModelRenderer spoke4BL;

	// spokes back right
	public ModelRenderer spoke1BR;
	public ModelRenderer spoke2BR;
	public ModelRenderer spoke3BR;
	public ModelRenderer spoke4BR;

	// spokes front left
	public ModelRenderer spoke1FL;
	public ModelRenderer spoke2FL;
	public ModelRenderer spoke3FL;
	public ModelRenderer spoke4FL;

	// spokes front right
	public ModelRenderer spoke1FR;
	public ModelRenderer spoke2FR;
	public ModelRenderer spoke3FR;
	public ModelRenderer spoke4FR;

	// wheels back left
	public ModelRenderer wheel1BL;
	public ModelRenderer wheel2BL;
	public ModelRenderer wheel3BL;
	public ModelRenderer wheel4BL;

	// wheels back right
	public ModelRenderer wheel1BR;
	public ModelRenderer wheel2BR;
	public ModelRenderer wheel3BR;
	public ModelRenderer wheel4BR;

	// wheels front left
	public ModelRenderer wheel1FL;
	public ModelRenderer wheel2FL;
	public ModelRenderer wheel3FL;
	public ModelRenderer wheel4FL;

	// wheels front right
	public ModelRenderer wheel1FR;
	public ModelRenderer wheel2FR;
	public ModelRenderer wheel4FR;
	public ModelRenderer wheel3FR;

	// cover
	public ModelRenderer coverDiagLeft;
	public ModelRenderer coverDiagRight;
	public ModelRenderer coverLeft;
	public ModelRenderer coverRight;
	public ModelRenderer coverTop;

	public int textureWidth = 256;
	public int textureHeight = 128;

	protected int cycleIndex = 0;

	protected float[] undulationCycle = { 0F, 45F, 90F, 135F, 180F, 225F, 270F, 315F };

	public ModelCoveredWagon()
	{
		chassis = new ModelRenderer(this, 96, 0);
		chassis.addBox(-16F, -1F, -24F, 32, 1, 48);
		chassis.setRotationPoint(0F, 8F, 0F);
		chassis.setTextureSize(textureWidth, textureHeight);
		chassis.setTextureOffset(81, 42).addBox(-15F, -5F, -20F, 30, 4, 1); // seat
		chassis.setTextureOffset(69, 33).addBox(-15F, -6F, -20F, 30, 1, 7);
		chassis.setTextureOffset(81, 24).addBox(-15F, -12F, -13F, 30, 7, 1);
		chassis.setTextureOffset(159, 50).addBox(15F, -12F, -24F, 1, 12, 48); // sides
		chassis.setTextureOffset(159, 50).addBox(-16F, -12F, -24F, 1, 12, 48);

		frontAxle = new ModelRenderer(this, 0, 14);
		frontAxle.addBox(-20F, 0F, -16F, 40, 1, 1);
		frontAxle.setRotationPoint(0F, 8F, 0F);
		frontAxle.setTextureSize(textureWidth, textureHeight);

		backAxle = new ModelRenderer(this, 0, 19);
		backAxle.addBox(-20F, 0F, 17F, 40, 1, 1);
		backAxle.setRotationPoint(0F, 8F, 0F);
		backAxle.setTextureSize(textureWidth, textureHeight);

		yoke = new ModelRenderer(this, 0, 58);
		yoke.addBox(-10F, -1F, -49F, 20, 1, 1);
		yoke.setRotationPoint(0F, 8F, 0F);

		tongue = new ModelRenderer(this, 0, 24);
		tongue.addBox(0.5F, 16F, -1F, 1, 1, 32);
		tongue.setRotationPoint(0F, 8F, 0F);

		hubBL = new ModelRenderer(this, 15, 0);
		hubBL.addBox(0F, -1.5F, -2F, 2, 3, 3);
		hubBL.setRotationPoint(20F, 8F, 18F);
		hubBL.setTextureSize(textureWidth, textureHeight);

		hubBR = new ModelRenderer(this, 15, 0);
		hubBR.addBox(-2F, -1.5F, -2F, 2, 3, 3);
		hubBR.setRotationPoint(-20F, 8F, 18F);
		hubBR.setTextureSize(textureWidth, textureHeight);

		hubFL = new ModelRenderer(this, 15, 0);
		hubFL.addBox(0F, -1.5F, -2F, 2, 3, 3);
		hubFL.setRotationPoint(20F, 8F, -14F);
		hubFL.setTextureSize(textureWidth, textureHeight);

		hubFR = new ModelRenderer(this, 15, 0);
		hubFR.addBox(-2F, -1.5F, -2F, 2, 3, 3);
		hubFR.setRotationPoint(-20F, 8F, -14F);
		hubFR.setTextureSize(textureWidth, textureHeight);

		spoke1BL = new ModelRenderer(this, 0, 0);
		spoke1BL.addBox(0F, -5F, -1F, 1, 4, 1);
		hubBL.addChild(spoke1BL);

		spoke2BL = new ModelRenderer(this, 0, 0);
		spoke2BL.addBox(0F, -5F, 0F, 1, 4, 1);
		spoke2BL.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubBL.addChild(spoke2BL);

		spoke3BL = new ModelRenderer(this, 0, 0);
		spoke3BL.addBox(0F, -5F, 0F, 1, 4, 1);
		spoke3BL.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubBL.addChild(spoke3BL);

		spoke4BL = new ModelRenderer(this, 0, 0);
		spoke4BL.addBox(0F, -5F, -1F, 1, 4, 1);
		spoke4BL.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubBL.addChild(spoke4BL);

		spoke1BR = new ModelRenderer(this, 0, 0);
		spoke1BR.addBox(0F, -5F, -1F, 1, 4, 0);
		hubBR.addChild(spoke1BR);

		spoke2BR = new ModelRenderer(this, 0, 0);
		spoke2BR.addBox(0F, -5F, -1F, 1, 4, 2);
		spoke2BR.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubBR.addChild(spoke2BR);

		spoke3BR = new ModelRenderer(this, 0, 0);
		spoke3BR.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke3BR.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubBR.addChild(spoke3BR);

		spoke4BR = new ModelRenderer(this, 0, 0);
		spoke4BR.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke4BR.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubBR.addChild(spoke4BR);

		spoke1FL = new ModelRenderer(this, 0, 0);
		spoke1FL.addBox(-1F, 2F, -1F, 1, 4, 2);
		hubFL.addChild(spoke1FL);

		spoke2FL = new ModelRenderer(this, 0, 0);
		spoke2FL.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke2FL.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubFL.addChild(spoke2FL);

		spoke3FL = new ModelRenderer(this, 0, 0);
		spoke3FL.addBox(-1F, 2F, -1F, 1, 4, 2);
		spoke3FL.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubFL.addChild(spoke1FL);

		spoke4FL = new ModelRenderer(this, 0, 0);
		spoke4FL.addBox(-1F, 2F, -1F, 1, 4, 2);
		spoke4FL.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubFL.addChild(spoke4FL);

		spoke1FR = new ModelRenderer(this, 0, 0);
		spoke1FR.addBox(0F, 2F, -1F, 1, 4, 2);
		hubFL.addChild(spoke1FL);

		spoke2FR = new ModelRenderer(this, 0, 0);
		spoke2FR.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke2FR.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubFR.addChild(spoke2FR);

		spoke3FR = new ModelRenderer(this, 0, 0);
		spoke3FR.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke3FR.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubFR.addChild(spoke3FR);

		spoke4FR = new ModelRenderer(this, 0, 0);
		spoke4FR.addBox(0F, 2F, -1F, 1, 4, 2);
		spoke4FR.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubFR.addChild(spoke4FR);

		wheel1BL = new ModelRenderer(this, 0, 0);
		wheel1BL.addBox(-1F, 6F, -6F, 1, 1, 12);
		hubBL.addChild(wheel1BL);

		wheel2BL = new ModelRenderer(this, 0, 0);
		wheel2BL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel2BL.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubBL.addChild(wheel2BL);

		wheel3BL = new ModelRenderer(this, 0, 0);
		wheel3BL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel3BL.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubBL.addChild(wheel3BL);

		wheel4BL = new ModelRenderer(this, 0, 0);
		wheel4BL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel4BL.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubBL.addChild(wheel4BL);

		wheel1BR = new ModelRenderer(this, 0, 0);
		wheel1BR.addBox(0F, 6F, -6F, 1, 1, 12);
		hubBR.addChild(wheel1BR);

		wheel2BR = new ModelRenderer(this, 0, 0);
		wheel2BR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel2BR.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubBR.addChild(wheel2BR);

		wheel3BR = new ModelRenderer(this, 0, 0);
		wheel3BR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel3BR.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubBR.addChild(wheel3BR);

		wheel4BR = new ModelRenderer(this, 0, 0);
		wheel4BR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel4BR.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubBR.addChild(wheel4BR);

		wheel1FL = new ModelRenderer(this, 0, 0);
		wheel1FL.addBox(-1F, 6F, -6F, 1, 1, 12);
		hubFL.addChild(wheel1FL);

		wheel2FL = new ModelRenderer(this, 0, 0);
		wheel2FL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel2FL.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubFL.addChild(wheel2FL);

		wheel3FL = new ModelRenderer(this, 0, 0);
		wheel3FL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel3FL.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubFL.addChild(wheel3FL);

		wheel4FL = new ModelRenderer(this, 0, 0);
		wheel4FL.addBox(-1F, 6F, -6F, 1, 1, 12);
		wheel4FL.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubFL.addChild(wheel4FL);

		wheel1FR = new ModelRenderer(this, 0, 0);
		wheel1FR.addBox(0F, 6F, -6F, 1, 1, 12);
		hubFR.addChild(wheel1FR);

		wheel2FR = new ModelRenderer(this, 0, 0);
		wheel2FR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel2FR.rotateAngleX = this.degToRad(undulationCycle[2]);
		hubFR.addChild(wheel2FR);

		wheel3FR = new ModelRenderer(this, 0, 0);
		wheel3FR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel3FR.rotateAngleX = this.degToRad(undulationCycle[4]);
		hubFR.addChild(wheel3FR);

		wheel4FR = new ModelRenderer(this, 0, 0);
		wheel4FR.addBox(0F, 6F, -6F, 1, 1, 12);
		wheel4FR.rotateAngleX = this.degToRad(undulationCycle[6]);
		hubFR.addChild(wheel4FR);

		coverTop = new ModelRenderer(this, 138, 88);
		coverTop.addBox(-10F, 33F, -15F, 20, 1, 39);
		coverTop.setRotationPoint(0F, 8F, 0F);
		coverTop.addBox(30F, 8F, -15F, 1, 9, 48);
		
		coverDiagLeft = new ModelRenderer(this, 0, 80);
		coverDiagLeft.addBox(30F, 8F, -15F, 1, 9, 39);
		coverDiagLeft.setRotationPoint(0F, 8F, 0F);
		coverDiagLeft.rotateAngleZ = degToRad(315F);

		coverDiagRight = new ModelRenderer(this, 0, 80);
		coverDiagRight.addBox(-31F, 8F, -15F, 1, 9, 39);
		coverDiagRight.setRotationPoint(0F, 8F, 0F);
		coverDiagRight.rotateAngleZ = degToRad(45F);

		coverLeft = new ModelRenderer(this, 96, 110);
		coverLeft.addBox(-15F, 12F, -16F, 39, 15, 1);
		coverLeft.setRotationPoint(0F, 8F, 0F);
		coverLeft.rotateAngleY = 1.5707963267948966F;

		coverRight = new ModelRenderer(this, 96, 93);
		coverRight.addBox(-24F, 12F, -16F, 39, 15, 1);
		coverRight.setRotationPoint(0F, 8F, 0F);
		coverRight.rotateAngleY = 4.71238898038469F;

	}

	@Override
	public void render(Entity entity, float time, float swingSuppress, float par4,
			float parAngleY, float parAngleX, float par7)
	{
		renderCoveredWagon((EntityCoveredWagon) entity, time, swingSuppress, par4,
				parAngleY, parAngleX, par7);

	}

	private void renderCoveredWagon(EntityCoveredWagon entity, float time,
			float swingSuppress, float par4, float parAngleY, float parAngleX, float par7)
	{
		GL11.glPushMatrix();
		chassis.render(par7);
//		coverRight.render(par7);
//		coverLeft.render(par7);
//		coverDiagRight.render(par7);
//		coverDiagLeft.render(par7);
//		coverTop.render(par7);
		frontAxle.render(par7);
		backAxle.render(par7);
		hubBL.render(par7);
		hubBR.render(par7);
		hubFL.render(par7);
		hubFR.render(par7);
		GL11.glPopMatrix();
	}

	@Override
	public void setRotationAngles(float time, float swingSuppress, float par3,
			float angleY, float angleX, float par6, Entity entity)
	{

	}

	@Override
	protected void setTextureOffset(String textureName, int offsetX, int offsetY)
	{
		super.setTextureOffset(textureName, offsetX, offsetY);
	}

	/**
	 * Convert degrees to radians
	 * 
	 * @param degrees
	 * @return
	 */
	private float degToRad(float degrees)
	{
		return degrees * (float) Math.PI / 180;
	}

	protected void setRotation(ModelRenderer model, float rotX, float rotY, float rotZ)
	{
		model.rotateAngleX = degToRad(rotX);
		model.rotateAngleY = degToRad(rotY);
		model.rotateAngleZ = degToRad(rotZ);
	}

	// spin methods are good for testing and debug rotation points and offsets
	// in the model
	protected void spinX(ModelRenderer model)
	{
		model.rotateAngleX += degToRad(0.5F);
	}

	protected void spinY(ModelRenderer model)
	{
		model.rotateAngleY += degToRad(0.5F);
	}

	protected void spinZ(ModelRenderer model)
	{
		model.rotateAngleZ += degToRad(0.5F);
	}
}
