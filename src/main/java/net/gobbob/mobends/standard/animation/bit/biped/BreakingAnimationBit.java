package net.gobbob.mobends.standard.animation.bit.biped;

import net.gobbob.mobends.core.animation.bit.KeyframeAnimationBit;
import net.gobbob.mobends.core.animation.keyframe.AnimationLoader;
import net.gobbob.mobends.standard.data.BipedEntityData;

public class BreakingAnimationBit extends KeyframeAnimationBit<BipedEntityData<?>>
{
	private static final String[] ACTIONS = new String[] { "breaking" };
	
	@Override
	public String[] getActions(BipedEntityData<?> entityData)
	{
		return ACTIONS;
	}
	
	public BreakingAnimationBit(float animationSpeed)
	{
		super(AnimationLoader.loadFromString(ANIMATION_JSON), animationSpeed);
		this.performedAnimation.mirrorRotationYZ("body");
	}
	
	@Override
	public void perform(BipedEntityData<?> data)
	{
		super.perform(data);
		
		data.centerRotation.setSmoothness(.3F).orientZero();
		data.body.rotation.rotateX(data.headPitch.get() * 0.5F).finish();
		data.head.rotation.rotateX(-data.headPitch.get() * 0.5F);
	}
	
	public static final String ANIMATION_JSON = "{\r\n" + 
			"	\"meta\": \"Exported with Blender 2.79 (sub 0)\",\r\n" + 
			"	\"armatures\": [\r\n" + 
			"		{\r\n" + 
			"			\"name\": \"Armature\",\r\n" + 
			"			\"bones\": {\r\n" + 
			"				\"leftLeg\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.102612, -0.049923, -0.035586, 0.992830]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.144162, -0.048711, -0.038187, 0.987616]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.224912, -0.046195, -0.043659, 0.972304]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.292934, -0.043775, -0.048697, 0.953888]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.325613, -0.042424, -0.051130, 0.943166]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.337878, -0.041786, -0.051767, 0.938836]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.345870, -0.041267, -0.051903, 0.935936]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.349280, -0.040975, -0.051750, 0.934691]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.349933, -0.040895, -0.051652, 0.934455]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.343465, -0.041187, -0.051184, 0.936865]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.323770, -0.042052, -0.049778, 0.943889]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.291342, -0.043400, -0.047518, 0.954452]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.248637, -0.045051, -0.044643, 0.966518]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.200448, -0.046770, -0.041528, 0.977706]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.153580, -0.048327, -0.038621, 0.986198]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.117050, -0.049479, -0.036433, 0.991223]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.102612, -0.049923, -0.035586, 0.992830]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"leftArm\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.869477, 0.345358, 0.086309, 0.342477]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.821519, 0.332991, 0.082201, 0.407440]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.694476, 0.300527, 0.071458, 0.578317]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.563121, 0.267752, 0.060714, 0.751763]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.504278, 0.254601, 0.056607, 0.823213]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.493134, 0.253798, 0.057025, 0.829853]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.486547, 0.253324, 0.058395, 0.833778]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.484273, 0.253161, 0.060510, 0.835134]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.484014, 0.253142, 0.062811, 0.835288]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.497391, 0.256342, 0.065481, 0.818186]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.537318, 0.265894, 0.068946, 0.767140]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.600175, 0.280932, 0.072988, 0.686777]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.676745, 0.299250, 0.077188, 0.588882]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.753316, 0.317568, 0.081001, 0.490988]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.816173, 0.332606, 0.083939, 0.410625]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.856100, 0.342158, 0.085727, 0.359579]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.172339, 0.881320, -0.471397],\r\n" + 
			"							\"rotation\": [-0.869477, 0.345358, 0.086309, 0.342477]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"rightArm\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.841517, -0.022627, -0.120180, 0.526209]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.791634, -0.049908, -0.118073, 0.569999]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.659500, -0.121269, -0.112561, 0.685412]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.522903, -0.192630, -0.107048, 0.803171]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.461752, -0.219911, -0.104941, 0.852885]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.450216, -0.219877, -0.105427, 0.858949]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.443398, -0.219582, -0.106858, 0.862534]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.441044, -0.218727, -0.108717, 0.863771]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.440776, -0.217281, -0.110282, 0.863912]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.454683, -0.209135, -0.111689, 0.852193]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.496192, -0.188198, -0.113305, 0.817213]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.561541, -0.156298, -0.115040, 0.762144]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.641147, -0.117982, -0.116738, 0.695061]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.720752, -0.079956, -0.118214, 0.627977]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.786101, -0.048884, -0.119316, 0.572908]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.827610, -0.029207, -0.119971, 0.537928]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.182340, 0.884528, -0.432960],\r\n" + 
			"							\"rotation\": [-0.841517, -0.022627, -0.120180, 0.526209]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"leftForeLeg\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.047817, -0.000000, -0.000000, 0.998856]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.125654, 0.000000, -0.000000, 0.992074]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.268203, 0.000000, -0.000001, 0.963362]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.377184, -0.000000, -0.000001, 0.926138]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.423813, 0.000000, -0.000001, 0.905750]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.436996, -0.000000, -0.000000, 0.899464]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.442022, -0.000000, -0.000000, 0.897004]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.441542, -0.000000, -0.000000, 0.897241]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.440585, -0.000000, 0.000000, 0.897711]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.432086, -0.000000, 0.000000, 0.901832]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.405579, -0.000000, 0.000000, 0.914060]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.359911, -0.000000, 0.000001, 0.932987]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.296022, -0.000000, 0.000000, 0.955181]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.219016, -0.000000, 0.000001, 0.975721]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.139383, -0.000000, 0.000001, 0.990239]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.074261, 0.000000, -0.000000, 0.997239]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.047817, -0.000000, -0.000000, 0.998856]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"rightLeg\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.010872, 0.089057, 0.037440, 0.995263]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.036110, 0.088401, 0.040432, 0.994609]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.093442, 0.086721, 0.047652, 0.990695]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.145613, 0.084880, 0.054767, 0.984171]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.172009, 0.083727, 0.058297, 0.979798]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.183907, 0.083000, 0.059263, 0.977639]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.193535, 0.082270, 0.059517, 0.975825]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.199078, 0.081772, 0.059339, 0.974762]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.200617, 0.081615, 0.059211, 0.974467]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.195243, 0.081882, 0.058529, 0.975577]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.178914, 0.082670, 0.056486, 0.978757]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.152182, 0.083886, 0.053233, 0.983346]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.117446, 0.085340, 0.049153, 0.988184]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.079385, 0.086788, 0.044846, 0.992046]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.044472, 0.087994, 0.041023, 0.994282]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.019753, 0.088785, 0.038379, 0.995115]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.010872, 0.089057, 0.037440, 0.995263]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"leftForeArm\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.085857, -0.000000, -0.000000, 0.996307]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.087720, -0.000000, -0.000000, 0.996096]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.093281, -0.000000, -0.000000, 0.995465]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.102035, -0.000000, -0.000000, 0.994472]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.112698, -0.000000, -0.000000, 0.993262]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.123362, -0.000000, -0.000000, 0.992052]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.132116, -0.000000, -0.000000, 0.991059]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.137676, -0.000000, -0.000000, 0.990428]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.139539, 0.000000, -0.000000, 0.990217]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.137676, 0.000000, -0.000000, 0.990428]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.132116, 0.000000, -0.000000, 0.991059]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.123362, 0.000000, -0.000000, 0.992052]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.112698, 0.000000, -0.000000, 0.993262]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.102035, 0.000000, -0.000000, 0.994472]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.093281, 0.000000, -0.000000, 0.995465]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.087720, 0.000000, -0.000000, 0.996096]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.085857, -0.000000, -0.000000, 0.996307]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"root\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.605677, -0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.860245, -0.013329, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-1.546600, -0.054854, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.288192, -0.114350, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.682200, -0.173045, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.824952, -0.243705, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.909322, -0.334497, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.938456, -0.407319, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.941768, -0.432613, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.860701, -0.417600, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.618723, -0.372789, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-2.237776, -0.302243, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-1.773722, -0.216306, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-1.309669, -0.130370, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.928722, -0.059824, -0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.686743, -0.015013, 0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [-0.605677, -0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.000000, 0.000000, 0.000000, 1.000000]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"body\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.054911, -0.242208, -0.013731, 0.968572]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.015150, -0.208715, -0.011832, 0.969125]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.088854, -0.121104, -0.006866, 0.970570]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.192858, -0.033494, -0.001899, 0.972016]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.232619, 0.000000, 0.000000, 0.972568]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.228199, -0.003723, -0.000211, 0.972507]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.214857, -0.014962, -0.000848, 0.972321]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.192858, -0.033494, -0.001899, 0.972016]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.163165, -0.058506, -0.003317, 0.971603]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.127608, -0.088459, -0.005015, 0.971109]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.088854, -0.121104, -0.006866, 0.970570]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.050100, -0.153750, -0.008716, 0.970032]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.014543, -0.183702, -0.010414, 0.969537]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.015150, -0.208715, -0.011832, 0.969125]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.037149, -0.227246, -0.012883, 0.968819]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.050491, -0.238485, -0.013520, 0.968634]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.054911, -0.242208, -0.013731, 0.968572]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"rightForeArm\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.332886, -0.000000, 0.000000, 0.942967]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.329633, -0.000000, 0.000000, 0.943939]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.319924, -0.000000, 0.000000, 0.946841]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.304639, -0.000000, 0.000000, 0.951410]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.286019, -0.000000, 0.000000, 0.956975]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.267399, -0.000000, 0.000000, 0.962540]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.252114, -0.000000, 0.000000, 0.967108]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.242405, -0.000000, 0.000000, 0.970010]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.239152, -0.000000, -0.000000, 0.970982]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.242405, -0.000000, -0.000000, 0.970010]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.252114, -0.000000, -0.000000, 0.967108]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.267399, -0.000000, -0.000000, 0.962540]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.286019, -0.000000, -0.000000, 0.956975]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.304639, -0.000000, -0.000000, 0.951410]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.319924, -0.000000, -0.000000, 0.946841]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.329633, -0.000000, -0.000000, 0.943939]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [-0.332886, -0.000000, 0.000000, 0.942967]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				},\r\n" + 
			"				\"rightForeLeg\": {\r\n" + 
			"					\"keyframes\": [\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.221299, -0.000000, 0.000001, 0.975206]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.271510, 0.000000, 0.000000, 0.962436]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.382351, -0.000000, 0.000001, 0.924017]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.477691, -0.000000, 0.000001, 0.878528]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.521562, -0.000000, 0.000001, 0.853213]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.536614, -0.000000, 0.000001, 0.843828]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.545323, -0.000000, 0.000001, 0.838226]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.548283, 0.000000, 0.000000, 0.836293]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.548612, -0.000000, 0.000001, 0.836077]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.540424, -0.000000, 0.000001, 0.841393]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.515100, -0.000000, 0.000001, 0.857130]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.472255, -0.000000, 0.000001, 0.881462]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.414164, -0.000000, 0.000001, 0.910202]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.347636, -0.000000, 0.000000, 0.937630]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.284232, -0.000000, 0.000000, 0.958755]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.238103, -0.000000, 0.000000, 0.971240]\r\n" + 
			"						},\r\n" + 
			"						{\r\n" + 
			"							\"position\": [0.000000, 0.000000, 0.000000],\r\n" + 
			"							\"rotation\": [0.221299, -0.000000, 0.000001, 0.975206]\r\n" + 
			"						}\r\n" + 
			"					]\r\n" + 
			"				}\r\n" + 
			"			}\r\n" + 
			"		}\r\n" + 
			"	]\r\n" + 
			"}\r\n";
}