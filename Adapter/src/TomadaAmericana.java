public class TomadaAmericana extends Tomada<PlugAmericano> {

    @Override
    public String conecta(PlugAmericano plug) {
        return plug.obtemEnergia() + this.getNomeRede();
    }

    @Override
    public String getNomeRede() {
        return "Tomada Americana";
    }

}
