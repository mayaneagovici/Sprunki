// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class mrtree<T extends mrtree> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mrtree"), "main");
	private final ModelPart Root;
	private final ModelPart Bark;
	private final ModelPart Leaves;
	private final ModelPart Eyes;
	private final ModelPart Mouth;

	public mrtree(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Bark = this.Root.getChild("Bark");
		this.Leaves = this.Bark.getChild("Leaves");
		this.Eyes = this.Bark.getChild("Eyes");
		this.Mouth = this.Bark.getChild("Mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Bark = Root.addOrReplaceChild("Bark", CubeListBuilder.create().texOffs(126, 130).addBox(-8.0F, -14.0F, -8.0F, 16.0F, 14.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(150, 26).addBox(-7.5F, -21.0F, -7.5F, 15.0F, 7.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(101, 160).addBox(-7.085F, -30.405F, -7.085F, 14.17F, 9.81F, 14.17F, new CubeDeformation(0.0F))
		.texOffs(0, 156).addBox(-6.5F, -45.0F, -6.5F, 13.0F, 15.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Bark_r1 = Bark.addOrReplaceChild("Bark_r1", CubeListBuilder.create().texOffs(57, 146).mirror().addBox(-4.5F, -14.0F, -6.5F, 9.0F, 28.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.7196F, -14.4846F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Bark_r2 = Bark.addOrReplaceChild("Bark_r2", CubeListBuilder.create().texOffs(57, 146).addBox(-4.5F, -14.0F, -6.5F, 9.0F, 28.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7196F, -14.4846F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Bark_r3 = Bark.addOrReplaceChild("Bark_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -7.0F, -6.5F, 4.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.1177F, -35.8523F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition Bark_r4 = Bark.addOrReplaceChild("Bark_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, -6.5F, 4.0F, 14.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.1177F, -35.8523F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Leaves = Bark.addOrReplaceChild("Leaves", CubeListBuilder.create().texOffs(0, 0).addBox(-18.5F, -29.0F, -19.0F, 37.0F, 28.0F, 38.0F, new CubeDeformation(0.0F))
		.texOffs(112, 0).addBox(-15.5F, -26.0F, -23.0F, 31.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(112, 0).addBox(-15.5F, -26.0F, 19.0F, 31.0F, 22.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(122, 107).addBox(-11.0F, -1.0F, 5.0F, 22.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-13.0F, -3.0F, 6.0F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).mirror().addBox(11.0F, -3.0F, 6.0F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(139, 55).addBox(-9.0F, 5.0F, 6.0F, 18.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 103).addBox(-22.5F, -26.0F, -15.0F, 4.0F, 22.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(0, 103).mirror().addBox(18.5F, -26.0F, -15.0F, 4.0F, 22.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(95, 70).addBox(-15.5F, -32.0F, -17.0F, 31.0F, 4.0F, 33.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-15.5F, -4.0F, -17.0F, 31.0F, 4.0F, 33.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -44.0F, 0.0F));

		PartDefinition Leaves_r1 = Leaves.addOrReplaceChild("Leaves_r1", CubeListBuilder.create().texOffs(70, 107).mirror().addBox(-8.0F, -9.5F, -10.0F, 16.0F, 19.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(17.1638F, -5.2646F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Leaves_r2 = Leaves.addOrReplaceChild("Leaves_r2", CubeListBuilder.create().texOffs(70, 107).addBox(-8.0F, -9.5F, -10.0F, 16.0F, 19.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.1638F, -5.2646F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Eyes = Bark.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(0, 31).addBox(-6.5F, -2.0F, 0.0F, 13.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -37.0F, -6.51F));

		PartDefinition Mouth = Bark.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 27).addBox(-6.5F, -2.0F, 0.0F, 13.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -33.0F, -6.51F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(mrtree entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}