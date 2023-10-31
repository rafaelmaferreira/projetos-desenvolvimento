package br.com.provider.business;
/**
* Classe de Negócio - CalculadoraBusiness
* @author robsonfernandes
*/
public class CalculadoraBusiness implements ICalculadoraBusiness {
@Override
public double somar(double a, double b) {
return a + b;
}
@Override
public double subtrair(double a, double b) {
return a - b;
}
}