package Principal;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIS fis = FIS.load("logica.fcl", true);
		FunctionBlock fb = fis.getFunctionBlock(null);
		
		fb.setVariable("fazExercicio", 80.0);
		fb.setVariable("comeForaDeHora", 1.0);
		
		fb.evaluate();
		
		double fatorAtividade = fb.getVariable("fatorAtividade").getValue();
		System.out.println("Saída: " + fatorAtividade);
		JFuzzyChart.get().chart(fb);
	}

}
