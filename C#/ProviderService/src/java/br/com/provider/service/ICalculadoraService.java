package br.com.provider.service;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
* Interface de Serviço - ICalculadoraService
* @author robsonfernandes
*/
@WebService
public interface ICalculadoraService {
/**
* Contrato - somar
*/
@WebMethod public double somar(double a, double b);
/**
* Contrato – subtrair
*/
@WebMethod public double subtrair(double a, double b);
}