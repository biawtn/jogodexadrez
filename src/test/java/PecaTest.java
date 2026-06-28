import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class PecaTest
{
    @Test
    void verificarRei()
    {
        Rei rei = new Rei("K0b");
        assertNotNull(rei);
    }

    @Test
    void verificarRainha()
    {
        Rainha rainha = new Rainha("Q0b");
        assertNotNull(rainha);
    }

    @Test
    void verificarTorre()
    {
        Torre torre = new Torre("T1b");
        assertNotNull(torre);
    }

    @Test
    void verificarBispo()
    {
        Bispo bispo = new Bispo("B1b");
        assertNotNull(bispo);
    }

    @Test
    void verificarCavalo()
    {
        Cavalo cavalo = new Cavalo("H1b");
        assertNotNull(cavalo);
    }

    @Test
    void verificarPeao()
    {
        Peao peao = new Peao("P1b");
        assertNotNull(peao);
    }

    @Test
    void verificarTabuleiro()
    {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertNotNull(tabuleiro);
    }
}