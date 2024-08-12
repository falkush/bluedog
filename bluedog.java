package bluedog;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;


public class bluedog {
	public static void main(String args[]) throws AWTException, InterruptedException
	{
		int[][][] pos = new int[100][5][5];

		//almost
		pos[0][0]=new int[] {725,492,231,230,228};
		pos[0][1]=new int[] {730,477,106,103,98};
		pos[0][2]=new int[] {715,482,90,89,87};
		pos[0][3]=new int[] {711,471,46,38,14};
		pos[0][4]=new int[] {710,478,151,148,142};
		
		//bad choice
		pos[1][0]=new int[] {715,505,131,125,112};
		pos[1][1]=new int[] {722,523,24,22,15};
		pos[1][2]=new int[] {727,517,235,234,233};
		pos[1][3]=new int[] {717,503,67,56,32};
		pos[1][4]=new int[] {726,503,74,64,42};
		
		//1st place
		pos[2][0]=new int[] {715,483,227,226,225};
		pos[2][1]=new int[] {711,485,71,63,49};
		pos[2][2]=new int[] {735,477,82,76,67};
		pos[2][3]=new int[] {724,473,174,169,162};
		pos[2][4]=new int[] {715,490,130,124,115};
		
		//second place
		pos[3][0]=new int[] {721,496,40,32,18};
		pos[3][1]=new int[] {711,493,231,230,228};
		pos[3][2]=new int[] {712,495,223,222,220};
		pos[3][3]=new int[] {719,503,101,98,93};
		pos[3][4]=new int[] {728,498,64,55,40};

		
		Color color;
		
		int cr,cg,cb,i,nf=0;
		final Robot robot = new Robot();
   
	    while(true)
	    {
	    	for(i=0;i<5;i++)
	    	{
	    		color = robot.getPixelColor(pos[0][i][0], pos[0][i][1]);
	    		cr=color.getRed();
	    		cg=color.getGreen();
	    		cb=color.getBlue();
	    		if(compare(cr,cg,cb,pos[0][i][2],pos[0][i][3],pos[0][i][4])) i=6;
	    	}
	    	if(i==5)
	    	{
	    		System.out.println(nf + ":almost");
	    		nf++;
	    		Thread.sleep(8000);
	    	}
	    	
	    	for(i=0;i<5;i++)
	    	{
	    		color = robot.getPixelColor(pos[1][i][0], pos[1][i][1]);
	    		cr=color.getRed();
	    		cg=color.getGreen();
	    		cb=color.getBlue();
	    		if(compare(cr,cg,cb,pos[1][i][2],pos[1][i][3],pos[1][i][4])) i=6;
	    	}
	    	if(i==5)
	    	{
	    		System.out.println(nf + ":bad");
	    		nf++;
	    		Thread.sleep(8000);
	    	}
	    	
	    	for(i=0;i<5;i++)
	    	{
	    		color = robot.getPixelColor(pos[2][i][0], pos[2][i][1]);
	    		cr=color.getRed();
	    		cg=color.getGreen();
	    		cb=color.getBlue();
	    		if(compare(cr,cg,cb,pos[2][i][2],pos[2][i][3],pos[2][i][4])) i=6;
	    	}
	    	if(i==5)
	    	{
	    		System.out.println(nf + ":WIN!!!!!");
	    		System.exit(0);
	    	}
	    	
	    	for(i=0;i<5;i++)
	    	{
	    		color = robot.getPixelColor(pos[3][i][0], pos[3][i][1]);
	    		cr=color.getRed();
	    		cg=color.getGreen();
	    		cb=color.getBlue();
	    		if(compare(cr,cg,cb,pos[3][i][2],pos[3][i][3],pos[3][i][4])) i=6;
	    	}
	    	if(i==5)
	    	{
	    		System.out.println(nf + ":second");
	    		nf++;
	    		Thread.sleep(8000);
	    	}
	    	
	    	Thread.sleep(1);
	    }
	    
    }
	
	public static boolean compare(int a, int b, int c, int d, int e, int f) //return true if different
	{
		if(Math.abs(a-d)>10) return true;
		else if(Math.abs(b-e)>10) return true;
		else if(Math.abs(c-f)>10) return true;
		return false;
	}
}
