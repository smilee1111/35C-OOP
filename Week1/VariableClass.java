public class VariableClass {
    /*Instance Variable
     * Needs object to access
     * not shared in multiple object 
     */
    int instanceVariable=10;
    /*Static variable
     *No need onjects,can be accessed using Class
     shared in multiple object
     */
    static int staticVariable=100;
    public static void main(String[] args){
        /*Non Primitive Data Type */
        /*Declaration */
        byte byteVariable;
        /*Initialization */
        byteVariable=100;
        /*Declaration and Initialization */
        short shortVariable=1000;
        /*Multiple Declaration */
        int intVariable1,intVariable2;
        /*Initialization */
        intVariable1=10;
        intVariable2=-10;
        /*Multiple Declaration and Initialization */
        long longVariable1=100000, longVariable2=-199999;
        float floatVariable=1.89f; // the letter 'f' is required
        double doubleVariable= 189.8923d; // the letter 'd' is optional
        char charVariable ='c' ;// Single letter enclosed in single quotation
        boolean booleanVariable=true; // small case true/false
        /*Illegal actions */
        // byte byteVariable=20; // cannot redeclare a variable 
        //byteVariable =30; // instead use reassignment
        //boolean boolVar2='false'; // should match the exact datatype
        //byte byteVariable2=100000; //cannot exceed min or max
         /*Non-primitive data type */
         String stringVariable="This is a string"; //use double quotation""
         /* Or use the Class */
         String stringVariable2=new String("String using class");
         /*Class/Object */
         VariableClass variableObject=new VariableClass();
         /* Use the same class Name as specified in public class <ClassName> */
         /*Need object to access instance variable */
         System.out.println(variableObject.instanceVariable);
         /*Can access static variable with Class only/ no object needed */
         System.out.println(VariableClass.staticVariable);

         /*Type casting */
         int intVariableConvert=10;
         double intVariableConvertToVariable=intVariableConvert;
         /*Explicit casting */
         double doubleVariableConvert=100.29;
         int doubleVariableConvertToInt=(int) doubleVariableConvert;
         
    }
}
