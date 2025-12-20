// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class vineria_horror<T extends vineria_horror> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "vineria_horror"), "main");
	private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Hairfront;
	private final ModelPart Hairback;
	private final ModelPart Eyes;
	private final ModelPart E1;
	private final ModelPart E2;
	private final ModelPart Mouth;

	public vineria_horror(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Hairfront = this.Head.getChild("Hairfront");
		this.Hairback = this.Head.getChild("Hairback");
		this.Eyes = this.Head.getChild("Eyes");
		this.E1 = this.Eyes.getChild("E1");
		this.E2 = this.Eyes.getChild("E2");
		this.Mouth = this.Head.getChild("Mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 8).addBox(-2.14F, -11.105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(36, 33).addBox(-2.3F, -8.3F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(19, 27).addBox(-2.7076F, -4.664F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(24, 12).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, -5.2363F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(24, 12).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, -5.2363F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-5.01F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).mirror().addBox(5.01F, -6.0F, -4.0F, 0.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(20, 29).addBox(0.0F, -1.5F, -4.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.086F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(20, 34).mirror().addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0711F, -9.7034F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(20, 34).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0711F, -9.7034F, 0.0F, 0.0F, 0.0F, 1.1781F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(34, 19).mirror().addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.7018F, -8.6138F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(34, 19).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7018F, -8.6138F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(20, 32).mirror().addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7093F, -6.9534F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(20, 32).addBox(0.0F, -1.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7093F, -6.9534F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(24, 12).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.725F, -15.5515F, -2.8F, 0.0F, 0.0F, 0.5672F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(16, 4).addBox(-0.595F, -1.785F, -0.595F, 1.19F, 3.57F, 1.19F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.802F, -13.7822F, -2.8F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(20, 12).addBox(-0.82F, -1.64F, -0.82F, 1.64F, 3.28F, 1.64F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0261F, -11.8191F, -2.8F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.342F, -9.9397F, -2.8F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Hairfront = Head.addOrReplaceChild("Hairfront", CubeListBuilder.create().texOffs(20, 0).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -4.02F));

		PartDefinition Hairback = Head.addOrReplaceChild("Hairback", CubeListBuilder.create().texOffs(0, 18).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 4.02F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(0, 37).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition E1 = Eyes.addOrReplaceChild("E1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition E1_r1 = E1.addOrReplaceChild("E1_r1", CubeListBuilder.create().texOffs(40, 15).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3521F, -6.8728F, -2.8605F, 0.0624F, 0.5097F, -0.3481F));

		PartDefinition E1_r2 = E1.addOrReplaceChild("E1_r2", CubeListBuilder.create().texOffs(12, 4).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8217F, -4.6808F, -2.3557F, -0.0418F, 0.2485F, -0.6595F));

		PartDefinition E1_r3 = E1.addOrReplaceChild("E1_r3", CubeListBuilder.create().texOffs(12, 4).addBox(-0.72F, -1.66F, -0.72F, 1.44F, 3.32F, 1.44F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6408F, -2.734F, -2.1105F, 0.3712F, 0.1313F, -0.3244F));

		PartDefinition E1_r4 = E1.addOrReplaceChild("E1_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0171F, -0.3512F, -0.2135F, 0.829F, 0.0F, 0.0F));

		PartDefinition E2 = Eyes.addOrReplaceChild("E2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3346F, -3.7921F, -2.0179F, 0.0F, -0.3054F, -0.2618F));

		PartDefinition E2_r1 = E2.addOrReplaceChild("E2_r1", CubeListBuilder.create().texOffs(40, 15).mirror().addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4571F, -3.063F, -1.2788F, -0.3303F, -0.5097F, 0.3481F));

		PartDefinition E2_r2 = E2.addOrReplaceChild("E2_r2", CubeListBuilder.create().texOffs(12, 4).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1942F, -1.0046F, -0.5087F, 0.1398F, -0.2103F, -0.1023F));

		PartDefinition E2_r3 = E2.addOrReplaceChild("E2_r3", CubeListBuilder.create().texOffs(12, 4).mirror().addBox(-0.72F, -1.66F, -0.72F, 1.44F, 3.32F, 1.44F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0138F, 0.8423F, -0.0547F, 0.3712F, -0.1313F, 0.3244F));

		PartDefinition E2_r4 = E2.addOrReplaceChild("E2_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6375F, 3.2251F, 1.8422F, 0.829F, 0.0F, 0.0F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(40, 21).addBox(-3.0F, -2.0F, 0.0F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -4.01F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(vineria_horror entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}