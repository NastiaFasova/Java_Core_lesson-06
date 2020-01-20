package ua.lviv.lgs;

public class Application {
		public static void main(String []args){
			byte a = 1;
			short b = 2;
			int c = 3;
			long d = 4l;
			float f = 5.0f;
			double e = 6.0;
			char g = 'n';
			boolean o = true;
			
			
			System.out.println(" Max Byte = "+Byte.MAX_VALUE);
			System.out.println(" Min Byte = "+Byte.MIN_VALUE);
			System.out.println(" Max Short = "+Short.MAX_VALUE);
			System.out.println(" Min Short = "+Short.MIN_VALUE);
			System.out.println(" Max Int = "+Integer.MAX_VALUE);
			System.out.println(" Min Int = "+Integer.MIN_VALUE);
			System.out.println(" Max Long = "+Long.MAX_VALUE);
			System.out.println(" Min Long = "+Long.MIN_VALUE);
			System.out.println(" Max Character = "+Character.MAX_VALUE);
			System.out.println(" Min Character = "+Character.MIN_VALUE);
			//System.out.println(" Max Boolean = "+Boolean.MAX_VALUE);
			//System.out.println(" Min Boolean = "+Boolean.MIN_VALUE);
			
			
			int []array=new int[10];
			for (int i = 0; i < array.length; i++) {
				array[i]=(int)(Math.random()*200 - 100); //[-100;100]
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println("");
			int max=array[0],min=array[0];
			for (int i = 0; i < array.length; i++) {
				if(array[i]>max)
					max=array[i];
				if(array[i]<min)
					min=array[i];
			}
			System.out.println("Max value: "+max);
			System.out.println("Min value: "+min);
		}
}
