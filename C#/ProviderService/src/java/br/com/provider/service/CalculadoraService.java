package br.com.provider.service;
import javax.jws.WebService;
import br.com.provider.business.CalculadoraBusiness;
/**
* Classe de Serviço - CalculadoraService
* @author robsonfernandes
*/
@WebService(endpointInterface="br.com.provider.service.ICalculadoraService")
public class CalculadoraService implements ICalculadoraService{
@Override
public double somar(double a, double b) {
return new CalculadoraBusiness().somar(a,b);
}
@Override
public double subtrair(double a, double b) {
return new CalculadoraBusiness().subtrair(a,b);
}
}