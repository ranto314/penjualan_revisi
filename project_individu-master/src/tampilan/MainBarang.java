package tampilan; 

public class MainBarang {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Barang form = new Barang();
            form.setVisible(true);
        });
    }
}