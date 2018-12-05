package Visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public class VisiteurDeRegimeVegetarien implements VisiteurDeRegime{
	public boolean visit(Agneau Agneau) {
		return false;
	}
	public boolean visit(Boeuf boeuf) {
		return false;
	}
	public boolean visit(Crevette crevette) {
		return false;
	}
	public boolean visit(Fromage fromage) {
		return false;
	}
	public boolean visit(Oignon oignon) {
		return true;
	}
	public boolean visit(Salade salade) {
		return true;
	}
	public boolean visit(Sauce sauce) {
		return true;
	}
	public boolean visit(Thon thon) {
		return false;
	}
	public boolean visit(Tomate tomate) {
		return true;
	}
	public boolean visit(Assiette assiette) {
		return true;
	}
}
