package br.com.projetoDAO.DAO;

import br.com.projetoDAO.model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaDAOTest {

    Pessoa p,p1, p2, p3;

    public PessoaDAOTest() {
        p = new Pessoa("Sandra", "Teacher");
        p1 = new Pessoa(5,"Andre", "Estagiario");
        p2 = new Pessoa(1,"Karinne", "Eng. de Software");
        p3 = new Pessoa(6);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes da classe");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Depois da classe");
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConsulta() {
        System.out.println("consulta");
        PessoaDAO instance = new PessoaDAO();
//        if(instance.consulta())
//            System.out.println("Teste ok");
//        else
//        fail("Erro no teste de consulta");

        assertTrue(instance.consulta());
        //assertEquals("Teste falhou", false, instance.consulta());
    }

    /*@Test
    public void testInserir() {
        System.out.println("inserir");
        PessoaDAO pd = new PessoaDAO();
        assertTrue(pd.inserir(p));

    }*/
    
//    @Test
//    public void testUpdate(){
//        System.out.println("atualizar");
//        PessoaDAO pd = new PessoaDAO();
//        assertTrue(pd.update(p2));
//    }
    
    @Test 
    public void testDelete(){
        System.out.println("deletar");
        PessoaDAO pd = new PessoaDAO();
        assertTrue(pd.delete(p3));
    }

}
