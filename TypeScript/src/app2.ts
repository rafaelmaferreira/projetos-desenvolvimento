let nome:string = "Ana";
let idade2:number = 19;
let eMaior: boolean;

if (idade > 17) {
  eMaior = true;
} else {
  eMaior = false;
}

let lista:string[] = ["verde", "azul"];
let listaNumeros: Array<number> = [79,76,76];

enum Cor {vermelho=2, azul, laranja};

let c:Cor = Cor.azul;

console.log(c);
console.log(Cor[4]);

let aux:any;
aux="teste";
aux=1;
aux=[43,35];

let arrayAny:any[] = [43,"teste",{}];

function listaNomes(lista:string[]){
  console.log(lista);
}
