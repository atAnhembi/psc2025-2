package exercicio01;
/* 
 Faça uma classe que simule algumas funções de uma televisão.
 Deve ser possível trocar o número do canal e alterar o volume (+/-).

 Garanta que o canal e o volume estejam sempre dentro da faixa de valores:

 0 <= volume <= 100
 0 < canal <= 20 (só canal aberto ;-) )
 
*/

public class Televisao {
    private int canal, volume;

    public Televisao() {
        canal = 1;
    }

    public void setCanal(int canal) {
        if(canal > 0 && canal <= 20) {
            this.canal = canal;
        }
    }

    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void aumentarVolume() {
        if(volume <= 95) {
            volume += 5;
        }
    }

    public void diminuirVolume() {
        if(volume  >= 5) {
            volume -= 5;
        }
    }

    public void exibirDados() {
        System.out.println("TV no canal " + canal + " volume " + volume);
    }
}
