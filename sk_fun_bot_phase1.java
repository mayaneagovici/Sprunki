// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class sk_fun_bot_phase1<T extends sk_fun_bot_phase1> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sk_fun_bot_phase1"), "main");
	private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Rightantina;
	private final ModelPart Leftantina;
	private final ModelPart Eyes;
	private final ModelPart Mouth;
	private final ModelPart M1;
	private final ModelPart M2;
	private final ModelPart M3;
	private final ModelPart M4;
	private final ModelPart M5;

	public sk_fun_bot_phase1(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Rightantina = this.Head.getChild("Rightantina");
		this.Leftantina = this.Head.getChild("Leftantina");
		this.Eyes = this.Head.getChild("Eyes");
		this.Mouth = this.Head.getChild("Mouth");
		this.M1 = this.Mouth.getChild("M1");
		this.M2 = this.Mouth.getChild("M2");
		this.M3 = this.Mouth.getChild("M3");
		this.M4 = this.Mouth.getChild("M4");
		this.M5 = this.Mouth.getChild("M5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(38, 0).addBox(-2.14F, -11.105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(31, 28).addBox(-2.6906F, -11.518F, -2.6906F, 5.3812F, 4.0359F, 5.3812F, new CubeDeformation(0.0F))
		.texOffs(16, 37).addBox(-2.3F, -8.3F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(0, 33).addBox(-2.553F, -8.553F, -2.553F, 5.106F, 3.106F, 5.106F, new CubeDeformation(0.0F))
		.texOffs(16, 23).addBox(-2.7076F, -4.664F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, -5.2363F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(32, 37).mirror().addBox(-2.1744F, -1.7559F, -2.1745F, 4.3489F, 3.5118F, 4.3489F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6381F, -9.2059F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r3 = Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(32, 37).addBox(-2.1745F, -1.7559F, -2.1745F, 4.3489F, 3.5118F, 4.3489F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6381F, -9.2059F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body_r4 = Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(36, 9).mirror().addBox(-2.1432F, -1.2306F, -2.1432F, 4.2863F, 2.4613F, 4.2863F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.725F, -6.7135F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Body_r5 = Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(36, 9).addBox(-2.1432F, -1.2306F, -2.1432F, 4.2863F, 2.4613F, 4.2863F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.725F, -6.7135F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r6 = Body.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, -5.2363F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(17, 15).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(-5.25F, -8.125F, -5.075F, 10.5F, 5.25F, 3.15F, new CubeDeformation(0.0F))
		.texOffs(28, 37).addBox(-2.0F, -3.0F, -4.01F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Rightantina = Head.addOrReplaceChild("Rightantina", CubeListBuilder.create().texOffs(0, 41).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -9.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -6.0F, -2.0F));

		PartDefinition Rightantina_r1 = Rightantina.addOrReplaceChild("Rightantina_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -2.6616F));

		PartDefinition Rightantina_r2 = Rightantina.addOrReplaceChild("Rightantina_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -2.3998F));

		PartDefinition Rightantina_r3 = Rightantina.addOrReplaceChild("Rightantina_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -1.9199F));

		PartDefinition Rightantina_r4 = Rightantina.addOrReplaceChild("Rightantina_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -1.4399F));

		PartDefinition Rightantina_r5 = Rightantina.addOrReplaceChild("Rightantina_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Rightantina_r6 = Rightantina.addOrReplaceChild("Rightantina_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, -0.5F, 0.0F, 0.0F, -0.48F));

		PartDefinition Leftantina = Head.addOrReplaceChild("Leftantina", CubeListBuilder.create().texOffs(0, 41).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(-0.5F, -9.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(4.5F, -6.0F, -2.0F));

		PartDefinition Leftantina_r1 = Leftantina.addOrReplaceChild("Leftantina_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 2.6616F));

		PartDefinition Leftantina_r2 = Leftantina.addOrReplaceChild("Leftantina_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 2.3998F));

		PartDefinition Leftantina_r3 = Leftantina.addOrReplaceChild("Leftantina_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 1.9199F));

		PartDefinition Leftantina_r4 = Leftantina.addOrReplaceChild("Leftantina_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 1.4399F));

		PartDefinition Leftantina_r5 = Leftantina.addOrReplaceChild("Leftantina_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition Leftantina_r6 = Leftantina.addOrReplaceChild("Leftantina_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.0F, -0.5F, 0.0F, 0.0F, 0.48F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(20, 8).addBox(-5.0F, -2.5F, -1.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -4.01F));

		PartDefinition M1 = Mouth.addOrReplaceChild("M1", CubeListBuilder.create().texOffs(15, 35).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.01F));

		PartDefinition M2 = Mouth.addOrReplaceChild("M2", CubeListBuilder.create().texOffs(15, 33).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.01F));

		PartDefinition M3 = Mouth.addOrReplaceChild("M3", CubeListBuilder.create().texOffs(31, 25).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.01F));

		PartDefinition M4 = Mouth.addOrReplaceChild("M4", CubeListBuilder.create().texOffs(31, 23).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.01F));

		PartDefinition M5 = Mouth.addOrReplaceChild("M5", CubeListBuilder.create().texOffs(20, 13).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.01F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(sk_fun_bot_phase1 entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}