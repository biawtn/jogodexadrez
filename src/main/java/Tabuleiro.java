class Tabuleiro
{
    private String[][] casas = new String[8][8];

    public Tabuleiro()
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.casas[i][j] = "   ";
            }
        }
    }
}