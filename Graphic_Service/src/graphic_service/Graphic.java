package graphic_service;

public interface Graphic {
	
	public int photo_editing_high_grapics_flayer = 50;
	public int photo_editing_simple_grapics_flayer = 20;
	public int photo_editing_text_edit_flayer = 30;
	public int photo_editing_re_touching_studio_grapics= 40;
	public int photo_editing_background_change = 100;
	public int video_editing_motion_grapics = 100;
	public int video_editing_simple_grapics = 50;
	public int logo_design_per_logo_2d = 30;
	public int logo_design_per_logo_3d = 50;
	public int logo_design_per_logo_simple_animation = 30;
	
	public int animation_video_2D_2_minute = 1000;
	public int animation_video_2D_4_minute = 2000;
	public int animation_video_2D_8_minute = 3000;
	public int animation_video_2D_10_minute = 5000;
	
	public int animation_video_3D_2_minute = 2000;
	public int animation_video_3D_4_minute = 4000;
	public int animation_video_3D_8_minute = 6000;
	public int animation_video_3D_10_minute = 10000;
	
	
	public int calculateBill(int qty , int price);
	
	public void displayGraphic();
	
	public void display2DAnimation();
	public void display3DAnimation();
	public void displayLogodesign();
	public void displayflayerdesign();
	public void displayvideoediting();
	public void displaystudiograpicdesign();
	
	

}
