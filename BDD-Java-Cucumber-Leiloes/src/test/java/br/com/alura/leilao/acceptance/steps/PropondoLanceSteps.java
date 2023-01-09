package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PropondoLanceSteps {

    private Lance lance;
    private Leilao leilao;
    private ArrayList<Lance> lista;

    @Before
    public void setup() {
        this.lista = new ArrayList<Lance>();
        leilao = new Leilao("Tablet XPTO");

    }

    @After
    public void tearDown() {
    }

    @Dado("um lance valido")
    public void dado_um_lance_valido() {

        Usuario usuario = new Usuario("fulano");
        lance = new Lance(usuario, BigDecimal.TEN);
    }

    @Quando("propoe ao lance")
    public void quando_propoe_um_lance() {
        leilao.propoe(lance);
    }

    @Entao("o lance e aceito")
    public void entao_o_lance_e_aceito() {
        Assert.assertEquals(1, leilao.getLances().size());
        Assert.assertEquals(BigDecimal.TEN, leilao.getLances().get(0).getValor());
    }

    @Dado("um lance de {double} reais pelo o usuario {string}")
    public void um_lance_de_reais_do_usuario_fulano(Double valor, String nomeUsuario) {
        Lance lance = new Lance(new Usuario(nomeUsuario), new BigDecimal(valor));

        lista.add(lance);
    }

    @Quando("propoe varios lances ao leilao")
    public void propoe_varios_lances_ao_leilao() {
        this.lista.forEach(lance -> leilao.propoe(lance));
    }

    @Entao("os lances sao aceitos")
    public void os_lances_sao_aceitos() {

        Assert.assertEquals(this.lista.size(), leilao.getLances().size());
        Assert.assertEquals(this.lista.get(0).getValor(), leilao.getLances().get(0).getValor());
        Assert.assertEquals(this.lista.get(1).getValor(), leilao.getLances().get(1).getValor());

    }

    @Dado("um lance invalido de {double} reais e do usuario {string}")
    public void um_lance_invalido_de_reais(Double valor, String nomeUsuario) {
       this.lance = new Lance(new BigDecimal(valor));
    }

    @Entao("os lances não é aceito")
    public void os_lances_não_aceitos() {
        Assert.assertEquals(0, leilao.getLances().size());
    }



}