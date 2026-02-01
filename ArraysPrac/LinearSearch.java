import java.util.Scanner;

public class LinearSearch{

    public static int linearSearch(int num[],int key){
for(int i=0;i<num.length;i++){
    if(num[i]==key){
        return i;
    }
}
return -1;
    }
    
    public static void main(String args[]){
        int numbers[]={2,3,4,5,6,8};
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        System.out.print("Enter the key you want to find his index");
int index=linearSearch(numbers, key);
if(index== (-1)){
    System.out.print("key is not found");
}else{
    System.out.print("the key is found at index "+ index);
}
    }
}