public class AdapterAmericanToBr extends TomadaBrasileira {

    public String conecta(PlugAmericano plug) {
        return plug.obtemEnergia() + this.getNomeRede();
    }

    //Implementar todos os métodos que precisam ser modificados da tomada para o plug americano
}
