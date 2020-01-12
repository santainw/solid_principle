package app.mse.imgAnaly;

public class ImageAnalytics {

	public String introduction() {
		subImage si = new subImage();
		si.testImag();
		return "Introduction";
	}
	
	private String imageReconition() {
		return "ImageReconition";
	}
	
	protected void arjanSun() {
		System.out.println("arJan");
	}
	
}

class subImage {
	public void testImag() {
		ImageAnalytics ia = new ImageAnalytics();
		ia.arjanSun();
	}
}
