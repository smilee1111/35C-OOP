public class IfStatement {
    public static void main(String[] args) {
    //     /*Simple if statement, takes conditionexpression with boolean valur */
    //     if(true){
    //         System.out.println("True Statement");
    //     }
    //     if(false){
    //         System.out.println("Skipped statement");
    //     }else{
    //         System.out.println("False statement");
    //     }                                                                                                                                                                               
    //     /*If condition fails, goes to else block/scope */
    //     int num1=10,num2=20;
    //     if(num1>num2){
    //         System.out.println("Num1 is greater");
    //     }
    //     else{
    //         System.out.println("Num2 is greater");
    //     }
    //     /*is else if */
    //     int iNum1=10,iNum2=10;
    //     if(iNum1==iNum2){
    //         System.out.println("Equal number");
    //     }
    //     else if(iNum1>iNum2){
    //         System.out.println("inum1 is greater");
    //     }else{
    //         System.out.println("inum2 is greater.");
    //     }
    //     /*Note that else should be at the last of the if statement */
    //     /*If Else If ladder, more that one else if*/
    //     if(iNum1<0){
    //         System.out.println("iNum1 is negative");
    //     }
    //     else if(iNum2<0){
    //         System.out.println("iNum2 is negative.");
    //     }
    //     else if(iNum1==iNum2){
    //         System.out.println("Equal number");
    //     }
    //     else if(iNum1<iNum2){
    //         System.out.println("iNum1 is less");
    //     }
    //     else{
    //         System.out.println("Default execution is all fails");
    //     }
    //     /*Note that else is not mandatory and can be skipped. */
    //     /*Nested if statement */
    // int nNum1=-10, nNum2=20;
    // if(nNum1<0){
    //     if (nNum1>nNum2){
    //         System.out.println("nNum1 is negative and greater.");
    //     }
    //     else{
    //         System.out.println("nNum1 is negative and lesser.");
    //     }
    //     }
    
    // else{
    //     if(nNum1>nNum2){
    //         System.out.println("nNum1 is positive and greater.");
    //     }
    //     else{
    //         System.out.println("nNum1 is positive and lesser.");
    //     }
    // }
     /*Task
     * iven the value below. add the total and take the average
     * if any of the marking is less than 35, print "Fail"
     * if average is less than 60, print "3rd div"
     * if average is less than 70, print "2nd div"
     * if average is less than 80, print "1st div"
     * is averag is greater than or equal to 80. print "distinction" 
     */
    int math=38,science=60, english=35;
    /* make total variable and average variable */
    int total,avg;
    total=(math+science+english);
    avg=total/3;
    if(math<35 || science<35 || english<35){
        System.out.println("Fail");
    }
    else{
        if(avg<60){
            System.out.println("3rd div");
        }
        else if(avg<70){
            System.out.println("2nd div");
        }
        else if(avg<80){
            System.out.println("1st div");
        }
        else if(avg>=80){
            System.out.println("Distinction");
        }

    }
   
    }
    
   
    
}
