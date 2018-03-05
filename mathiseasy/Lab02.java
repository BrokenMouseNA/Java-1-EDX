import comp102x.IO;

public class Lab02
{

    public static void multiply()
    {
        // Please write your code after this line
        float xInput;
        float yInput;
        float answer;
        IO.output("Please enter x: ");
        xInput = IO.inputFloat();
        IO.output("Please enter y: ");
        yInput = IO.inputFloat();
        answer = xInput * yInput;
        
        IO.outputln("Your answer is " + answer);
             
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        float widthInput;
        float heightInput;
        float answer;
        
        IO.output("Enter the width of the triangle: ");
        widthInput = IO.inputFloat();
        IO.output("Enter the height of the triangle: ");
        heightInput = IO.inputFloat();
        answer = (widthInput * heightInput) / 2;
        
        IO.outputln("The area of the triangle is: " + answer);
        
        
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        //No scanner was used. Just a simple solution.
        float a, b, c;
       
        double firstSolution,secondSolution, x, discrim;
        IO.output("Enter a:");
        
        a = IO.inputFloat();
        
        IO.output("Enter b:");
        
        b = IO.inputFloat();
        
        IO.output("Enter c:");
        
        c = IO.inputFloat();
        
        //Find the discriminate
        
        discrim = b*b -4*a*c;
        
        //Calculate both sets
        
        firstSolution = ( - b + Math.sqrt(discrim))/(2*a);
        
        secondSolution = (- b - Math.sqrt(discrim))/(2*a);
        
        //Output
        IO.outputln("Fist solution for x: " +firstSolution);
        
        IO.outputln("Second solution for x: " +secondSolution);
        
        
        
        
    }
}
