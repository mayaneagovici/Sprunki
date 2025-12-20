// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class simon_cool_sprunki<T extends simon_cool_sprunki> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "simon_cool_sprunki"), "main");
	private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Rightantenna;
	private final ModelPart Leftantenna;
	private final ModelPart Eyebrows;
	private final ModelPart Eyes;
	private final ModelPart E1;
	private final ModelPart E2;
	private final ModelPart E3;
	private final ModelPart E4;
	private final ModelPart Mouth;
	private final ModelPart M1;
	private final ModelPart M2;
	private final ModelPart M3;

	public simon_cool_sprunki(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Rightantenna = this.Head.getChild("Rightantenna");
		this.Leftantenna = this.Head.getChild("Leftantenna");
		this.Eyebrows = this.Head.getChild("Eyebrows");
		this.Eyes = this.Head.getChild("Eyes");
		this.E1 = this.Eyes.getChild("E1");
		this.E2 = this.Eyes.getChild("E2");
		this.E3 = this.Eyes.getChild("E3");
		this.E4 = this.Eyes.getChild("E4");
		this.Mouth = this.Head.getChild("Mouth");
		this.M1 = this.Mouth.getChild("M1");
		this.M2 = this.Mouth.getChild("M2");
		this.M3 = this.Mouth.getChild("M3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 20).addBox(-2.14F, -5.5105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.3F, -2.7055F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-2.7076F, 0.9305F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5945F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-6.0F, -6.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).mirror().addBox(4.0F, -6.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 4).addBox(-7.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 4).mirror().addBox(6.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 4).addBox(-8.0F, -5.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 4).mirror().addBox(7.0F, -5.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 0).addBox(-3.0F, -11.0F, -4.01F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.4055F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Rightantenna = Head.addOrReplaceChild("Rightantenna", CubeListBuilder.create().texOffs(10, 34).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -7.5F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -6.5F, 0.0F));

		PartDefinition Rightantenna_r1 = Rightantenna.addOrReplaceChild("Rightantenna_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -2.8798F));

		PartDefinition Rightantenna_r2 = Rightantenna.addOrReplaceChild("Rightantenna_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -2.3998F));

		PartDefinition Rightantenna_r3 = Rightantenna.addOrReplaceChild("Rightantenna_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition Rightantenna_r4 = Rightantenna.addOrReplaceChild("Rightantenna_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -1.4399F));

		PartDefinition Rightantenna_r5 = Rightantenna.addOrReplaceChild("Rightantenna_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Rightantenna_r6 = Rightantenna.addOrReplaceChild("Rightantenna_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition Leftantenna = Head.addOrReplaceChild("Leftantenna", CubeListBuilder.create().texOffs(10, 34).mirror().addBox(-0.5F, -3.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(-0.5F, -7.5F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.5F, -6.5F, 0.0F));

		PartDefinition Leftantenna_r1 = Leftantenna.addOrReplaceChild("Leftantenna_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition Leftantenna_r2 = Leftantenna.addOrReplaceChild("Leftantenna_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 2.3998F));

		PartDefinition Leftantenna_r3 = Leftantenna.addOrReplaceChild("Leftantenna_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 1.9199F));

		PartDefinition Leftantenna_r4 = Leftantenna.addOrReplaceChild("Leftantenna_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 1.4399F));

		PartDefinition Leftantenna_r5 = Leftantenna.addOrReplaceChild("Leftantenna_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition Leftantenna_r6 = Leftantenna.addOrReplaceChild("Leftantenna_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition Eyebrows = Head.addOrReplaceChild("Eyebrows", CubeListBuilder.create().texOffs(0, 26).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.01F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition E1 = Eyes.addOrReplaceChild("E1", CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E2 = Eyes.addOrReplaceChild("E2", CubeListBuilder.create().texOffs(32, 15).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E3 = Eyes.addOrReplaceChild("E3", CubeListBuilder.create().texOffs(20, 29).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition E4 = Eyes.addOrReplaceChild("E4", CubeListBuilder.create().texOffs(28, 10).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -4.01F));

		PartDefinition M1 = Mouth.addOrReplaceChild("M1", CubeListBuilder.create().texOffs(32, 27).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M2 = Mouth.addOrReplaceChild("M2", CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M3 = Mouth.addOrReplaceChild("M3", CubeListBuilder.create().texOffs(12, 2).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(simon_cool_sprunki entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}