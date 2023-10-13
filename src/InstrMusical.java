abstract class InstrMusical implements Usuario {
    private String tipo, marca ;
    private int modelo;
    private float valor;
    private boolean novo;


    //construtor

    public InstrMusical(String tipo, String marca, int modelo, float valor, boolean novo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.novo = novo;
    }


    // Getters e Setters


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }


}

class Bateria extends InstrMusical {
    public Bateria(String tipo, String marca, int modelo, float valor, boolean novo) {
        super(tipo,marca, modelo, valor, novo);
    }

    @Override
    public String tocar() {
        return "x--o--x--o";
    }
}

class Guitarra extends InstrMusical {
    public Guitarra(String tipo, String marca, int modelo, float valor, boolean novo) {
        super(tipo, marca, modelo, valor, novo);
    }

    @Override
    public String tocar() {
        return "Dó, Ré, Mi, Fá, Sol, Lá, Si";
    }
}

