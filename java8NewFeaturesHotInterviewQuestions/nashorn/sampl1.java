package java8NewFeaturesHotInterviewQuestions.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class sampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
         ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
         String name = "used nashorn to execute javascript in the java env";
         Integer result = null;
         try{
             nashorn.eval("print('" + name + "')");
             result = (Integer) nashorn.eval("10 + 2");
         } catch (ScriptException e) {
             System.out.println("execute script failed " + e.getMessage());
	     }
    }
}
