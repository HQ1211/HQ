public class Test03{
	public static void main(String[] args){
		int a[][]=new int[9][];
		for(int i=0;i<a.length;i++){
			a[i]=new int[i+1];
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
		        a[i][j]=(i+1)*(j+1);
		    }
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print((j+1)+"*"+(i+1)+"="+a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}