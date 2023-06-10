import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 
 * @author Suchitra
 * String abc = " 10 + 5/45-2"; Calculate this
 *
 */
public class StringToInteger
{
	public static void main(String[] args)
	{
		String abc = " 10 + 5 / 45- 2 ";
		abc= abc.trim();//Remove leading and trailing spaces
		String expression =abc.replaceAll("\\s+", "");
		
		//Evaluate the expression
		double result = evaluateExpression(expression);
		System.out.println(result);
		
	}
	public static double evaluateExpression(String expression)
	{
		try
		{
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			 return (double)engine.eval(expression);
			
		} catch (ScriptException e)
		{
			e.printStackTrace();
			return Double.NaN;
		}
	}

}
