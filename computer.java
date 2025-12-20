// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class computer<T extends computer> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "computer"), "main");
	private final ModelPart Root;
	private final ModelPart Table;
	private final ModelPart Computer;
	private final ModelPart Screen;
	private final ModelPart F1;
	private final ModelPart F2;
	private final ModelPart F3;
	private final ModelPart N1;
	private final ModelPart N2;
	private final ModelPart N3;
	private final ModelPart Hello;
	private final ModelPart Would;
	private final ModelPart You;
	private final ModelPart Like;
	private final ModelPart To;
	private final ModelPart Have;
	private final ModelPart Some;
	private final ModelPart Fun;
	private final ModelPart Come;
	private final ModelPart On;
	private final ModelPart Time;

	public computer(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Table = this.Root.getChild("Table");
		this.Computer = this.Table.getChild("Computer");
		this.Screen = this.Computer.getChild("Screen");
		this.F1 = this.Screen.getChild("F1");
		this.F2 = this.Screen.getChild("F2");
		this.F3 = this.Screen.getChild("F3");
		this.N1 = this.Screen.getChild("N1");
		this.N2 = this.N1.getChild("N2");
		this.N3 = this.N1.getChild("N3");
		this.Hello = this.Screen.getChild("Hello");
		this.Would = this.Screen.getChild("Would");
		this.You = this.Would.getChild("You");
		this.Like = this.Would.getChild("Like");
		this.To = this.Would.getChild("To");
		this.Have = this.Would.getChild("Have");
		this.Some = this.Screen.getChild("Some");
		this.Fun = this.Screen.getChild("Fun");
		this.Come = this.Screen.getChild("Come");
		this.On = this.Come.getChild("On");
		this.Time = this.Screen.getChild("Time");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Table = Root.addOrReplaceChild("Table", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).mirror().addBox(5.0F, -14.0F, -7.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(5.0F, -14.0F, 5.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-7.0F, -14.0F, 5.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Computer = Table.addOrReplaceChild("Computer", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-6.0F, -30.0F, -4.0F, 12.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(42, 26).addBox(-6.0F, -30.0F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 26).addBox(-6.0F, -21.0F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(-6.0F, -29.0F, -5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(5.0F, -29.0F, -5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 40).addBox(-5.0F, -29.0F, -4.5F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 18).addBox(0.0F, -16.0866F, 8.6184F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Computer_r1 = Computer.addOrReplaceChild("Computer_r1", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.26F, -4.5158F, 8.6184F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Computer_r2 = Computer.addOrReplaceChild("Computer_r2", CubeListBuilder.create().texOffs(3, 0).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -17.0424F, 6.3093F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Computer_r3 = Computer.addOrReplaceChild("Computer_r3", CubeListBuilder.create().texOffs(42, 28).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(12, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 18).addBox(-3.5F, 2.5F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(34, 29).addBox(-4.0F, 3.5F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -36.5F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Computer_r4 = Computer.addOrReplaceChild("Computer_r4", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3646F, -30.4036F, -7.6454F, 0.0894F, 0.3829F, 0.2355F));

		PartDefinition Computer_r5 = Computer.addOrReplaceChild("Computer_r5", CubeListBuilder.create().texOffs(38, 49).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9074F, -30.3728F, -5.4616F, -0.1239F, 0.3736F, -0.3289F));

		PartDefinition Computer_r6 = Computer.addOrReplaceChild("Computer_r6", CubeListBuilder.create().texOffs(20, 49).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2961F, -30.5F, -6.5433F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Computer_r7 = Computer.addOrReplaceChild("Computer_r7", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9096F, -21.2132F, -4.5F, 0.0F, 0.0F, 0.9599F));

		PartDefinition Computer_r8 = Computer.addOrReplaceChild("Computer_r8", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9096F, -21.2132F, -4.5F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Computer_r9 = Computer.addOrReplaceChild("Computer_r9", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9096F, -28.7868F, -4.5F, 0.0F, 0.0F, 0.9599F));

		PartDefinition Computer_r10 = Computer.addOrReplaceChild("Computer_r10", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9096F, -28.7868F, -4.5F, 0.0F, 0.0F, -0.9599F));

		PartDefinition Computer_r11 = Computer.addOrReplaceChild("Computer_r11", CubeListBuilder.create().texOffs(48, 8).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.634F, 4.366F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Computer_r12 = Computer.addOrReplaceChild("Computer_r12", CubeListBuilder.create().texOffs(48, 8).addBox(-4.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.634F, -4.366F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Computer_r13 = Computer.addOrReplaceChild("Computer_r13", CubeListBuilder.create().texOffs(46, 41).mirror().addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.366F, -16.634F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Computer_r14 = Computer.addOrReplaceChild("Computer_r14", CubeListBuilder.create().texOffs(46, 41).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.366F, -16.634F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition Screen = Computer.addOrReplaceChild("Screen", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition F1 = Screen.addOrReplaceChild("F1", CubeListBuilder.create().texOffs(48, 0).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition F2 = Screen.addOrReplaceChild("F2", CubeListBuilder.create().texOffs(68, 0).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition F3 = Screen.addOrReplaceChild("F3", CubeListBuilder.create().texOffs(68, 8).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition N1 = Screen.addOrReplaceChild("N1", CubeListBuilder.create().texOffs(12, 62).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition N2 = N1.addOrReplaceChild("N2", CubeListBuilder.create().texOffs(20, 62).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.5F, 0.0F));

		PartDefinition N3 = N1.addOrReplaceChild("N3", CubeListBuilder.create().texOffs(20, 62).addBox(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -1.5F, 0.0F));

		PartDefinition Hello = Screen.addOrReplaceChild("Hello", CubeListBuilder.create().texOffs(0, 47).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition Would = Screen.addOrReplaceChild("Would", CubeListBuilder.create().texOffs(0, 56).addBox(-5.0F, -3.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition You = Would.addOrReplaceChild("You", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -2.0F, 0.0F));

		PartDefinition Like = Would.addOrReplaceChild("Like", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition To = Would.addOrReplaceChild("To", CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition Have = Would.addOrReplaceChild("Have", CubeListBuilder.create().texOffs(0, 64).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition Some = Screen.addOrReplaceChild("Some", CubeListBuilder.create().texOffs(0, 66).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -27.0F, -4.51F));

		PartDefinition Fun = Screen.addOrReplaceChild("Fun", CubeListBuilder.create().texOffs(12, 56).addBox(-4.5F, -2.0F, 0.0F, 9.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, -4.51F));

		PartDefinition Come = Screen.addOrReplaceChild("Come", CubeListBuilder.create().texOffs(0, 68).addBox(-5.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -4.51F));

		PartDefinition On = Come.addOrReplaceChild("On", CubeListBuilder.create().texOffs(0, 70).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition Time = Screen.addOrReplaceChild("Time", CubeListBuilder.create().texOffs(12, 60).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.0F, -4.51F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(computer entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}