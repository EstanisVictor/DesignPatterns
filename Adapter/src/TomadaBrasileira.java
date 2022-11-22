public class TomadaBrasileira extends Tomada<PlugBrasileiro> {

    @Override
    public String conecta(PlugBrasileiro plug) {
        return plug.obtemEnergia() + this.getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "Tomada Brasileira";
    }

}
