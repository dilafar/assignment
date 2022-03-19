package graphic_service;



public class GraphicImpl implements Graphic{
	
	
	
	

	@Override
	public int calculateBill(int qty, int price) {
		 int sub = qty * price ;
		return sub;
	}

	@Override
	public void displayGraphic() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\t\tItem");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\t photo editing - flayers \t");
		System.out.println("\t\t\t\t2\t photo editing - Studio graphics \t");
		System.out.println("\t\t\t\t3\t Video Editing \t");
		System.out.println("\t\t\t\t4\t Logo Design\t");
		System.out.println("\t\t\t\t5\t 2D Animation Video Making\t");
		System.out.println("\t\t\t\t6\t 3D Animation Video Making\t");
		System.out.println("\t\t\t\t________________________________________");
	}

	@Override
	public void display2DAnimation() {
		System.out.println("\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\t1\t Animation Video - 2D - 2 minute \t"+Graphic.animation_video_2D_2_minute);
		System.out.println("\t\t\t\t2\t Animation Video - 2D - 4 minute \t"+Graphic.animation_video_2D_4_minute);
		System.out.println("\t\t\t\t3\t Animation Video - 2D - 8 minute\t"+Graphic.animation_video_2D_8_minute);
		System.out.println("\t\t\t\t4\t Animation Video - 2D - 10 minute\t"+Graphic.animation_video_2D_10_minute);
		System.out.println("\t\t\t\t_____________________________________________________");
	
		
	}

	@Override
	public void display3DAnimation() {
		System.out.println("\t\t\t\t_______________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t_______________________________________________________");
		System.out.println("\t\t\t\t1\t Animation Video - 3D - 2 minute \t"+Graphic.animation_video_3D_2_minute);
		System.out.println("\t\t\t\t2\t Animation Video - 3D - 4 minute \t"+Graphic.animation_video_3D_4_minute);
		System.out.println("\t\t\t\t3\t Animation Video - 3D - 8 minute\t"+Graphic.animation_video_3D_8_minute);
		System.out.println("\t\t\t\t4\t Animation Video - 3D - 10 minute\t"+Graphic.animation_video_3D_10_minute);
		System.out.println("\t\t\t\t_______________________________________________________");
	
		
	}

	@Override
	public void displayLogodesign() {
		System.out.println("\t\t\t\t______________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\tPrice");
		System.out.println("\t\t\t\t______________________________________________");
		System.out.println("\t\t\t\t1\t Logo Design - 2D   \t\t"+Graphic.logo_design_per_logo_2d);
		System.out.println("\t\t\t\t2\t Logo Design - 3D \t\t"+Graphic.logo_design_per_logo_3d);
		System.out.println("\t\t\t\t3\t Logo Design - simple grphics\t"+Graphic.logo_design_per_logo_simple_animation);
		System.out.println("\t\t\t\t______________________________________________");
		
	
	}

	@Override
	public void displayflayerdesign() {
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\tPrice");
		System.out.println("\t\t\t\t____________________________________________");
		System.out.println("\t\t\t\t1\t flayer - high graphics \t"+Graphic.photo_editing_high_grapics_flayer);
		System.out.println("\t\t\t\t2\t flayer - simple graphics \t"+Graphic.photo_editing_simple_grapics_flayer);
		System.out.println("\t\t\t\t3\t flayer - text edit \t\t"+Graphic.photo_editing_text_edit_flayer);
		System.out.println("\t\t\t\t____________________________________________");
		
		
	}

	@Override
	public void displayvideoediting() {
		System.out.println("\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t_____________________________________________________");
		System.out.println("\t\t\t\t1\t video editing with motion graphics \t"+Graphic.video_editing_motion_grapics);
		System.out.println("\t\t\t\t2\t video editing with simple graphics \t"+Graphic.video_editing_simple_grapics);
		System.out.println("\t\t\t\t_____________________________________________________");
		
		
	}

	@Override
	public void displaystudiograpicdesign() {
		System.out.println("\t\t\t\t_____________________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t_____________________________________________________________");
		System.out.println("\t\t\t\t1\t photo editing with re-touching \t\t"+Graphic.photo_editing_re_touching_studio_grapics);
		System.out.println("\t\t\t\t2\t photo editing with changing background \t"+Graphic.photo_editing_background_change);
		
		System.out.println("\t\t\t\t______________________________________________________________");
		
		
	}

	

}
