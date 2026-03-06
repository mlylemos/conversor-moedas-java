package conversordemoedas;

public class ConversorMoeda {
    ApiExchange api = new ApiExchange();

    public double converter(String moeda1, String moeda2, double valor) {
        double taxa = api.obterTaxa(moeda1, moeda2);
        return valor * taxa;
    }
}
