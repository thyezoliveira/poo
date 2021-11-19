"use strict";
var __classPrivateFieldSet = (this && this.__classPrivateFieldSet) || function (receiver, state, value, kind, f) {
    if (kind === "m") throw new TypeError("Private method is not writable");
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a setter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot write private member to an object whose class did not declare it");
    return (kind === "a" ? f.call(receiver, value) : f ? f.value = value : state.set(receiver, value)), value;
};
var __classPrivateFieldGet = (this && this.__classPrivateFieldGet) || function (receiver, state, kind, f) {
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a getter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot read private member from an object whose class did not declare it");
    return kind === "m" ? f : kind === "a" ? f.call(receiver) : f ? f.value : state.get(receiver);
};
var _Carro_marca, _Carro_modelo, _Carro_combustivel, _Carro_velocidade, _Carro_velMaxima, _Carro_passageiros;
Object.defineProperty(exports, "__esModule", { value: true });
exports.Carro = void 0;
class Carro {
    constructor(marca, modelo) {
        _Carro_marca.set(this, void 0);
        _Carro_modelo.set(this, void 0);
        _Carro_combustivel.set(this, 100);
        _Carro_velocidade.set(this, 0);
        _Carro_velMaxima.set(this, 80);
        _Carro_passageiros.set(this, []);
        __classPrivateFieldSet(this, _Carro_marca, marca, "f");
        __classPrivateFieldSet(this, _Carro_modelo, modelo, "f");
    }
    acelera() {
        if (__classPrivateFieldGet(this, _Carro_combustivel, "f") > 0) {
            if (__classPrivateFieldGet(this, _Carro_velocidade, "f") < __classPrivateFieldGet(this, _Carro_velMaxima, "f")) {
                __classPrivateFieldSet(this, _Carro_velocidade, __classPrivateFieldGet(this, _Carro_velocidade, "f") + 10, "f");
            }
            else {
                __classPrivateFieldSet(this, _Carro_velocidade, __classPrivateFieldGet(this, _Carro_velMaxima, "f"), "f");
            }
            __classPrivateFieldSet(this, _Carro_combustivel, __classPrivateFieldGet(this, _Carro_combustivel, "f") - 10, "f");
        }
        else {
            __classPrivateFieldSet(this, _Carro_velocidade, 0, "f");
            console.log("<< Combustível esgotado! >> !!!");
        }
    }
    parar() {
        __classPrivateFieldSet(this, _Carro_velocidade, 0, "f");
    }
    setNovoPassageiro(passageiro) {
        __classPrivateFieldGet(this, _Carro_passageiros, "f").push(passageiro);
        console.log(`${passageiro.nome} entrou no veículo.`);
    }
    getVelocidade() {
        return __classPrivateFieldGet(this, _Carro_velocidade, "f");
    }
    getMarca() {
        return __classPrivateFieldGet(this, _Carro_marca, "f");
    }
    getModelo() {
        return __classPrivateFieldGet(this, _Carro_modelo, "f");
    }
    getPassageiros() {
        return __classPrivateFieldGet(this, _Carro_passageiros, "f");
    }
    getCombustivel() {
        return __classPrivateFieldGet(this, _Carro_combustivel, "f");
    }
    getPainelDoCarro() {
        return "Velocidade:" + __classPrivateFieldGet(this, _Carro_velocidade, "f") + " | " + "Combustível: " + __classPrivateFieldGet(this, _Carro_combustivel, "f");
    }
    getInfo() {
        return {
            marca: this.getMarca(),
            modelo: this.getModelo(),
            vel: this.getVelocidade(),
            combustivel: this.getCombustivel(),
            passageiros: this.getPassageiros(),
        };
    }
}
exports.Carro = Carro;
_Carro_marca = new WeakMap(), _Carro_modelo = new WeakMap(), _Carro_combustivel = new WeakMap(), _Carro_velocidade = new WeakMap(), _Carro_velMaxima = new WeakMap(), _Carro_passageiros = new WeakMap();
