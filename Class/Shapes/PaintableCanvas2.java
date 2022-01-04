//OLGA INGABIRE

import  algoritharium.*;

import java.awt.Color;

import java.util.Random;

import java.lang.Math;

//Important Notes
//Double click the algoritharium.jar file to load the gui
//Create a new picture, or load a picture
//Select Code -> Load and your DrBsPaintableCanvas.class file

//Eclipse should auto-compile every time you save your file

//Select Code -> Reload if you add methods, but otherwise, you probably shouldn't have to

public class PaintableCanvas2 {
/*
	/*
	 * When I coded this up, I had to think about there only being 1 single line.  That meant
	 * I needed to code it up different than before, where I had to repeat things for the entire image.
	 * 
	 * Also, I noticed that I could think about it like, draw to the right, interspersed with drawing down every 5
	 * 
	 * You can check for every 5 with (variable name)%5=0
	 * 
	 *
	public void steps ( ) {
		Image img = ImageViewer.getImage();
		
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		
		
		for(int i=0; i<numPixelsWide; i+=7){
			for(int h=i; h<(numPixelsHigh); h++){
				if(h<(i+6)){
					img.setPixelColor(i, h, Color.BLACK);
				}
				else if(h==(i+6)){
					for(i=i; i<h; i++){
						img.setPixelColor(i, h, Color.BLACK);
					}
				}

	     	}
		}
	
	}
	

	public void squares(){
		Image img = ImageViewer.getImage();
		
		
		int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		for(int i=0; i<(numPixelsWide); i++){
			for(int h=0; h<(numPixelsHigh); h++){
				img.setPixelColor(i, h, Color.BLACK);
			}
		}
		
		for(int i=30; i<(numPixelsWide-30); i++){
			for(int h=30; h<(numPixelsHigh-30); h++){
			    img.setPixelColor(i, h, Color.DARK_GRAY);
			}
	
        }
		
		for(int i=60; i<(numPixelsWide-60); i++){
			for(int h=60; h<(numPixelsHigh-60); h++){
			    img.setPixelColor(i, h, Color.LIGHT_GRAY);
			}
	
        }
		
	
		
	}

	public void boundaries(){
		Image img = ImageViewer.getImage();
		int BoundX= 50, BoundY=50;
		int x=10, y=10;
		
		//System.out.println("The coordinates of the horizontal line are:");
		/*for(int i=x; i <= BoundX; i++){
			//System.out.println("x= "+i+", y= "+y);
			img.setPixelColor(i, y, Color.BLACK);
		}
		
		//System.out.println("The coordinates of the vertical line are:");
		for(int j=y; j <= BoundY; j++){
			//System.out.println("x= "+x+", y= "+j);
			img.setPixelColor(x, j, Color.BLACK);
		}*
		
		//System.out.println("The coordinates of the Square are:");
		for(int i=x; i <= BoundX; i++){
		//	System.out.println("x= "+i+", y= "+y);
			img.setPixelColor(i, y, Color.BLACK);
		}
		
		for(int h=BoundX; h>= x; h--){
			//System.out.println("x= "+h+", y= "+BoundY);
			img.setPixelColor(h, BoundY, Color.BLACK);
		}
		
		for(int j=y; j < BoundY; j++){
			//System.out.println("x= "+x+", y= "+j);
			img.setPixelColor(x, j, Color.BLACK);
		}
		
		for(int k=BoundY; k >= y; k--){
			//System.out.println("x= "+BoundX+", y= "+k);
			img.setPixelColor(BoundX, k, Color.BLACK);
		}
		
		/*int numPixelsWide = img.getWidth();
		int numPixelsHigh = img.getHeight();
		int x= 50;
		int y= 50;
	
		for(int i=20; i<x; i++){
			img.setPixelColor(i, 20, Color.WHITE);
		}	
		
		for(int j=20; j<y; j++){
			img.setPixelColor(20, j, Color.WHITE);
		}
		
		for(int h=20; h<x; h++){
			img.setPixelColor(h, y, Color.WHITE);
		}
		for(int p=20; p<y; p++){
			img.setPixelColor(x, p, Color.WHITE);
		}
		
		
		int x1= numPixelsWide-65;
		int y1= numPixelsHigh-45;
		
		for(int i=60; i<x1; i++){
			img.setPixelColor(i, 60, Color.DARK_GRAY);
		}	
		
		for(int j=60; j<y1; j++){
			img.setPixelColor(60, j, Color.DARK_GRAY);
		}
		
		for(int h=60; h<x1; h++){
			img.setPixelColor(h, y1, Color.DARK_GRAY);
		}
		for(int p=60; p<y1; p++){
			img.setPixelColor(x1, p, Color.DARK_GRAY);
		}
		
	
		//img.setPixelColor(1, 1, );

		
	}
	
	public void random_Movement(){
		Image img = ImageViewer.getImage();
	
        int numPixelsWide = img.getWidth();
        int numPixelsHigh = img.getHeight();
		int rand_h, rand_w;

        Random rand = new Random();
		int count=0;
		do{
			rand_h = (int)(Math.random() * numPixelsHigh);
		    rand_w = (int)(Math.random() * numPixelsWide);
			int n1=0;
			while(n1<3 && rand_h<(numPixelsHigh-100) && rand_w<(numPixelsWide-100) && rand_h>0 && rand_w>0){
		    	img.setPixelColor((rand_w-1), rand_h, Color.DARK_GRAY);		
				img.setPixelColor(rand_w, rand_h, Color.DARK_GRAY);	
				img.setPixelColor((rand_w+1), rand_h, Color.DARK_GRAY);	
				n1++;
			}
			count++;
		} while(count<1000);


	}*/
	
}
