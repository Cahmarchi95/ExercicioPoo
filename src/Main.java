import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InstrMusical> instrumentos = new ArrayList<>();
        instrumentos.add(new Bateria("Percussão","Ludwig",1000,3000,true));
        instrumentos.add(new Guitarra("Elétrica","Ibanez",60,5379,true));
        instrumentos.add(new Guitarra("Acústica","Tagima",77,500,false));
        instrumentos.add(new Bateria("Percussão","DW Drums",29,1000,false));
        instrumentos.add(new Guitarra("Acústica","Yamaha",51,1250,false));
        instrumentos.add(new Guitarra("Elétrica","Fender",512,1817,true));

        System.out.println("Todos os instrumentos da lista:");

        instrumentos.forEach(instrMusical -> System.out.println("Tipo: " + instrMusical.getTipo() +
                " Marca: " + instrMusical.getMarca() +
                " Modelo: " + instrMusical.getModelo() +
                " Valor: R$ " + instrMusical.getValor() +
                " É novo?: " + instrMusical.isNovo()));

        System.out.println("---------------------------------------------------------------------------------------------------------------------");


        System.out.println("Guitarras da lista");
        List<Guitarra> guitarras = instrumentos.stream()
                .filter(instrMusical -> instrMusical instanceof Guitarra)
                .map(instrMusical -> (Guitarra) instrMusical)
                .toList();

        guitarras.forEach(guitarra -> System.out.println("tipo: " + guitarra.getTipo() + " marca: " + guitarra.getMarca() + " modelo: " + guitarra.getModelo() + " valor: R$ " + guitarra.getValor() + " é novo?: " + guitarra.isNovo() + " som: " + guitarra.tocar()));

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Guitarras usadas");
        List<Guitarra> guitarrasUsadas = instrumentos.stream()
                .filter(instrMusical -> instrMusical instanceof Guitarra )
                .map(instrMusical -> (Guitarra) instrMusical)
                .filter(guitarra -> !guitarra.isNovo())
                .toList();
        guitarrasUsadas.forEach(guitarra -> System.out.println("tipo: " + guitarra.getTipo() + " marca: " + guitarra.getMarca() + " modelo: " + guitarra.getModelo() + " valor: R$ " + guitarra.getValor()));

        System.out.println("--------------------------------------------------------------------------------------------------------------------");



        double mediaValor = instrumentos.stream()
                .filter(instrMusical -> instrMusical instanceof Bateria)
                .mapToDouble(InstrMusical::getValor)
                .average()
                .orElse(0.0);

        System.out.println("Média do valor das baterias: R$ " + mediaValor);

    }
}