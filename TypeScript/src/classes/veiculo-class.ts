import {IVeiculo} from '../interfaces/veiculo-interface'

class Veiculo implements IVeiculo {
  constructor (public titulo:string = "Nome Carro",public rodas:number = 2,) {
  this.titulo = titulo;
  this.rodas = rodas;
  }

  getTitulo():string{
  return this.titulo;
  }

  getRodas():number{
  return this.rodas;
  }
}

export {Veiculo}
