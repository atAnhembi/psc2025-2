package exe1;

public class Carro {
    private String marca, modelo;
    private double tanque, consumo, km;

    public Carro(String marca, String modelo, double tanque, double consumo, double km) {
        if (marca != null && marca.length() > 0) {
            this.marca = marca;
        } else {
            this.marca = "Não informado";
        }
        if (modelo != null && modelo.length() > 0) {
            this.modelo = modelo;
        } else {
            this.modelo = "Não informado";
        }
        if (tanque > 0) {
            this.tanque = tanque;
        }
        if (consumo > 0) {
            this.consumo = consumo;
        }
        if (km > 0) {
            this.km = km;
        }
    }

    public Carro(String marca, String modelo, double consumo) {
        // if(marca == null || marca.length() == 0 ||
        // modelo == null || modelo.length() == 0 ||
        // consumo < 0 ){
        // throw new RuntimeException("Parâmetros inválidos");
        // }
        if (marca == null || marca.length() == 0) {
            throw new RuntimeException("Marca inválida");
        }
        if (modelo == null || modelo.length() == 0) {
            throw new RuntimeException("Modelo inválido");
        }
        if (consumo < 0) {
            throw new RuntimeException("Consumo inválido");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTanque() {
        return tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getKm() {
        return km;
    }


    public void abastecer(double litros) {
        if(litros > 0) {
            tanque += litros;
        }
    }

    public boolean andar(double km) {
        double combustivelGasto = km / consumo;
        if(tanque >= combustivelGasto) {
            tanque -= combustivelGasto;
            this.km += km;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", tanque=" + tanque + ", consumo=" + consumo + ", km="
                + km + "]";
    }

}
