public class fibonacci {
    public static void main(String[] args) {
        int num = 5; //i.e., we want sum upto specified place in fibonacci series(0,1,1,2,3,5,...)
        int firstTerm = 0, secondTerm =1; 
        int sum =0, i=0;
        while(i!=num) {
            sum += firstTerm;
            System.out.print(firstTerm +" ");
            int nextTerm = firstTerm+secondTerm; 
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;
        }

        System.out.println();
        System.out.println("Sum = "+sum);


    }
}
