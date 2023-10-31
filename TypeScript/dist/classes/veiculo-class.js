"use strict";
exports.__esModule = true;
var Veiculo = (function () {
    function Veiculo(titulo, rodas) {
        if (titulo === void 0) { titulo = "Nome Carro"; }
        if (rodas === void 0) { rodas = 2; }
        this.titulo = titulo;
        this.rodas = rodas;
        this.titulo = titulo;
        this.rodas = rodas;
    }
    Veiculo.prototype.getTitulo = function () {
        return this.titulo;
    };
    Veiculo.prototype.getRodas = function () {
        return this.rodas;
    };
    return Veiculo;
}());
exports.Veiculo = Veiculo;
