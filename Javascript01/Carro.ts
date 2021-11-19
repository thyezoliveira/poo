export interface Passageiro {
    nome: string;
    genero: string;
}

export class Carro {
    #marca: string; 
    #modelo: string; 
    #combustivel: number = 100;
    #velocidade: number = 0;
    #velMaxima: number = 80;
    #passageiros: object[] = [];

    constructor(marca: string, modelo: string){
        this.#marca = marca;
        this.#modelo = modelo;
    }

    acelera(): void {
        if(this.#combustivel > 0){
            if(this.#velocidade < this.#velMaxima){
                this.#velocidade = this.#velocidade + 10;             
            } else {
                this.#velocidade = this.#velMaxima;
            }

            this.#combustivel -= 10;
        } else {
            this.#velocidade = 0;
            console.log("<< Combustível esgotado! >> !!!")
        }
    }

    parar(): void {
        this.#velocidade = 0;
    }

    setNovoPassageiro(passageiro: Passageiro): void { 
        this.#passageiros.push(passageiro);
        console.log(`${passageiro.nome} entrou no veículo.`)
    }

    getVelocidade(): number {
        return this.#velocidade;
    }
    getMarca(): string {
        return this.#marca;
    }
    getModelo(): string {
        return this.#modelo;
    }

    getPassageiros(): object[] {
        return this.#passageiros;
    }

    getCombustivel(): number {
        return this.#combustivel;
    }

    getPainelDoCarro(): string {
        return "Velocidade:" + this.#velocidade + " | " + "Combustível: " + this.#combustivel;
    }

    getInfo(): object {
        return {
            marca: this.getMarca(), 
            modelo: this.getModelo(), 
            vel: this.getVelocidade(),
            combustivel: this.getCombustivel(),
            passageiros: this.getPassageiros(),
        }
    }
}