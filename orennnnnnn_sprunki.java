// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class orennnnnnn_sprunki<T extends orennnnnnn_sprunki> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "orennnnnnn_sprunki"), "main");
	private final ModelPart Root;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart Right_antina;
	private final ModelPart Left_antina;
	private final ModelPart Eyebrows;
	private final ModelPart Eyes;
	private final ModelPart Mouth;
	private final ModelPart M1;
	private final ModelPart M2;
	private final ModelPart M3;

	public orennnnnnn_sprunki(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Body = this.Root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.Right_antina = this.Head.getChild("Right_antina");
		this.Left_antina = this.Head.getChild("Left_antina");
		this.Eyebrows = this.Head.getChild("Eyebrows");
		this.Eyes = this.Head.getChild("Eyes");
		this.Mouth = this.Head.getChild("Mouth");
		this.M1 = this.Mouth.getChild("M1");
		this.M2 = this.Mouth.getChild("M2");
		this.M3 = this.Mouth.getChild("M3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 26).addBox(-2.14F, -5.5105F, -2.14F, 4.28F, 3.21F, 4.28F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-2.3F, -2.7055F, -2.3F, 4.6F, 4.6F, 4.6F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(-2.7076F, 0.9305F, -2.7076F, 5.4151F, 5.3279F, 5.4151F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5945F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(16, 14).mirror().addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Body_r2 = Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(16, 14).addBox(-2.0F, -5.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9855F, 0.3582F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 31).addBox(-7.5F, -7.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-8.0F, -6.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).mirror().addBox(7.0F, -6.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).mirror().addBox(5.5F, -7.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-5.5F, -7.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 31).mirror().addBox(4.5F, -7.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 10).addBox(-6.5F, -9.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 10).mirror().addBox(5.5F, -9.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 29).addBox(-3.0F, -12.3F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 4).addBox(-2.0F, -10.0F, -4.02F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.4055F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(12, 18).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8191F, -11.0226F, 0.0F, 0.0F, 0.0F, -1.0036F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(12, 18).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8191F, -11.0226F, 0.0F, 0.0F, 0.0F, 1.0036F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(24, 10).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5168F, -9.5324F, 0.0F, 0.0F, 0.0F, -0.6109F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(24, 10).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5168F, -9.5324F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -2.6616F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -2.3998F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -1.9199F, 0.0F, 0.0F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -1.4399F, 0.0F, 0.0F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(16, 31).mirror().addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 31).addBox(-14.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -5.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -2.7489F, 0.0F, 0.0F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).mirror().addBox(2.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 18).addBox(-13.0F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -1.9635F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(22, 31).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 31).addBox(-10.5F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 18).addBox(-15.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -5.0F, 0.0F, -2.4871F, 0.0F, 0.0F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 18).addBox(-15.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -5.0F, 0.0F, -1.309F, 0.0F, 0.0F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(0, 18).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 18).addBox(-15.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -5.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.9635F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Head_r25 = Head.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

		PartDefinition Head_r26 = Head.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Head_r27 = Head.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Right_antina = Head.addOrReplaceChild("Right_antina", CubeListBuilder.create(), PartPose.offset(-3.5F, -8.5F, 1.5F));

		PartDefinition Right_antina_r1 = Right_antina.addOrReplaceChild("Right_antina_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition Right_antina_r2 = Right_antina.addOrReplaceChild("Right_antina_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -2.7489F));

		PartDefinition Right_antina_r3 = Right_antina.addOrReplaceChild("Right_antina_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -2.2689F));

		PartDefinition Right_antina_r4 = Right_antina.addOrReplaceChild("Right_antina_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -1.789F));

		PartDefinition Right_antina_r5 = Right_antina.addOrReplaceChild("Right_antina_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -1.309F));

		PartDefinition Right_antina_r6 = Right_antina.addOrReplaceChild("Right_antina_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition Right_antina_r7 = Right_antina.addOrReplaceChild("Right_antina_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Right_antina_r8 = Right_antina.addOrReplaceChild("Right_antina_r8", CubeListBuilder.create().texOffs(26, 31).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.513F, -1.4095F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition Left_antina = Head.addOrReplaceChild("Left_antina", CubeListBuilder.create(), PartPose.offset(3.5F, -8.5F, 1.5F));

		PartDefinition Left_antina_r1 = Left_antina.addOrReplaceChild("Left_antina_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition Left_antina_r2 = Left_antina.addOrReplaceChild("Left_antina_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 2.7489F));

		PartDefinition Left_antina_r3 = Left_antina.addOrReplaceChild("Left_antina_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 2.2689F));

		PartDefinition Left_antina_r4 = Left_antina.addOrReplaceChild("Left_antina_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 1.789F));

		PartDefinition Left_antina_r5 = Left_antina.addOrReplaceChild("Left_antina_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 1.309F));

		PartDefinition Left_antina_r6 = Left_antina.addOrReplaceChild("Left_antina_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition Left_antina_r7 = Left_antina.addOrReplaceChild("Left_antina_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8811F, -5.1683F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Left_antina_r8 = Left_antina.addOrReplaceChild("Left_antina_r8", CubeListBuilder.create().texOffs(26, 31).mirror().addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.513F, -1.4095F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition Eyebrows = Head.addOrReplaceChild("Eyebrows", CubeListBuilder.create().texOffs(28, 15).addBox(-4.0F, -1.5F, 0.0F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.15F, -4.01F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create().texOffs(28, 10).addBox(-5.0F, -2.5F, 0.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, -4.01F));

		PartDefinition Mouth = Head.addOrReplaceChild("Mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -4.01F));

		PartDefinition M1 = Mouth.addOrReplaceChild("M1", CubeListBuilder.create().texOffs(30, 29).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M2 = Mouth.addOrReplaceChild("M2", CubeListBuilder.create().texOffs(12, 2).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition M3 = Mouth.addOrReplaceChild("M3", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(orennnnnnn_sprunki entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}