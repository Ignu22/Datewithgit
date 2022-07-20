import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr= new int[10];
        for(int i=0;i<=a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
    }
}