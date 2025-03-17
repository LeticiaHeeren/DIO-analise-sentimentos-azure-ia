package projetoDIO.santander_dev_week;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import projetoDIO.santander_dev_week.model.Produto;
import projetoDIO.santander_dev_week.model.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SantanderDevWeekApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    // Teste básico para verificar se o contexto da aplicação é carregado corretamente
    @Test
    void contextLoads() {
        // Este teste verifica se o contexto do Spring é carregado sem erros
    }

    // Teste para verificar o endpoint de listagem de produtos
    @Test
    public void testGetProdutos() {
        ResponseEntity<Produto[]> response = restTemplate.getForEntity("/produtos", Produto[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    // Teste para verificar o endpoint de cadastro de usuário
    @Test
    public void testCadastroUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Teste Usuário");
        usuario.setEmail("teste@example.com");
        usuario.setSenha("senha123");

        ResponseEntity<String> response = restTemplate.postForEntity("/auth/cadastro", usuario, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Usuário cadastrado com sucesso!", response.getBody());
    }

    // Teste para verificar o endpoint de login de usuário
    @Test
    public void testLoginUsuario() {
        Usuario usuario = new Usuario();
        usuario.setEmail("teste@example.com");
        usuario.setSenha("senha123");

        ResponseEntity<String> response = restTemplate.postForEntity("/auth/login", usuario, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Login bem-sucedido!", response.getBody());
    }

    // Teste para verificar o endpoint de adicionar produto ao carrinho
    @Test
    public void testAdicionarAoCarrinho() {
        Produto produto = new Produto();
        produto.setId(1L);
        produto.setNome("Notebook Gamer");
        produto.setDescricao("Notebook potente para jogos");
        produto.setPreco(5500.0);
        produto.setQuantidade(10);

        ResponseEntity<String> response = restTemplate.postForEntity("/carrinho/adicionar", produto, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Produto adicionado ao carrinho!", response.getBody());
    }

    // Teste para verificar o endpoint de listagem do carrinho
    @Test
    public void testVerCarrinho() {
        ResponseEntity<Produto[]> response = restTemplate.getForEntity("/carrinho", Produto[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    // Teste para verificar o endpoint de finalizar compra
    @Test
    public void testFinalizarCompra() {
        ResponseEntity<String> response = restTemplate.postForEntity("/carrinho/finalizar", null, String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Compra finalizada com sucesso!", response.getBody());
    }
}