package leiloes;

import lances.LancesPages;
import login.LoginPage;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LeiloesTest {

    private LeiloesPage paginaDeLeiloes;

    @AfterEach
    public void afterEach() {
        this.paginaDeLeiloes.fechar();
    }

    @Test
    public void deveriaCadastrarLeilao(){
        LoginPage paginaDeLogin = new LoginPage();

        paginaDeLogin.preencherFormularioDeLogin("fulano", "pass");

        this.paginaDeLeiloes = paginaDeLogin.efetuarLogin();

        CadastroLeilaoPage paginaDeCadastro = paginaDeLeiloes.carregarFormulario();

    }


}

