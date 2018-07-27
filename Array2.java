import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count,max,min,i;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
count=ja.nextInt();
int[]inputArray=new int[count];
for(i=0;i<count;i++){
	inputArray[i]=ja.nextInt();
}
max=inputArray[0];
for(i=1;i<count;i++){
	if(inputArray[i]>max){
		max=inputArray[i];
	}
}
	/*else if(inputArray[i]<max){
		min=inputArray[i];
	}
}*/
System.out.println("maximum no"+max);
//System.out.println("minimum no"+min);
	}

}
