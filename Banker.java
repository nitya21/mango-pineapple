import java.util.*;

public class Banker{
int max[][]=new int[10][10];
int alloc[][]=new int[10][10];
int avail[][]=new int[10][10];
int need[][]=new int[10][10];

int p,r,flag;
public static void main(String args[]){
Banker obj=new Banker();
Scanner sc=new Scanner(System.in);
System.out.println("enter number of processes/n");
p=sc.nextInt();
System.out.println("enter no of resources/n");
r=sc.nextInt();
System.out.println("enter the max matrix/n");
for(int i=0;i<p;i++){
	for(int j=0;j<r;j++)
	{
		max[i][j]=sc.nextInt();
	}
}
System.out.println("enter the alloc matrix/n");
for(int i=0;i<p;i++){
	for(int j=0;j<r;j++)
	{
		alloc[i][j]=sc.nextInt();
	}
}
System.out.println("enter the alloc matrix/n");
	for(int j=0;j<r;j++)
	{
		avail[0][j]=sc.nextInt();
	}
for(int i=0;i<p;i++){
	for(int j=0;j<r;j++)
	{
		need[i][j]=max[i][j]-alloc[i][j];
	}
}
obj.algo();
}
public void algo(){
for(int i=0;i<p;i++){
	for(int j=0;j<r;j++)
	{
		if(need[i][j]<=avail[0][j])
		{
			continue;
	}
        flag=0;
	}
	for(int j=0;j<r;j++)
	{
		if(flag==0 && need[i][j]!=100){
			avail[0][j]=avail[0][j]+alloc[i][j];
			need[i][j]=100;
		}
		else {
			continue;
	}
}
}
for(int i=0;i<p;i++){
	for(int j=0;j<r;j++)
	{
		if(need[i][j]==100){
			System.out.println("safe state");
		}
	}
}

}
}
