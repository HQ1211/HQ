public class Test01{
	public static void main(String[] args) {
		int[] array=new int[5];
		array[0]=80;
		array[1]=70;
		array[2]=60;
		array[3]=74;
		array[4]=50;

		int sum=0;
        for(int i=0;i<5;i++){
        	sum+=array[i];
        }
        System.out.println((double)sum/5);
		
	}
}