// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class pinki_reforge_sprunki_pink<T extends pinki_reforge_sprunki_pink> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pinki_reforge_sprunki_pink"), "main");
	private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Rightear;
	private final ModelPart Leftear;
	private final ModelPart Eyebrows;
	private final ModelPart Eyes;
	private final ModelPart E1;
	private final ModelPart E2;
	private final ModelPart E3;
	private final ModelPart Mouth;
	private final ModelPart M1;
	private final ModelPart M2;

	public pinki_reforge_sprunki_pink(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Rightear = this.Head.getChild("Rightear");
		this.Leftear = this.Head.getChild("Leftear");
		this.Eyebrows = this.Head.getChild("Eyebrows");
		this.Eyes = this.Head.getChild("Eyes");
		this.E1 = this.Eyes.getChild("E1");
		this.E2 = this.Eyes.getChild("E2");
		this.E3 = this.Eyes.getChild("E3");
		this.Mouth = this.Head.getChild("Mouth");
		this.M1 = this.Mouth.getChild("M1");
		this.M2 = this.Mouth.getChild("M2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 15).addBox(-2.14F, -5.5105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.3F, -2.7055F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-2.7076F, 0.9305F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5945F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0567F, 2.546F, 3.6118F, -0.3473F, 0.0352F, -0.0002F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.4055F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(12, 4).mirror().addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 4).addBox(-4.0F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -10.1194F, -3.9938F, -0.4363F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.9999F, -3.4995F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Rightear = Head.addOrReplaceChild("Rightear", CubeListBuilder.create(), PartPose.offset(-3.0F, -8.0F, 0.0F));

		PartDefinition Rightear_r1 = Rightear.addOrReplaceChild("Rightear_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9717F, -7.5889F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Rightear_r2 = Rightear.addOrReplaceChild("Rightear_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3266F, -7.2885F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Rightear_r3 = Rightear.addOrReplaceChild("Rightear_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7315F, -7.8104F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Rightear_r4 = Rightear.addOrReplaceChild("Rightear_r4", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -4.0F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7575F, -3.417F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition Leftear = Head.addOrReplaceChild("Leftear", CubeListBuilder.create(), PartPose.offset(3.0F, -8.0F, 0.0F));

		PartDefinition Leftear_r1 = Leftear.addOrReplaceChild("Leftear_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9717F, -7.5889F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Leftear_r2 = Leftear.addOrReplaceChild("Leftear_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3266F, -7.2885F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Leftear_r3 = Leftear.addOrReplaceChild("Leftear_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7315F, -7.8104F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Leftear_r4 = Leftear.addOrReplaceChild("Leftear_r4", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-2.0F, -4.0F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7575F, -3.417F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition Eyebrows = Head.addOrReplaceChild("Eyebrows", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.01F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition E1 = Eyes.addOrReplaceChild("E1", CubeListBuilder.create().texOffs(28, 10).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E2 = Eyes.addOrReplaceChild("E2", CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E3 = Eyes.addOrReplaceChild("E3", CubeListBuilder.create().texOffs(20, 29).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -4.01F));

		PartDefinition M1 = Mouth.addOrReplaceChild("M1", CubeListBuilder.create().texOffs(12, 2).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M2 = Mouth.addOrReplaceChild("M2", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(pinki_reforge_sprunki_pink entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}