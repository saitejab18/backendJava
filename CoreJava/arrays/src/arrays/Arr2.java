package arrays;

public class Arr2 {

	public static void main(String[] args) {
       int a[] = {1,2,3,4,5};
       for(int i=0;i<a.length;i++) {
       	System.out.println(a[i]);
       }
       System.out.println();
       for(int j=0;j<5;j++) {
    	   System.out.println(a[j]);
       }
       System.out.println();
       for(int k=a.length-1;k>=0;k--) {
    	   System.out.println(a[k]);
       }
       
	}

}
