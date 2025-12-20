// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class sky_cute_sprunki_cool<T extends sky_cute_sprunki_cool> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sky_cute_sprunki_cool"), "main");
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
	private final ModelPart M3;
	private final ModelPart M4;

	public sky_cute_sprunki_cool(ModelPart root) {
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
		this.M3 = this.Mouth.getChild("M3");
		this.M4 = this.Mouth.getChild("M4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 28).addBox(-2.14F, -5.5105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(-2.3F, -2.7055F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(16, 18).addBox(-2.7076F, 0.9305F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5945F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(36, 22).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0567F, 2.546F, 3.6118F, -0.3473F, 0.0352F, -0.0002F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 36).addBox(-1.5F, -12.5F, -4.01F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.4055F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Rightear = Head.addOrReplaceChild("Rightear", CubeListBuilder.create().texOffs(36, 15).addBox(-1.5F, -3.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 37).addBox(-1.5F, -3.0F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -8.0F, 0.0F));

		PartDefinition Rightear_r1 = Rightear.addOrReplaceChild("Rightear_r1", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 15).addBox(-0.5F, -2.5F, -0.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Rightear_r2 = Rightear.addOrReplaceChild("Rightear_r2", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -2.3998F));

		PartDefinition Rightear_r3 = Rightear.addOrReplaceChild("Rightear_r3", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -1.9199F));

		PartDefinition Rightear_r4 = Rightear.addOrReplaceChild("Rightear_r4", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -1.4399F));

		PartDefinition Rightear_r5 = Rightear.addOrReplaceChild("Rightear_r5", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Rightear_r6 = Rightear.addOrReplaceChild("Rightear_r6", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -0.8F, 0.0F, 0.0F, -0.48F));

		PartDefinition Rightear_r7 = Rightear.addOrReplaceChild("Rightear_r7", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Rightear_r8 = Rightear.addOrReplaceChild("Rightear_r8", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Rightear_r9 = Rightear.addOrReplaceChild("Rightear_r9", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Rightear_r10 = Rightear.addOrReplaceChild("Rightear_r10", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Rightear_r11 = Rightear.addOrReplaceChild("Rightear_r11", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Rightear_r12 = Rightear.addOrReplaceChild("Rightear_r12", CubeListBuilder.create().texOffs(36, 15).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Leftear = Head.addOrReplaceChild("Leftear", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(0.5F, -3.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 37).mirror().addBox(0.5F, -3.0F, -1.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.0F, -8.0F, 0.0F));

		PartDefinition Leftear_r1 = Leftear.addOrReplaceChild("Leftear_r1", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -0.2F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 2.7489F));

		PartDefinition Leftear_r2 = Leftear.addOrReplaceChild("Leftear_r2", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 2.3998F));

		PartDefinition Leftear_r3 = Leftear.addOrReplaceChild("Leftear_r3", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 1.9199F));

		PartDefinition Leftear_r4 = Leftear.addOrReplaceChild("Leftear_r4", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 1.4399F));

		PartDefinition Leftear_r5 = Leftear.addOrReplaceChild("Leftear_r5", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 0.9599F));

		PartDefinition Leftear_r6 = Leftear.addOrReplaceChild("Leftear_r6", CubeListBuilder.create().texOffs(0, 37).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, -0.8F, 0.0F, 0.0F, 0.48F));

		PartDefinition Leftear_r7 = Leftear.addOrReplaceChild("Leftear_r7", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

		PartDefinition Leftear_r8 = Leftear.addOrReplaceChild("Leftear_r8", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.9635F));

		PartDefinition Leftear_r9 = Leftear.addOrReplaceChild("Leftear_r9", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Leftear_r10 = Leftear.addOrReplaceChild("Leftear_r10", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition Leftear_r11 = Leftear.addOrReplaceChild("Leftear_r11", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Leftear_r12 = Leftear.addOrReplaceChild("Leftear_r12", CubeListBuilder.create().texOffs(36, 15).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Eyebrows = Head.addOrReplaceChild("Eyebrows", CubeListBuilder.create().texOffs(20, 15).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.01F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition E1 = Eyes.addOrReplaceChild("E1", CubeListBuilder.create().texOffs(20, 0).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E2 = Eyes.addOrReplaceChild("E2", CubeListBuilder.create().texOffs(20, 5).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E3 = Eyes.addOrReplaceChild("E3", CubeListBuilder.create().texOffs(20, 10).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -4.01F));

		PartDefinition M1 = Mouth.addOrReplaceChild("M1", CubeListBuilder.create().texOffs(0, 33).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M2 = Mouth.addOrReplaceChild("M2", CubeListBuilder.create().texOffs(0, 35).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M3 = Mouth.addOrReplaceChild("M3", CubeListBuilder.create().texOffs(32, 35).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M4 = Mouth.addOrReplaceChild("M4", CubeListBuilder.create().texOffs(12, 36).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(sky_cute_sprunki_cool entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}